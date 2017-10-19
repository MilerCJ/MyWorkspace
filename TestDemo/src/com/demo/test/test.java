package com.demo.test;

import redis.clients.jedis.Jedis;

public class test {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		System.out.println("连接成功");
		System.out.println("服务器正在运行：" + jedis.ping());
		//jedis.set("test01", "孙子");
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: "+ jedis.get("test01"));
	}
}
