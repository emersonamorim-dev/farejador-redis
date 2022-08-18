package com.farejador.redis.farejador.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class Postar {

    private String postId;
    private String content;
    private String titulo;
    private Set<String> tags = new HashSet<>();
    private Integer views;

}
