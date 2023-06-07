package week14;

import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		byte b[] = {7, 51, 3, 4, -1, 24};
		
		try {
			FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.out");
			
			for(int i = 0; i < b.length; i++) 
				fout.write( b[i] );
			
			fout.close();
			
			} catch( IOException e ) {
				System.out.println(" 저장 불가. ");
				
				return;
			}
			
			System.out.println(" 저장 완료. ");
			
			
		}
		// TODO Auto-generated method stub
	 

}


