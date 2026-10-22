public class MainTest {
    
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class MainTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void testIncrementButton() {
        File htmlFile = new File("program.html");
        driver.get(htmlFile.toURI().toString());

        driver.findElement(By.id("increment-button")).click();

        String result = driver.findElement(By.id("output")).getText();
        assertEquals("1", result);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

}
