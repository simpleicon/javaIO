package io2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyReader {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("src\\data2.txt");
			br = new BufferedReader(fr);
			int data = 0;
			while ((data = br.read())!= -1) {
				System.out.println((char)data+" ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
