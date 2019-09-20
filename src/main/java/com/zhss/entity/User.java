package com.zhss.entity;

import com.zhss.anno.Entity;
import lombok.Data;

/**
 * @author: Lixh
 */
@Data
@Entity("aaa")
public class User {

    private int id;
    private String userName;
    private String password;
    private int status;
}
