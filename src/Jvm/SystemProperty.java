package Jvm;

import java.util.Iterator;
import java.util.Properties;

public class SystemProperty {
	public static void main(String[] args){
		System.out.println("ご利用のJavaのバージョン:");
		System.out.println(System.getProperty("Java.version"));
		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		System.out.println(System.getProperty("【システムプロパティ一覧】"));
		while (i.hasNext()) {
			String key = i.next();
			System.out.print(key + "=");
			System.out.println(System.getProperty(key));
		}
	}
}
