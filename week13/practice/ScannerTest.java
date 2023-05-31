package week13;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		try {
			Scanner input = new Scanner( new File( "numbers.txt" ) );
			while( input.hasNext() ) {
				n = input.nextInt();
				System.out.println( n );
			}
			
			input.close();
		}
		catch ( FileNotFoundException e ) {
			System.err.println("cannot open");
			System.exit(1);
		}

	}

}
