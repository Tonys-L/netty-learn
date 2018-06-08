package com.lt;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 功能：
 *
 * @author ：LT(286269159@qq.com)
 * @version ：2018 Version：1.0
 * @create ：2018-06-08 11:33:30
 */
public class TimeServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			int port = 11111;
			serverSocket = new ServerSocket(port);
			System.out.println("TimeServer 启动：" + port);
			while (true) {
				Socket socket = serverSocket.accept();
				new Thread(new TimeServerHandler(socket)).start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (serverSocket != null) {
				try {
					serverSocket.close();
					System.out.println("TimeServer关闭");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
