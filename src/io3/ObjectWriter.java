package io3;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectWriter {

	public static void main(String[] args) {
		Chat chat = new Chat("id01", "james", "Hi man");
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("src\\chat.ser");
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			oos.writeObject(chat);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(oos!=null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
