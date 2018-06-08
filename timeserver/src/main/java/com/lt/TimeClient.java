package com.lt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 功能：
 *
 * @author ：LT(286269159@qq.com)
 * @version ：2018 Version：1.0
 * @create ：2018-06-08 11:53:12
 */
public class TimeClient {
	public static void main(String[] args) throws UnknownHostException {
		int port = 11111;
		try (Socket socket = new Socket("127.0.0.1", port);
			 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true)) {
			out.println("getTime");
			System.out.println("当前时间：" + in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
