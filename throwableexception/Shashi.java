package com.onebill.throwableexception;

import java.io.File;
import java.io.IOException;
//checked exception
//compile time exception(which user can predict)

public class Shashi {
	public static void main(String[] args) {
		Soumya soumya = new Soumya();
		File file = new File("/home/padma/Workspace/corejava/src/file");
		String task;
		try {
			task = soumya.task(file);
			System.out.println(task);
		}catch(IOException e) {
			e.printStackTrace();

		}
	}

}
