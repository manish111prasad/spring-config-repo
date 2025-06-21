package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.example.demo.binding.Country;

@Configuration
public class RedisConfig {

	@Bean
	public JedisConnectionFactory jedisConn() {

		JedisConnectionFactory jedis = new JedisConnectionFactory();
		//Redis Server properties
		return jedis;
	}

	@Bean
	public RedisTemplate<String, Country> redisTemplate() {

		RedisTemplate<String, Country> rt = new RedisTemplate<>();
		//Set where is the Jedis Connection available
		
		rt.setConnectionFactory(jedisConn());
		return rt;
	}

}
