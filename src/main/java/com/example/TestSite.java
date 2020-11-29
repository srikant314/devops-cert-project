import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import org.testng.annotations.Test;
public class TestSite {
  private TestSite() {
  }

  public static void main(String[] args) {
    System.out.println("Hello!!!");
    System.setProperty("webdriver.chrome.driver", "/home/jenkins-slave/chrome-modules/chromedriver");
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--headless");
    chromeOptions.addArguments("--no-sandbox");

    WebDriver driver = new ChromeDriver(chromeOptions);

    driver.get("http://34.68.99.165:8080/content/about-us.php");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Page Source Output -> " + driver.getPageSource());

    if (driver.getPageSource().contains("about")) {
      System.out.println("Pass");
    } else {
      System.out.println("Fail");
    }
    driver.quit();
  }

}
