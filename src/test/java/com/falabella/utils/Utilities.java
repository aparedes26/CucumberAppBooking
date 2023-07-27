package test.java.com.falabella.utils;

import java.util.ArrayList;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
  public static String devuelveAlfanumericoMinusculas() {
    String SALTCHARS = "abcdefghijklmnopqrstuwxyz";
    StringBuilder salt = new StringBuilder();
    Random rnd = new Random();
    while (salt.length() < 10) { // length of the random string.
      int index = (int) (rnd.nextFloat() * SALTCHARS.length());
      salt.append(SALTCHARS.charAt(index));
    }
    String saltStr = salt.toString();
    return saltStr;
  }

  public static String devuelveNumeroTelefono() {
    String SALTCHARS = "0123456789";
    StringBuilder salt = new StringBuilder();
    Random rnd = new Random();
    while (salt.length() < 9) { // length of the random string.
      int index = (int) (rnd.nextFloat() * SALTCHARS.length());
      salt.append(SALTCHARS.charAt(index));
    }
    String saltStr = salt.toString();
    return saltStr;
  }

  public static String devuelveRut() {
    String SALTCHARS = "0123456789";
    StringBuilder salt = new StringBuilder();
    Random rnd = new Random();
    while (salt.length() < 8) { // length of the random string.
      int index = (int) (rnd.nextFloat() * SALTCHARS.length());
      salt.append(SALTCHARS.charAt(index));
    }

    // Deleting unnecessary values on first character
    if (salt.indexOf("0", 0) == 0)
      salt.deleteCharAt(0);

    // Calculating Validation Digit by Modulus 11 alg.
    salt.reverse();
    int a = 2;
    int idAdd = 0;
    for (int i = 0; i < salt.length(); i++) {
      idAdd += Integer.parseInt("" + salt.charAt(i)) * a;
      if (a == 7)
        a = 1;
      a++;
    }

    // Construction of the ID with the Validation Digit
    salt.reverse();
    String dv = String.valueOf(11 - (idAdd % 11));
    salt.append(dv.equals("11") ? "0" : (dv.equals("10") ? "K" : dv));

    String saltStr = salt.toString();
    return saltStr;
  }

  public static boolean findCodedWord(String text) {
    int resultado = text.indexOf("**");
    if (resultado == -1) {
      return false;
    } else {
      return true;
    }
  }

  public static void selectDropdownByVisibleText(WebElement selectWebElement, String text) {
    Select sct = new Select(selectWebElement);
    sct.selectByVisibleText(text);
  }

  public static void selectDropdownByIndexValue(WebElement selectWebElement, int indexValue) {
    Select sct = new Select(selectWebElement);
    sct.selectByIndex(indexValue);;
  }

  public static String switchNewWindow(WebDriver driver) {
    String oldTab = driver.getWindowHandle();
    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
    newTab.remove(oldTab);
    driver.switchTo().window(newTab.get(0));
    return oldTab;
  }

  public static void backOldWindow(WebDriver driver, String oldTab) {
    driver.switchTo().window(oldTab);
  }

  public static boolean checkURL(WebDriver driver, String contenidoUrl) {
    try {
      driver.findElement(By.xpath("//*[@class='ups_bajada']"));
      System.out.println("Page is down");
      return false;
    } catch (Exception e) {
      System.out.println("Page is not down");
    }
    try {
      driver.findElement(By.xpath("//*[text()='No se puede acceder a este sitio web']"));
      System.out.println("Page is out of service");
      return false;
    } catch (Exception e) {
      System.out.println("Page is not out of service");
    }
    try {
      driver.findElement(By.xpath("//*[text()='Esta página no funciona']"));
      System.out.println("Page is not working");
      return false;
    } catch (Exception e) {
      System.out.println("Page is working");
    }
    try {
      WebElement html = driver.findElement(By.xpath("//html"));
      WaitWebDriver.waitVisibility(driver, html, 3);
      System.out.println("Page is not empty");
      System.out.println("---------------------------------------------");
    } catch (Exception e) {
      System.out.println("Page is empty");
      return false;
    }
    try {
      String url = driver.getCurrentUrl();
      return url.contains(contenidoUrl);
    } catch (Exception e) {
      return false;
    }
  }

  public static boolean isDisplayed(WebElement element) {
    try {
      return element.isDisplayed();
    } catch (Exception e) {
      return false;
    }
  }

  public static boolean verifyText(WebDriver driver, String text) {
    try {
      return driver.findElement(By.xpath("//*[text()='" + text + "']")).isDisplayed();
    } catch (Exception e) {
      return false;
    }
  }

  public static boolean verifyContainsText(WebDriver driver, String text) {
    try {
      return driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]")).isDisplayed();
    } catch (Exception e) {
      return false;
    }
  }

  public static void loadingSpinnerVisibility(WebDriver driver) {
    try {
      WebElement loadingSpinner = driver.findElement(
          By.xpath("//*[@class='fbra_loadingSpinner__arc fbra_test_loadingSpinner__arc']"));
      WaitWebDriver.waitVisibility(driver, loadingSpinner, 10);
    } catch (Exception e) {
    }
  }

  public static void clickHiddenElement(WebDriver driver, WebElement webElement) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", webElement);
  }

  public static void fakeThreadSleep(WebDriver driver, int time) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, time);
      wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//html")));
    } catch (Exception e) {
    }
  }

  public static void waitXseconds(int seconds) {
    try {
      Thread.sleep(seconds * 1000);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static String devuelveMailAleatorio() {
    String SALTCHARS = "abcdefghijklmnopqrstuwxyz";
    StringBuilder salt = new StringBuilder();
    Random rnd = new Random();
    while (salt.length() < 10) { // length of the random string.
      int index = (int) (rnd.nextFloat() * SALTCHARS.length());
      salt.append(SALTCHARS.charAt(index));
    }
    String saltStr = salt.toString();
    return saltStr + "@yopmail.com";
  }

	public static void scrollToAnElement(WebDriver driver, WebElement webElement) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", webElement);
	}
	
	public static String randomNum(int largo) {
    String SALTCHARS = "1234567890";
    StringBuilder salt = new StringBuilder();
    Random rnd = new Random();
    while (salt.length() < largo) { // length of the random string.
        if (salt.length() == 1) {
            SALTCHARS = "0123456789";
        }
        int index = (int) (rnd.nextFloat() * SALTCHARS.length());
        salt.append(SALTCHARS.charAt(index));
    }
    String saltStr = salt.toString();
    return saltStr;
	}
}
