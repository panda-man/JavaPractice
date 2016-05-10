package jvm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String dir = System.getProperty("user.dir");
		// 出力したいファイル名を指定してFileオブジェクトを生成します。
		File file = new File(dir + "/test.txt");

		FileWriter filewriter = null;
		try{
			filewriter = new FileWriter(file);
			// ここでファイルに文字を書き込みます。
			filewriter.write("stringその1\r\n");
			filewriter.write("stringその2\r\n");
			filewriter.flush();
			System.out.println("ファイルの書き込みに成功しました!");
		}catch(IOException e){
			System.out.println(e);
		} finally {
			// クローズ処理（成功・失敗に関わらず必ずクローズします。）
			// クローズ漏れはバグのもとになります。必ずfinally句でクローズしましょう。
			if (filewriter != null) {
				try {
					filewriter.close();
				} catch (IOException e) {
					System.out.println(e);
				}
			}
		}
	}

}
