package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    WebDriver driver;

    //cosntrutor da clase
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    //construtor da clase
    public BasePage(){
        System.setProperty("webdriver.chrome.driver", "/Users/carrasco/driver/chromedriver");
        this.driver = new ChromeDriver();
    }

    public void navegateTo(String URL){
        driver.navigate().to(URL);
    }
    public WebDriver getDriver(){
        return driver;
    }
    public void closeNavegator() {
        getDriver().close();
    }

    public void login(String user, String pwd){

    }



}
