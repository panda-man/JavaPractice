package jvm;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileBInary {
	public static void main(String[] args) throws IOException {
		String dir = System.getProperty("user.dir");
		FileOutputStream fos = new FileOutputStream(dir + "/test.txt");
		fos.write(65);
		fos.flush();
		fos.close();
	}
}
