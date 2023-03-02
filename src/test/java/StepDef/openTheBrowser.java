package StepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.List;
import java.util.Map;

public class openTheBrowser {

    //This is step definition  // implementation of feature file
WebDriver driver;
    @Given("I navigate to swaglab home page")
    public void i_navigate_to_swaglab_home_page() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }
    @Given("I enter the username to {string} user name textbox")
    public void i_enter_the_username_to_user_name_textbox(String usename) {
        driver.findElement(By.id("user-name")).sendKeys(usename);

    }
    @When("I enter the password to {string} password textbox")
    public void i_enter_the_password_to_password_textbox(String password) {
        driver.findElement(By.id("password")).sendKeys(password);

    }
    @When("I click on login button")
    public void i_click_on_login_button() {

        driver.findElement(By.id("login-button")).click();

    }


    @Then("I verify The page title")
    public void iVerifyThePageTitle() {
        String title = "Swag Labs";
        Assert.assertEquals(driver.getTitle(),title);
    }

    @When("I Enter the {string} and {string} to user name and password Text box")
    public void iEnterTheAndToUserNameAndPasswordTextBox(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @Given("I navigate to google")
    public void iNavigateToGoogle() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @And("I search {string} on the google")
    public void iSearchOnTheGoogle(String item) {

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(item);
    }

    @Then("I verify home page have six item")
    public void iVerifyHomePageHaveSixItem() {


    }

    @Given("I navigate to petpartners home page")
    public void iNavigateToPetpartnersHomePage() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.petpartners.com/");
        driver.manage().window().maximize();
    }

    @And("I click get quote button")
    public void iClickGetQuoteButton() {
        driver.findElement(By.xpath("//a[text()='Get Quote']")).click();
        
    }

    @When("I fill out the application")
    public void iFillOutTheApplication(DataTable datatable) {

        List<Map<String,String>> listdata = datatable.asMaps(String.class,String.class);

        for(Map<String,String> data:datatable.asMaps()){

            driver.findElement(By.id("name")).sendKeys(data.get("Pet name"));
            driver.findElement(By.id("postalCode")).sendKeys(data.get("Zip Code"));
            
            driver.findElement(By.id("breedSearch")).sendKeys(data.get("Pet Breed"));


            WebElement age  = driver.findElement(By.id("age"));
           Select select = new Select(age);
           select.selectByVisibleText(data.get("Pet Age"));

           driver.findElement(By.id("email")).sendKeys(data.get("Email Address"));













        }



    }

    @And("I click {string} button")
    public void iClickButton(String value) {
        
        if(value.contains("Dog")){

            driver.findElement(By.xpath("//*[@id=\"step1\"]/div[3]/span/label[1]/span")).click(); 
        } else if (value.contains("Cat")) {

            driver.findElement(By.xpath("//*[@id=\"step1\"]/div[3]/span/label[2]/span")).click();
            
        }
    }

    @And("i click {string} button for the yes or no question")
    public void iClickButtonForTheYesOrNoQuestion(String option) {

        if(option.contains("Yes"))

        driver.findElement(By.xpath("//*[@id=\"step1\"]/div[6]/div/label[1]/span")).click();
    }
}
