package jvm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) throws IOException {
		String dir = System.getProperty("user.dir");
		FileReader fr = new FileReader(dir +"/test.txt");
		System.out.println("全てのデータを読み込んで表示します。");
		int i = fr.read();
		//System.out.println(i);
		while(i !=-1){
			char c = (char)i;
			System.out.print(c);
			i = fr.read();
		}
		System.out.println("ファイルの末尾に到達しました。");
		fr.close();
	}
}
