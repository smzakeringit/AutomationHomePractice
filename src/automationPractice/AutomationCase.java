package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AutomationCase {
//       WebDriver driver;
//       public String chromeDriver= "webDriver.chrome.driver";
//       public String chromeDriverPath="lib/browser/chromedriver";
//       public String url = "https://amazon.com/";
//       public String findAGift  = "//*[@id=\"nav-xshop\"]/a[5]";
//
//       public void setUp(String driverUrl, String driverPath, String url){
//              System.setProperty(driverUrl, driverPath);
//              driver = new ChromeDriver();
//              driver.get(url);
//       }
//       @AfterMethod
//       public void closeBrowser(){
//              driver.close();
//       }
//       public void homePage() throws InterruptedException {
//              setUp(chromeDriver,chromeDriverPath, url);
//              Thread.sleep(3000);
//       }
       WebDriver amzDriver;

       public String chromeDriver = "webdriver.chrome.driver";
       public String chromeDriverPath = "lib/browser/chromedriver";
       public String url = "https://www.amazon.com/";
       public String url1="https://www.amazon.com/gp/browse.html?node=16115931011&ref_=nav_cs_registry";
       public String url2="https://www.amazon.com/wedding";
       public String actualHomePageText = "//*[@id=\"nav-logo\"]/a/span[1]";
       public String expectedText = "\"Amazan Logo\"";

       @BeforeMethod
       public void welcome(){System.out.println("Welcome to Amazon Automation World");}

       public void lounchBrowser(String driverUrl,String driverPath,String url1) throws InterruptedException {
//for chromeBrowser
              System.setProperty(driverUrl, driverPath);
              amzDriver = new ChromeDriver();
              amzDriver.get(url1);

//              public void lounchBrowser1(String driverUrl,String driverPath,String url2){
//                     System.setProperty(driverUrl,driverPath);
//                     amzDriver = new ChromeDriver();
//                     amzDriver.get(url2);
//
//                     public void setup(String driverUrl, String driverPath,String url){
//                            System.setProperty(driverUrl, driverPath);
//                            amzDriver = new ChromeDriver();
//                            amzDriver.get(url);
//                     }
//                     @AfterMethod
//                     public void closeBrowser(){
//                            amzDriver.close();

              //Test case # 01
//                            public void homePage() throws InterruptedException {
//                            lounchBrowser(chromeDriver,chromeDriverPath,url1);
//                                   Thread.sleep(3000);
//                            }
////Test Case # 02
       }
       public void sellButton() throws InterruptedException {
                                   System.setProperty(chromeDriver,chromeDriverPath);
                                   amzDriver.manage().window().fullscreen();
                                   Thread.sleep(3000);
                                   amzDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[10]")).click();
                                   Thread.sleep(3000);
                            }
                     }

