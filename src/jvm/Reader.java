package jvm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		FileReader fr = new FileReader(System.getProperty("user.dir") +"/test.txt");
		BufferedReader br = new BufferedReader(fr);
		String line =null;
		while((line = br.readLine()) != null){
			System.out.print(line);
		}
	}

}
