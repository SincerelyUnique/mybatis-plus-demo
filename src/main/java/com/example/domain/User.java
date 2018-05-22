/*
 * Copyright (C) 2017 IFlyTek. All rights reserved.
 */
package com.example.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.example.common.BaseEntity;
import com.example.enums.TypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <p>
 * <code>User</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2018/5/22 12:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("sys_user")
public class User extends BaseEntity{

	//用户名
	private String name;

	//枚举测试
	private TypeEnum type;

	//用户年龄
	private Integer age;

	//自定义填充的创建时间
	@TableField(fill = FieldFill.INSERT)
	private Date ctime;
}
