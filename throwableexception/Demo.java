package com.onebill.throwableexception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Demo {
	public static void main(String[] args) {
		System.out.println("program starts");
		File file = new File("/home/padma/Workspace/corejava/src/file");
		try {
			FileReader fr = new FileReader(file);
			int read = fr.read();
			while(read != -1) {
				System.out.print((char) read);
				read = fr.read();
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File does not exist");
		}catch(IOException e) {
			System.out.println("No data exist");
		}
		System.out.println("\nprogram ends");
	}

}
