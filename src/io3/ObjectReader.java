package io3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		Chat result = null;
		
		try {
			fis = new FileInputStream("src\\chat.ser");
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			result = (Chat)ois.readObject();
			System.out.println(result);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(ois!=null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
