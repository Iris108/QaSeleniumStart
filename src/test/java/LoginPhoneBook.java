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
        wd.findElement(By.cssSelector("a[href='/login']")).click();

        // fill email
    type(By.cssSelector("[placeholder='Email']"), "lolo@gmail.com");
        //fill password
    type(By.cssSelector("[placeholder='Password']"), "Ll123456$");
        // click login
        wd.findElement(By.cssSelector("button")).click();
    }
    public  void type(By locator, String text){
        WebElement element = wd.findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);

    }
}
