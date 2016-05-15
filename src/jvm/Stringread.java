package jvm;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Stringread {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		String msg = "第一土曜";
		Reader sr = new StringReader(msg);
		char str1 = (char)sr.read();
		char str2 = (char)sr.read();
		char str3 = (char)sr.read();
		char str4 = (char)sr.read();
		System.out.print(str1);
		System.out.print(str2);
		System.out.print(str3);
		System.out.print(str4);
	}

}
