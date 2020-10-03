package com.selenium.BasicsOfSelenium;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CompareImages {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver" , "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement Expected=driver.findElement(By.xpath("//*[@id='divLogo']/img"));
        
        Screenshot OrgImage=new AShot().takeScreenshot(driver, Expected);
        
        ImageIO.write(OrgImage.getImage(), "png", new File("D://OrangeHrm.png"));
        
        
        File f=new File("D://OrangeHrm");
        
        if(f.exists()){
        	
        	System.out.println("The image is located");
        }
        else{
        	System.out.println("The image is not located");
        }
        
	}

}
