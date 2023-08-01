package com.matrixkiosk.tab.Screens;

import java.util.Random;
import org.openqa.selenium.By;

import com.matrixkiosk.tab.base.Testbase;

import io.appium.java_client.android.AndroidElement;
public class Feedbackscreen extends Testbase {

    public void Smily() throws InterruptedException{


      AndroidElement Excellent_Smile= driver.findElement(By.xpath(props.getProperty("smily_Excelent")));
      AndroidElement Good_Smile=driver.findElement(By.xpath(props.getProperty("smily_Good")));
    
      AndroidElement[] icons={Excellent_Smile,Good_Smile};
     
      Random random=new Random();
      int n=50;
    
      for(int i=0;i<=n;i++)
      { 
        int index= random.nextInt(icons.length);
        icons[index].click();
        Thread.sleep(10000);
   
      }

    }
    
}
