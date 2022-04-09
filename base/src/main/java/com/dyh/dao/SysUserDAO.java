package com.dyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dyh.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author pixel-revolve
 * @date 2022/4/7
 */
@Mapper
public interface SysUserDAO extends BaseMapper<SysUser> {

    /**
     * 查询通过id
     *
     * @param id id
     * @return {@code SysUser}
     */
    SysUser queryById(Long id);

    /**
     * 查询通过用户名
     *
     * @param username 用户名
     * @return {@code SysUser}
     */
    SysUser queryByUsername(String username);

    /**
     * 查询所有
     *
     * @return {@code List<SysUser>}
     */
    List<SysUser> queryAll();

}
