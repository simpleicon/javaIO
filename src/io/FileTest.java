package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream("src\\iexplore.exe");
			bis = new BufferedInputStream(fis);
			int data = 0;
			int cnt = 1;
			while((data= bis.read())!=-1) { // 파일의 맨 마지막을 읽을때 -1 값이 나오게 된다.
				System.out.println((char)data+" "+cnt);
				cnt++;
			}
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} finally {
			try {
				if(bis != null) {
					bis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
