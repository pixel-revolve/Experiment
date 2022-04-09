create database if not exists `test`;

use `test`;

drop table if exists `sys_user`;

create table if not exists `sys_user` (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL unique ,
  `nickname` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `create_time` datetime NOT NULL default CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL on update CURRENT_TIMESTAMP default CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB
  DEFAULT CHARSET=utf8
  AUTO_INCREMENT=1;

insert into `sys_user`
  (`username`,`nickname`, `email`, `password`)
  values
  ('dyh','pixel-revolve', 'pixel-revolve@qq.com','123456'),
  ('dahuang','大黄', 'big-yellow@qq.com','123456'),
  ('xiaohaung','小黄', 'little-yellow@qq.com','123456'),
  ('xiaobai','小白', 'little-white@qq.com','123456');

select * from `sys_user`;