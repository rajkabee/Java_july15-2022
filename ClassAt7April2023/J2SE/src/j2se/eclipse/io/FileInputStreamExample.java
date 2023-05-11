package j2se.eclipse.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamExample {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("e:\\file.txt");
//		FileInputStream fis = new FileInputStream(file);
//		int input;
//		while((input = fis.read())!=-1 ) {
//			System.out.print(String.format("%c", input));
//			//System.out.println(input);
//		}
//		fis.close();
		BufferedReader fr = new BufferedReader(file);
		String text;
		text = fr.readLine();
		System.out.println(text);
		fr.close();
	}
}
