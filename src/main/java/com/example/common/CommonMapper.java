/*
 * Copyright (C) 2017 IFlyTek. All rights reserved.
 */
package com.example.common;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * <code>CommonMapper</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2018/5/22 13:45
 */
public interface CommonMapper<T> extends BaseMapper<T> {
	// 这里可以写自己的公共方法、注意不要让 mp 扫描到误以为是实体 Base 的操作
}
