package jvm;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class InstanceSave {

	public static void main(String[] args) throws Exception{
		// TODO 自動生成されたメソッド・スタブ
		Hero hero1 = new Hero("ミナト", 75, 18);
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") +"/saveinstance.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(hero1);
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +"/saveinstance.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Hero hero2 = (Hero) ois.readObject();
		ois.close();
		System.out.println(hero2.name);
		System.out.println(hero2.Hp);
		System.out.println(hero2.Mp);
		
	}

}
