import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class KeyDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   FileInputStream fis=new FileInputStream("./data/demo.properties");
   Properties pro=new Properties();
   pro.load(fis);
  String user = pro.getProperty("username");
   String pass = pro.getProperty("password");
   System.out.println(user+pass);
   
   FileOutputStream fos= new FileOutputStream("./data/demo.properties");
   pro.setProperty("url","www.google.com");
   pro.store(fos, "updated by Neetu");
	}
}
