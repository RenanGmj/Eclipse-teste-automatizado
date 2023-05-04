package teste;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class caixa_preta {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void teste() {
		driver.get("https://g1.globo.com");
		driver.findElement(By.id("busca-campo")).sendKeys("carros");
		driver.findElement(By.id("busca-campo")).sendKeys(Keys.RETURN);
	}

}
