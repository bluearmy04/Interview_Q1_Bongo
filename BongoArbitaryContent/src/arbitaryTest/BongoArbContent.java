package arbitaryTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BongoArbContent {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Riyad Hasan\\Downloads\\selenium\\selenium\\browser\\chromedriver.exe" + 
					"");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.bongobd.com/");
			System.out.println(driver.findElement(By.tagName("a")).getSize()); 
			//it will count and display how many anchor tag including image present in the page
			
			
			  
			//movie tag validation
			driver.findElement(By.xpath("//div[@class='main-nav']//a[contains(text(),'Movies')]")).click();
			String acurl=driver.getCurrentUrl();
			System.out.println(" "+acurl);
			String exurl="https://www.bongobd.com/en/movies";
			if(acurl.equals(exurl)) {
				System.out.println("Movie Anchor tag passed");
			}
			else {
				System.out.println("not passed");
			}
			driver.navigate().back(); //it navigates back from the current page
			//Drama tag Validation	
			driver.findElement(By.xpath("//div[@class='main-nav']//a[contains(text(),'Drama')]")).click();
			String acurlDrama=driver.getCurrentUrl();
			System.out.println(" "+acurlDrama); //it displays the drama URL
			String exurlDrama="https://www.bongobd.com/en/drama";
			
			if(acurlDrama.equals(exurlDrama)) {
				System.out.println("Drama Anchor tag passed");
			}
			else {
				System.out.println("not passed");
			}
			driver.navigate().back(); //it navigates back from the current page
			
			//Series tag Validation
			driver.findElement(By.xpath("//div[@class='main-nav']//a[contains(text(),'Series')]")).click();
			String acurlSeries=driver.getCurrentUrl();
			System.out.println(" "+acurlSeries); //it displays the Series URL
			String exurlSeries="https://www.bongobd.com/en/series";
			
			if(acurlSeries.equals(exurlSeries)) {
				System.out.println("Series Anchor tag passed");
			}
			else {
				System.out.println("not passed");
			}
			driver.navigate().back(); //it navigates back from the current page
			//Boom tag Validation
			driver.findElement(By.xpath("//div[@class='main-nav']//a[contains(text(),'Boom')]")).click();
			String acurlBoom=driver.getCurrentUrl();
			System.out.println(" "+acurlBoom); //it displays the Boom URL
			String exurlBoom="https://www.bongobd.com/en/boom";
			
			if(acurlBoom.equals(exurlBoom)) {
				System.out.println("Boom Anchor tag passed");
			}
			else {
				System.out.println("not passed");
			}
			driver.navigate().back(); //it navigates back from the current page
			//Classic tag validation
			driver.findElement(By.xpath("//div[@class='main-nav']//a[contains(text(),'Classics')]")).click();
			String acurlClassics=driver.getCurrentUrl();
			System.out.println(" "+acurlClassics); //it displays the classic URL
			String exurlClassics="https://www.bongobd.com/en/classic";
			
			if(acurlClassics.equals(exurlClassics)) {
				System.out.println("Classics Anchor tag passed");
			}
			else {
				System.out.println("not passed");
			}
			driver.navigate().back(); //it navigates back from the current page
				
				 
	}

}
