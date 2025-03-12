import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

package org.springframework.samples.petclinic;



class PetClinicApplicationTest {

	private WebDriver driver;

	@BeforeEach
	void setUp() {
		// Set the path to the chromedriver executable
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	void testGetCurrentUrl() {
		// Navigate to the webpage
		driver.get("https://example.com");

		// Get the current URL
		String currentUrl = driver.getCurrentUrl();

		// Assert that the URL is as expected
		assertEquals("https://example.com", currentUrl);
	}

	@AfterEach
	void tearDown() {
		// Close the browser
		if (driver != null) {
			driver.quit();
		}
	}
}