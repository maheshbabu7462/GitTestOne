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
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareImage1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver" , "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        WebElement Original=driver.findElement(By.xpath("//*[@id='divLogo']/img"));
        
        Screenshot s1=new AShot().takeScreenshot(driver, Original);
        
        BufferedImage realImage = s1.getImage();
        
     
        BufferedImage Original1=ImageIO.read(new File("D://OrangeHrm.png"));
        
        ImageDiffer i=new ImageDiffer();
        
        ImageDiff i1=i.makeDiff(Original1, realImage);
        
        if(i1.hasDiff()==true){
        	
        	System.out.println("There is a difference");
        }
        else{
        	
        	System.out.println("There is a no difference");
        }
        
        
        

	}

}
