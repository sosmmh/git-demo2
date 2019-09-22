package com.zhss.entity;

import lombok.Data;

/**
 * @author: Lixh
 */
@Data
public class User {

    private int id;
    private String userName;
    private String password;
    private int status;
}
