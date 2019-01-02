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
			if(bw != null) { //���ν�Ʈ���� ������Ʈ���� ���� ������� ������Ʈ���� �ݾ��ָ� �ȴ�.
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
	}
}
