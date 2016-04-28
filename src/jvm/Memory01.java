package jvm;
import java.lang.*;
public class Memory01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		long f = System.getRuntime().freeMemory();
//		System.out.println(f);
		Class<?> info1 = String.class;
		System.out.println(info1.getSimpleName());
		System.out.println(info1.getName());
		System.out.println(info1.getPackage().getName());
		System.out.println(info1.isArray());
		
		Class<?> info2 = info1.getSuperclass();
		System.out.println(info2.getName());
		
		Class<?> info3 = args.getClass();
		System.out.println(info3.isArray());
	}

}
