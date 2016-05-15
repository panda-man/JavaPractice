package jvm;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.crypto.CipherOutputStream;

public class FilterOutput {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		FileOutputStream fos =new FileOutputStream("data.txt");
		CipherOutputStream cos = new CipherOutputStream(fos,null);
		cos.write(65);	
	}

}
