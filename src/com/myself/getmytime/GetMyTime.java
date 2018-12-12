/**
 * 
 */
package com.myself.getmytime;

import java.io.IOException;

/**
 * @author likunpeng
 *
 */
public class GetMyTime {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("hello,world!");
		WebServer webServer = new WebServer(10080);
		webServer.start();
	}

}
