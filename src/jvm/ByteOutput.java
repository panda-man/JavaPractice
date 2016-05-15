package jvm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteOutput {
	public static void main(String[] args) throws IOException {
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	baos.write(65);
	baos.write(66);
	byte[] data = baos.toByteArray();
	System.out.print(data);
	}
}
