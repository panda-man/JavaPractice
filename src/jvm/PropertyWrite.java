package jvm;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class PropertyWrite {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Writer fr = new FileWriter(System.getProperty("user.dir") +"/save.properties");
		Properties p = new Properties();
		p.setProperty("heroName", "アサカ");
		p.setProperty("heroHp", "62");
		p.setProperty("heroMp", "45");
		p.store(fr,"勇者の情報");
	}

}
