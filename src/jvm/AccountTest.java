package jvm;

public class AccountTest {
	public static void main(String[] args){
		testInstance();
		testTransfer();
	}

	private static void testTransfer() {
		System.out.println("無事テストできるかテストします");
		Account a = new Account("ミナト", 30000);
		if(!"ミナト".equals(a.owner)){
			System.out.println("失敗　名義人がおかしい");
		}
		if(30000 != a.balance){
			System.out.println("失敗　残高がおかしい");
		}
		System.out.println("テスト成功です。");
		System.out.println("オーナーは" + a.owner);
		System.out.println("残高は" + a.balance);

	}

	private static void testInstance() {

	}
}
