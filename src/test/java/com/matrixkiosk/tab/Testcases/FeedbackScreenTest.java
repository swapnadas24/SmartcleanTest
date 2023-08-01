package com.matrixkiosk.tab.Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.matrixkiosk.tab.Screens.Feedbackscreen;
import com.matrixkiosk.tab.Screens.LoginScreen;
import com.matrixkiosk.tab.base.Testbase;

public class FeedbackScreenTest extends Testbase{
   
    LoginScreen login_screen;
    Feedbackscreen feedback_screen;
  
    public FeedbackScreenTest(){
        
        super();
    }
    @BeforeMethod
    public void setUp() throws InterruptedException, IOException{
       
        initialization();
        login_screen = new LoginScreen();   
        feedback_screen=new Feedbackscreen();         
    }
 
    @Test
    public void screensTest() throws InterruptedException{
        
        //Login screen
        login_screen.matrix_login();
        login_screen.select_property_building();
        login_screen.Select_FD_Device();
        login_screen.setUp_Matrix_PIN();
        login_screen.NFC_login();

        //Feedbackscreen
        feedback_screen.Smily();
        
    }   
     
    @AfterMethod
    public void quitScreen(){
       
        driver.quit();

    }    
    
}
