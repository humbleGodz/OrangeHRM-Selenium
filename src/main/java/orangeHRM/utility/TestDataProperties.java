package orangeHRM.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import orangeHRM.constant.Constants;

public class TestDataProperties {

	public static String propertiesUtility(String Key) throws IOException {

		File file = new File(Constants.PATH);
		FileReader reader = new FileReader(file);
		Properties properties = new Properties();
		properties.load(reader);
		return (String) properties.get(Key);
	}

	public static String globalpropertiesUtility(String Key) throws IOException {

		File file = new File(Constants.GLOBAL_ENVIROMENT);
		FileReader reader = new FileReader(file);
		Properties properties = new Properties();
		properties.load(reader);
		return (String) properties.get(Key);
	}
}
