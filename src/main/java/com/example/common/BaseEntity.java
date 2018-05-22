/*
 * Copyright (C) 2017 IFlyTek. All rights reserved.
 */
package com.example.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * <code>CommonEntity</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2018/5/22 13:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	//用户ID
	private Long id;
}
