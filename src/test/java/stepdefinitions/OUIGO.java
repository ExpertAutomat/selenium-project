package stepdefinitions;


import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OUIGO {

    WebDriver driver;

    @Given("l'utilisateur est sur la page d'accueil de Ouigo")
    public void ouvrir_page_ouigo() {
    	System.setProperty("webdriver.chrome.driver", "C:/Users/bachi/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("--start-maximized");
        options.addArguments("--disable-blink-features=AutomationControlled");
        driver = new ChromeDriver(options);
        driver.get("https://www.ouigo.com");
    }

    @When("il saisit {string} dans le champ Gare de départ")
    public void saisir_gare_depart(String gare) throws InterruptedException {
        WebElement champDepart = driver.findElement(By.id("origin-station-input-field__input"));
        champDepart.sendKeys(gare);
        Thread.sleep(2000);
    }

    @Then("la suggestion {string} doit apparaître")
    public void verifier_suggestion(String suggestion) {
        driver.quit();
    }
}
