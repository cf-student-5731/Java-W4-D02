package basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class A3 {

	public static void cat(File named) {
		RandomAccessFile input = null;
		String line = null;

		try {
			input = new RandomAccessFile(named, "r");
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			return;
		}
		catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		catch (IOException e){
			System.out.println(e.getMessage());
		}

		finally {
			if (input != null) {
				try{
					input.close();
				}

				catch (IOException e){
					System.out.println(e.getMessage());
				}
			}
		}
	}


}
