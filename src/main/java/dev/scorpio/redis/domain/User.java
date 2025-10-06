package dev.scorpio.redis.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Long id;
    private String name;

    public User() {
    }

    public User(Long userId, String s) {
        this.id = id;
        this.name = s;
    }
}
