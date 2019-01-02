package io2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyWriter {
	public static void main(String[] args) {
		Writer fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("src\\data2.txt");
			bw = new BufferedWriter(fw);
			for (int i = 65; i < 75; i++) {
				bw.write(i);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally{
			if(bw != null) { //메인스트림과 보조스트림이 같이 있을경우 보조스트림만 닫아주면 된다.
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
	}
}
