/*
 * Copyright (C) 2017 IFlyTek. All rights reserved.
 */
package com.example.common;

/**
 * <p>
 * <code>BaseController</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2018/5/22 14:24
 */
public class BaseController {
	/**
	 * 渲染失败数据
	 *
	 * @return result
	 */
	private JsonResult renderError() {
		JsonResult result = new JsonResult();
		result.setSuccess(false);
		result.setStatus("500");
		return result;
	}

	/**
	 * 渲染失败数据（带消息）
	 *
	 * @param msg 需要返回的消息
	 * @return result
	 */
	protected JsonResult renderError(String msg) {
		JsonResult result = renderError();
		result.setMsg(msg);
		return result;
	}

	/**
	 * 渲染成功数据
	 *
	 * @return result
	 */
	private JsonResult renderSuccess() {
		JsonResult result = new JsonResult();
		result.setSuccess(true);
		result.setStatus("200");
		return result;
	}

	/**
	 * 渲染成功数据（带信息）
	 *
	 * @param msg 需要返回的信息
	 * @return result
	 */
	protected JsonResult renderSuccess(String msg) {
		JsonResult result = renderSuccess();
		result.setMsg(msg);
		return result;
	}

	/**
	 * 渲染成功数据（带数据）
	 *
	 * @param obj 需要返回的对象
	 * @return result
	 */
	protected JsonResult renderSuccess(Object obj) {
		JsonResult result = renderSuccess();
		result.setObj(obj);
		return result;
	}
}
