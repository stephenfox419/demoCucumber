package stephenfoxDemo;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


/**
 * Created by Stephen Desktop on 5/7/2016.
 */
public class BbcWeatherForPrestonStepsTest {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    WebDriverWait wait;

    @Before
    public void setUp() throws Exception {

        System.out.println("Setting up the Driver and URL");
        driver = new FirefoxDriver();
        baseUrl = "http://www.bbc.co.uk/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @After
    public void TearDown() throws Exception {

        System.out.println(" Closing the Driver");
        driver.quit();

    }

    @Given("^I am logged on the bbc weather portal$")
    public void I_am_logged_on_the_bbc_weather_portal() throws Throwable {

        driver.get(baseUrl);

    }

    @When("^I enter my postcode$")
    public void I_enter_my_postcode() throws Throwable {

        driver.findElement(By.linkText("Weather")).click();
        driver.findElement(By.id("locator-form-search")).clear();
        driver.findElement(By.id("locator-form-search")).sendKeys("pr40ab");
        driver.findElement(By.id("locator-form-submit")).click();
    }

    @Then("^I see the weather for Preston$")
    public void I_see_the_weather() throws Throwable {

        WebElement element;
        element = driver.findElement(By.cssSelector("[title='PR4']"));

        assertEquals("Expect Attribute Title = PR4 ",
                "PR4",
                element.getText());
    }

}
