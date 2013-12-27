package cn.gongzili.upload.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtils {

	public static final String UPLOADIMAGE_SAVEPATH = "uploadImageSavePath";

	public static String getValue(String field) {
		return getValue("upload.properties", field);
	}

	public static String getValue(String file, String field) {
		String value = null;
		Properties properties = new Properties();
		try {
			InputStream in = PropertyUtils.class.getClassLoader()
					.getResourceAsStream(file);
			properties.load(in);
			value = properties.getProperty(field);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

}
