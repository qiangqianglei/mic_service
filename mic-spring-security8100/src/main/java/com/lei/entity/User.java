package com.lei.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author leiqq
 */
@Data
@TableName("users")
public class User {

    private Integer id;
    private String username;
    private String password;

}
