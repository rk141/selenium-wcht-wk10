package wcht_browser_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class WchtIEBrowserTest {

    public static void main(String[] args) {

        String baseurl = "https://wcht.org.uk/\n\n";
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);

        String title = driver.getTitle();
        boolean verifyTitle = title.equals("nopCommerce demo store");
        boolean verifyTitleContain = title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContain);
        System.out.println(title.length());
        System.out.println(title);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.close();

    }

}
