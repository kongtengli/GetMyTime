package com.myself.getmytime;
import java.net.*;
import java.io.*;
public class WebServer {
	private ServerSocket serverSocket;
	
	public WebServer(int port) throws IOException{
		serverSocket = new ServerSocket(port);
		serverSocket.setSoTimeout(1000000);
	};
	
	public void start() throws IOException{
		Socket server = serverSocket.accept();
		System.out.println("远程主机地址：" + server.getRemoteSocketAddress());
		DataInputStream in = new DataInputStream(server.getInputStream());
        System.out.println(in.readUTF());
        DataOutputStream out = new DataOutputStream(server.getOutputStream());
        out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");
        server.close();
	}
}
