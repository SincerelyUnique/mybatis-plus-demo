/*
 * Copyright (C) 2017 IFlyTek. All rights reserved.
 */
package com.example.enums;

import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

/**
 * <p>
 * <code>TypeEnum</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2018/5/22 12:31
 */
public enum TypeEnum  implements IEnum {

	DISABLED(0, "禁用"),
	NORMAL(1, "正常");

	private final int value;
	private final String desc;

	TypeEnum(final int value, final String desc) {
		this.value = value;
		this.desc = desc;
	}

	@Override
	public Serializable getValue() {
		return null;
	}

	// Jackson 注解为 JsonValue 返回中文 json 描述
	public String getDesc() {
		return this.desc;
	}
}
