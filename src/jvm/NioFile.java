package jvm;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFile {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Path p1 = Paths.get(System.getProperty("user.dir") +"/test.txt");
		System.out.print(p1);
	}
}
