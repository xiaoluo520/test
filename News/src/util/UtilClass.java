package util;

import java.io.IOException;
import java.util.Properties;



public class UtilClass {
    
	
    //��ȡproperties�ļ�����
	private static String getProValue(String key) {
		//����һ��properties����
		Properties properties =  new Properties();
		try {
			//�Ѷ�Ӧ�ļ����ص��ڴ�
			properties.load(UtilClass.class.getClassLoader().getResourceAsStream("db.properties"));
			//���ݶ�Ӧ��key��ȡ��Ӧ��valueֵ
			String value = properties.getProperty(key);
			return value;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
