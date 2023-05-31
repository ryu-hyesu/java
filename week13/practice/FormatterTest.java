import java.util.Formatter;
import java.io.FileNotFoundException;
public class FormatterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Formatter output = new Formatter( "number.txt" );
			for(int i = 0; i < 10; i++) 
				output.format("%d\r\n", i);
			output.close();
		}
		catch( FileNotFoundException e ) {
			System.err.println( "cannot open" );
			System.exit(1);
		}

	}

}
