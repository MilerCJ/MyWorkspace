package com.demo.test;

import redis.clients.jedis.Jedis;

public class test {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		System.out.println("���ӳɹ�");
		System.out.println("�������������У�" + jedis.ping());
		//jedis.set("test01", "����");
        // ��ȡ�洢�����ݲ����
        System.out.println("redis �洢���ַ���Ϊ: "+ jedis.get("test01"));
	}
}
