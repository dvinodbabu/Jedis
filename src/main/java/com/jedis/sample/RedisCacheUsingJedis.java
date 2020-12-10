package com.jedis.sample;

import redis.clients.jedis.Jedis;


public class RedisCacheUsingJedis {

	public static void main(String[] args) {
		System.out.println("------------ Redis Demo --------------");
		Jedis jedis = new Jedis(); 
		System.out.println(jedis.get("title"));
		
	}

}
