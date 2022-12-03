package org.example;// Generated by Selenium IDE
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.Dimension;

//@SpringBootTest(classes = com.example.test_project.TestProjectApplication )
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Test1Test {
  //@LocalServerPort
  private final int port =8080;
  private WebDriver driver;

  @BeforeEach
  public void setUp() {
    //System.setProperty("webdriver.gecko.driver", "C:\\Users\\willi\\OneDrive\\UNI\\UNI WS 2022_23\\Advanced Software Engineering\\test_project\\geckodriver.exe");
    //driver = new FirefoxDriver();
    //js = (JavascriptExecutor) driver;
    //vars = new HashMap<String, Object>();
    System.out.println("Setup STEP #########");
    WebDriverManager.firefoxdriver().setup();
    FirefoxOptions options = new FirefoxOptions();
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("--headless");
    driver = new FirefoxDriver(options);
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void test1() {
    System.out.println("Test1 STEP #########");
    driver.get("http://localhost:" + port + "/");
    driver.manage().window().setSize(new Dimension(1047, 855));
    // Test before click
    driver.findElement(By.id("button")).click();
    // Test after click
    assertEquals("Test 42", driver.findElement(By.id("2")).getText());
  }
  @Test
  public void test2() {
    driver.get("http://localhost:" + port + "/");
    driver.manage().window().setSize(new Dimension(1047, 855));
    driver.findElement(By.cssSelector("html")).click();
    // Test before click
    assertEquals("Test 123", driver.findElement(By.id("1")).getText());
    driver.findElement(By.id("button")).click();

    // Test after click
    assertEquals("Test 321", driver.findElement(By.id("1")).getText());
    assertEquals("Test 42", driver.findElement(By.id("2")).getText());
  }

  //@Test
  //public void test3(){
  //  fail();
  //}
}
