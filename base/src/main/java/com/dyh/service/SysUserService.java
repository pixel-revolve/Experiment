package com.dyh.service;

import com.dyh.model.Result;
import com.dyh.pojo.SysUser;

import java.util.List;

/**
 * @author pixel-revolve
 * @date 2022/4/7
 */
public interface SysUserService {

    /**
     * 添加用户
     *
     * @param sysUser 系统用户
     * @return {@code Result}
     */
    Result addUser(SysUser sysUser);

    /**
     * 删除用户
     *
     * @param id id
     * @return {@code Result}
     */
    Result deleteUser(Long id);

    /**
     * 更新用户
     *
     * @param sysUser 系统用户
     * @return {@code Result}
     */
    Result updateUser(SysUser sysUser);

    /**
     * 得到用户通过id
     *
     * @param id id
     * @return {@code Result<SysUser>}
     */
    Result<SysUser> getUserById(Long id);

    /**
     * 获取用户通过用户名
     *
     * @param name 名字
     * @return {@code Result<SysUser>}
     */
    Result<SysUser> getUserByUsername(String name);

    /**
     * 获得所有用户
     *
     * @return {@code Result<List<SysUser>>}
     */
    Result<List<SysUser>> getAllUser();


}
