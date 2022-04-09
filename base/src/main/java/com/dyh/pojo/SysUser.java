package com.dyh.pojo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author pixel-revolve
 * @date 2022/4/7
 */
@Data
public class SysUser {

    private Long id;

    private String username;

    private String nickname;

    private String password;

    private String email;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
