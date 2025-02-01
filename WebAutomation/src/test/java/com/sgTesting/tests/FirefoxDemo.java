package com.sgTesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirefoxDemo
{
    public static WebDriver oBrowser=null;
    public static void main(String args[])
    {
        launchBrowser();
        navigateURL();
        closeApplication();
    }

    public static void launchBrowser()

    {
        try
        {
            oBrowser =new ChromeDriver();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void navigateURL()
    {
        try
        {
            oBrowser.get("http://localhost/login.do");
                    Thread.sleep(4000);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void closeApplication()
    {
        try
        {
         oBrowser.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
