import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		
		
		Properties p=new Properties();
		
		FileInputStream file=new FileInputStream("C://Users//MAHESH//Desktop//javaexamples//MavenProgram//src//test//java//config.properties");
	
		p.load(file);
		
	     String s=p.getProperty("browser");
		 String s1=p.getProperty("url");

		 if(s.equals("chrome")){
			 
			 System.setProperty("webdriver.chrome.driver" , "C://chromedriver.exe");
			  
			  WebDriver driver = new ChromeDriver();
			  driver.get(p.getProperty("url"));
		 }
		 else{
			 System.out.println("Come out from the loop");
		 }
		
	}

}
