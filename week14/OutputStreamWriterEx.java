package week14;

import java.io.*;

public class OutputStreamWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputStreamWriter out = null;
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("c:\\Temp\\hangul.txt");
			out = new OutputStreamWriter(fout, "MS949");
			
			out.write("�ѱ� �ؽ�Ʈ �����Դϴ�.");
			
			out.close();
			fout.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}

}
