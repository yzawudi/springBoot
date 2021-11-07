package com.qax.redis02springboot.bean;

import lombok.Data;

@Data
public class Account {
    private Long id;
    private String userId;
    private Integer money;
}
