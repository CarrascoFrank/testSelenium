package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaInicialPage extends BasePage {

    WebDriver driver;
    private static WebElement element = null;


    public PaginaInicialPage(WebDriver driver){
        super(driver);
    }

    public void abrindoPaginaInicial(){
       WebElement validaText = getDriver().findElement(By.xpath("/html/body/div[1]/section[2]/div/p[1]"));
       String validaTitulo = validaText.getText();
       Assert.assertEquals("Tudo pra facilitar seu dia a dia", validaTitulo);

    }

}
