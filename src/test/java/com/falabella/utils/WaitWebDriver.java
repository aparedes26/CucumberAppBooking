package test.java.com.falabella.utils;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Function;

public class WaitWebDriver {

	public WaitWebDriver() {
		super();
	}
	
	public static void waitVisibility(WebDriver driver, WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitClickable(WebDriver driver, WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitSelected(WebDriver driver, WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}

	public static void waitAlert(WebDriver driver, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void wastingTime(WebDriver driver, int seconds) {
		try {
			WaitWebDriver.waitVisibility(driver, driver.findElement(By.xpath("//p[@id='This-is-a-lie']")), seconds);
		} catch (Exception e) {
		}
	}

	public static boolean isExistsObject(WebDriver driver, WebElement element) {
		try {
			waitVisibility(driver, element, 15);
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public static void waitVisibilityLocator(WebDriver driver, String xpath, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
	}

	public static void waitVisibilitys(WebDriver driver, List<WebElement> element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}

	public static void textToBePresentInElement(WebDriver driver, String mensaje, WebElement elemento, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.textToBePresentInElement(elemento, mensaje));
	}

	public static void notTextToBePresentInElement(WebDriver driver, String mensaje, WebElement elemento, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(elemento, mensaje)));
	}

	public static void elementosInvisibles(WebDriver driver, By element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
	}

	public static void noUsar(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
