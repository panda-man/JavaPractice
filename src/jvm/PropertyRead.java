package jvm;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyRead {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		FileReader fr = new FileReader(System.getProperty("user.dir") +"/hero.properties");
		Properties p = new Properties();
		p.load(fr);
		String name = p.getProperty("heroName");
		String strHp = p.getProperty("heroHp");
		int hp = Integer.parseInt(strHp);
		System.out.print(name);
		System.out.print(hp);
		fr.close();
	}
}
