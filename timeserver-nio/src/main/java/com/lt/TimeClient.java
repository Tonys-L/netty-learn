package com.lt;

/**
 * 功能：
 *
 * @author ：LT(286269159@qq.com)
 * @version ：2018 Version：1.0
 * @create ：2018-06-08 17:20:13
 */
public class TimeClient {
	public static void main(String[] args) {
		int port = 11111;
		new Thread(new TimeClientHandler("127.0.0.1", port), "TimeClient-001").start();
	}
}
