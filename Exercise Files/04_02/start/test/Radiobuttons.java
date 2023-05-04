import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButtonOne = driver.findElement(By.id("radio-button-1"));
        radioButtonOne.click();

        WebElement radioButtonTwo = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButtonTwo.click();

        driver.quit();
    }
}
