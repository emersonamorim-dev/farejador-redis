package com.farejador.redis.farejador.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import redis.clients.jedis.JedisPooled;

@Data
@Configuration
@ConfigurationProperties(prefix = "redis")
public class RedisConfiguracao {

    private String host;
    private Integer port;

    @Bean
    JedisPooled jedisPooled() {
        return new JedisPooled(host, port);

    }

}
