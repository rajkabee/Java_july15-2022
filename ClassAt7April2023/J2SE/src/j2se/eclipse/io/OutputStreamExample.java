package j2se.eclipse.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class OutputStreamExample {
	public static void main(String[] args) throws IOException {
		File file = new File("e:\\file.txt");
		if(file.createNewFile()) {
			System.out.println("File Created!");
		}
		//FileInputStream fis=new FileInputStream(file);
		//FileOutputStream fos = new FileOutputStream(file);
		//fos.write(65);
		//fos.close();
		String msg = "Writing to file using file output Stream!";
		FileWriter fw = new FileWriter(file);
		fw.write(msg);
		fw.close();
	}
}
