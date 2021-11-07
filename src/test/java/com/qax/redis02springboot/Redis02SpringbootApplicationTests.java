package com.qax.redis02springboot;

import com.qax.redis02springboot.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Redis02SpringbootApplicationTests {

    @Autowired
    @Qualifier("redisTemplates")
    private RedisTemplate redisTemplate;

    @Test
    void useRedisTemplate() {
        User user = new User("yza",12);
        redisTemplate.opsForValue().set("user4",user);
    }

}
