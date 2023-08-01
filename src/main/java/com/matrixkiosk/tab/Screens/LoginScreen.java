package com.matrixkiosk.tab.Screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.matrixkiosk.tab.base.Testbase;
import com.matrixkiosk.tab.util.TestUtil;

public class LoginScreen extends Testbase{

       
    public void matrix_login() throws InterruptedException {

        driver.findElement(By.xpath(props.getProperty("login_tab"))).click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);
    
        //Enter Matrix Username and password
        driver.findElement(By.xpath(props.getProperty("Matrix_Username_Email"))).click();
        driver.findElement(By.xpath(props.getProperty("Matrix_Username_Email"))).sendKeys(props.getProperty("Mat_Username"));
    
        driver.findElement(By.xpath(props.getProperty("Matrix_Password"))).click();
        driver.findElement(By.xpath(props.getProperty("Matrix_Password"))).sendKeys(props.getProperty("Mat_password"));
        driver.findElement(By.xpath(props.getProperty("login_tab"))).click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);
     
      }

      public void select_property_building(){
        
        //Select Building & Property
        driver.findElement(By.xpath(props.getProperty("Select_Property"))).click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);

        driver.findElement(By.xpath(props.getProperty("Property"))).click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);
    
        driver.findElement(By.xpath(props.getProperty("Select_Building"))).click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);

        driver.findElement(By.xpath(props.getProperty("Seacrch_text"))).click();
        driver.findElement(By.xpath(props.getProperty("Seacrch_text"))).sendKeys(props.getProperty("search_Demo_building"));
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);

        driver.findElement(By.xpath(props.getProperty("Building"))).click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);

        driver.findElement(By.xpath(props.getProperty("Next_tab"))).click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);
      
      }

      public void Select_FD_Device(){
        driver.findElement(By.xpath(props.getProperty("Select_FD_Device"))).click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);

        driver.findElement(By.xpath(props.getProperty("FD_Device"))).click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);
    
        driver.findElement(By.xpath(props.getProperty("Allow_Matrix_Login"))).click();
        driver.findElement(By.xpath(props.getProperty("Next_tab"))).click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);   
      
      }
    
      public void setUp_Matrix_PIN(){ 
    
    
        WebElement pin_Number= driver.findElement(By.xpath(props.getProperty("Set_PIN_Authentication")));
        Actions a=new Actions(driver);
        a.moveToElement(pin_Number).sendKeys(props.getProperty("Matrix_PIN")).click().build().perform();
          
        driver.findElement(By.xpath(props.getProperty("Next_tab"))).click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);   
     
      }

      public void NFC_login(){
    
        driver.findElement(By.xpath(props.getProperty("Select_NFC_Username"))).click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);

        driver.findElement(By.xpath(props.getProperty("NFC_Username"))).click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);

        driver.findElement(By.xpath(props.getProperty("Select_NFC_Password"))).click();
        driver.findElement(By.xpath(props.getProperty("Select_NFC_Password"))).sendKeys(props.getProperty("NFC_Password"));
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);

        driver.findElement(By.xpath(props.getProperty("Next_tab"))).click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);
      
      }

}
