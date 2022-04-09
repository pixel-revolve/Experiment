package com.dyh.controller;

import com.dyh.model.Result;
import com.dyh.pojo.SysUser;
import com.dyh.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author pixel-revolve
 * @date 2022/4/7
 */
@RestController
@RequestMapping("/api/user")
public class SysUserController {

    @Resource
    SysUserService sysUserService;

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public Result addUser(@RequestBody SysUser sysUser){
        return sysUserService.addUser(sysUser);
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public Result updateUser(@RequestBody SysUser sysUser){
        return sysUserService.updateUser(sysUser);
    }

    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    public Result getAllUser(){
        return sysUserService.getAllUser();
    }

    @RequestMapping(value = "/getUserByUsername/{username}",method = RequestMethod.GET)
    public Result getUserByUsername(@PathVariable("username") String username){
        return sysUserService.getUserByUsername(username);
    }

    @RequestMapping(value = "/getUserById/{id}",method = RequestMethod.GET)
    public Result addUser(@PathVariable("id") Long id){
        return sysUserService.getUserById(id);
    }

    @RequestMapping(value = "/deleteUser/{id}",method = RequestMethod.GET)
    public Result deleteUser(@PathVariable Long id){
        return sysUserService.deleteUser(id);
    }


}
