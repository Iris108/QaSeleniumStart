import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPhoneBook {

    WebDriver wd;
    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        wd.manage().window().maximize();
    }
    @Test
    public void loginTest(){
        // open login form

        // fill email
type(By.cssSelector("[placeholder='email']"), "lolo@gmail.com");
        //fill password

        // click login
    }
    public  void type(By locator, String text){
        WebElement element = wd.findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);

    }
}
