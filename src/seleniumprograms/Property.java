package seleniumprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Property {
	public String strFileName;
	Properties props = new Properties();

	public Property(String strFileName) {
		this.strFileName = strFileName;
	}

	public String getProperty(String strKey) {
		String strValue = null;
		try {
			File f = new File(strFileName);
			if (f.exists()) {
				FileInputStream in = new FileInputStream(f);
				props.load(in);
				strValue = props.getProperty(strKey);
				in.close();
			} else
				System.out.println("File not found!");
		} catch (Exception e) {
			System.out.println(e);
		}
		return strValue;
	}

	public String setProperty(String strKey, String strValue) throws Throwable {

		try {
			File f = new File(strFileName);
			if (f.exists()) {
				FileInputStream in = new FileInputStream(f);
				props.load(in);
				props.setProperty(strKey, strValue);
				props.store(new FileOutputStream(strFileName), null);

				in.close();
			} else {
				System.out.println("");
			}
		} catch (Exception e) {
			System.out.println("exception: " + e);
		}
		return strValue;

	}

	public static void main(String[] args) {
		String strValue = "";

	}
}
