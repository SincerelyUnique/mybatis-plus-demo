/*
 * Copyright (C) 2017 IFlyTek. All rights reserved.
 */
package com.example.controller;

import com.example.common.BaseController;
import com.example.domain.User;
import com.example.enums.TypeEnum;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 * <code>UserController</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2018/5/22 12:12
 */
@Controller
public class UserController extends BaseController {

	private final IUserService userService;

	@Autowired
	public UserController(IUserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/")
	public ModelAndView index(ModelAndView modelAndView) {
		modelAndView.setViewName("index");
		modelAndView.addObject("userList", userService.selectList(null));
		return modelAndView;
	}

	@RequestMapping("/preSave")
	public ModelAndView preSave(ModelAndView modelAndView, @RequestParam(value = "id", required = false) Long id) {
		modelAndView.setViewName("save");
		if (id != null) {
			modelAndView.addObject("user", userService.selectById(id));
		}
		return modelAndView;
	}

	@ResponseBody
	@RequestMapping("save")
	public Object save(User user) {
		user.setType(TypeEnum.DISABLED);
		if (user.getId() == null) {
			return userService.insert(user) ? renderSuccess("添加成功") : renderError("添加失败");
		} else {
			return userService.updateById(user) ? renderSuccess("修改成功") : renderError("修改失败");
		}
	}

	@ResponseBody
	@RequestMapping("/delete")
	public Object delete(@RequestParam(value = "id", required = false) Long id) {
		return userService.deleteById(id) ? renderSuccess("删除成功") : renderError("删除失败");
	}
}
