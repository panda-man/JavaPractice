package jvm;
import org.apache.commons.logging.*;

public class Log {
	public static void main(String[] args){
		Log logger = (Log) LogFactory.getLog(Log.class);
		if(args.length != 2){
			logger.equals("起動引数の値が異常;" + args.length);
		}
	}
}
