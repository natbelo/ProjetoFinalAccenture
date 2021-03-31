package io.cucumber.natalia.servico;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuracao {

    public static WebDriver browser;

    public static void abrir(String url) {
        if (browser == null) {
        	try {
                System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
                browser = new ChromeDriver();
              } catch (Exception e) {
                System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
                browser = new ChromeDriver();
              }
        }
        
        browser.get(url);
        browser.manage().window().maximize();

    }

    public static void fechar() {
        browser.quit();
        browser = null;
    }

    public static WebElement cssSelector(String selector) {
		return browser.findElement(By.cssSelector(selector));
	}
	
	public static List<WebElement> cssSelectors(String selector) {
		return browser.findElements(By.cssSelector(selector));
	}
	
	public static WebElement id(String selector) {
		return browser.findElement(By.id(selector));
    }
	
	public static WebElement xpath(String selector) {
		return browser.findElement(By.xpath(selector));
	}
	
	public static WebElement linkText(String selector) {
		return browser.findElement(By.linkText(selector));
	}
	
}