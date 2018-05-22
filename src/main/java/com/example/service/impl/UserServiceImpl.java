/*
 * Copyright (C) 2017 IFlyTek. All rights reserved.
 */
package com.example.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.mapper.UserMapper;
import com.example.domain.User;
import com.example.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * <code>UserServiceImpl</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2018/5/22 12:13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>  implements IUserService {

}
