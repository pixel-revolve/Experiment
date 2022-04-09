package com.dyh.service.impl;


import com.dyh.dao.SysUserDAO;
import com.dyh.model.Result;
import com.dyh.model.ResultCode;
import com.dyh.pojo.SysUser;
import com.dyh.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pixel-revolve
 * @date 2022/4/7
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserDAO sysUserDAO;

    @Override
    public Result<SysUser> getUserByUsername(String username) {
        SysUser getUser=null;
        getUser=sysUserDAO.queryByUsername(username);
        if(getUser==null){
            return Result.failure(ResultCode.NOTFOUND,"无该用户名的用户");
        }
        return Result.success(getUser);
    }

    @Override
    public Result addUser(SysUser sysUser) {
        SysUser getUser=null;
        getUser=sysUserDAO.queryById(sysUser.getId());
        if(getUser!=null){
            return new Result(ResultCode.NOTFOUND,"用户名已存在");
        }
        try {
            sysUserDAO.insert(sysUser);
        }catch (Exception e){
            return new Result(ResultCode.RUNTIMEERROR,"添加失败");
        }
        return Result.success("添加成功");
    }

    @Override
    public Result deleteUser(Long id) {
        SysUser getUser=null;
        getUser=sysUserDAO.queryById(id);
        if(getUser==null){
            return Result.failure(ResultCode.NOTFOUND,"无该用户");
        }
        sysUserDAO.deleteById(getUser);
        return Result.success("删除用户成功");
    }

    @Override
    public Result updateUser(SysUser sysUser) {
        SysUser getUser=null;
        getUser=sysUserDAO.queryById(sysUser.getId());

        if(getUser==null){
            return Result.failure(ResultCode.NOTFOUND,"无该用户");
        }
        try{
            sysUserDAO.updateById(sysUser);
        }catch (Exception e){
            return Result.failure(ResultCode.RUNTIMEERROR,"修改用户失败");
        }

        return Result.success("修改成功");
    }

    @Override
    public Result getUserById(Long id) {
        SysUser getUser=null;
        getUser=sysUserDAO.queryById(id);
        if(getUser==null){
            return Result.failure(ResultCode.NOTFOUND,"无该id的用户");
        }
        return Result.success(getUser);
    }


    @Override
    public Result<List<SysUser>> getAllUser() {
        List<SysUser> userList=new ArrayList<>();

        userList=sysUserDAO.queryAll();

        if(userList==null){
            return Result.failure(ResultCode.NOTFOUND,"查询列表为空");
        }

        return Result.success(userList);
    }
}
