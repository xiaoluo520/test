package util;

import java.io.IOException;
import java.util.Properties;



public class UtilClass {
    
	
    //获取properties文件属性
	private static String getProValue(String key) {
		//创建一个properties对象
		Properties properties =  new Properties();
		try {
			//把对应文件加载到内存
			properties.load(UtilClass.class.getClassLoader().getResourceAsStream("db.properties"));
			//根据对应的key获取对应的value值
			String value = properties.getProperty(key);
			return value;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
