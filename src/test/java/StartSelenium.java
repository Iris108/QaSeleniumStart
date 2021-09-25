import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {

    //before [open www] ---> test [steps] + Assert ---> after[logout]
    // before [open browser] ---> test [open www]  ---> after[close www + browser]
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        //open browser
        wd = new ChromeDriver();
    }
    @Test
    public void startContact(){
        //open www
            //without history
       //wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");
            //with history
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        WebElement element1 = wd.findElement(By.tagName("div"));
        List<WebElement> list = wd.findElements(By.tagName("div"));
        WebElement element2 = wd.findElement(By.id("root"));
        WebElement element3 = wd.findElement(By.className("container"));
        System.out.println(list.size());
        WebElement elDiv2 = list.get(1);
    }
    @Test
    public  void loginTest(){
        //step1 open www
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        //step2 click login button
        //WebElement loginA = wd.findElement(By.className("active"));
        WebElement loginA = wd.findElement(By.linkText("LOGIN"));
        loginA.click();

        // step3 type email
        List<WebElement> listInputs = wd.findElements(By.tagName("input"));
        WebElement email = listInputs.get(0);
        email.click();
        email.clear();
        email.sendKeys("lolo@gmail.com");
        // step4 type password
        WebElement password = listInputs.get(1);
        password.click();
        password.clear();
        password.sendKeys("Ll123456$");
        // step5 type button login
        WebElement loginBth = wd.findElement(By.tagName("button"));
        loginBth.click();
    }
    @AfterMethod
    public void postCondition(){
        //close browser +www
        //wd.close();

        //wd.quit();
    }


}