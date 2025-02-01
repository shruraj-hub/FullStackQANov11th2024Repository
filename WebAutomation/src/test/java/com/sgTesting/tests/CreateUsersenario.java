package com.sgTesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUsersenario
{
    public static WebDriver oBrowser=null;
    public static void main(String[] args)
    {
        launchBrowser();
        navigateURL();
        login();
        Logout();

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
    public static void login()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("admin");
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void Logout()
    {
        try
        {
            oBrowser.findElement(By.linkText("logout")).click();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
