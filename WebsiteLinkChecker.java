import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class WebsiteLinkChecker 
{
    static WebDriver driver;
    static Set<String> checkedLinks = new HashSet<>();
    static Queue<String> linkQueue = new LinkedList<>();

    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        String baseUrl = "https://qa-tripgain-next.webc.in/"; 
        linkQueue.add(baseUrl);

        int validCount = 0, brokenCount = 0;

        System.out.println("\n🔍 Scanning website: " + baseUrl + "\n");

        while (!linkQueue.isEmpty())
        {
            String url = linkQueue.poll();

            if (url != null && !checkedLinks.contains(url))
            {
                checkedLinks.add(url);
                int status = checkLink(url);
                
                if (status == 200) 
                {
                    validCount++;
                    extractLinksFromPage(url);
                } else 
                {
                    brokenCount++;
                }
            }
        }

        driver.quit();

        System.out.println("\n✅ Total Links Checked: " + checkedLinks.size());
        System.out.println("✅ Valid Links: " + validCount);
        System.out.println("❌ Broken Links: " + brokenCount);
    }

    // Method to check if a link is valid
    public static int checkLink(String linkUrl)
    {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int responseCode = connection.getResponseCode();

            if (responseCode >= 200 && responseCode < 400) {
                System.out.println("✅ " + linkUrl + " (OK - " + responseCode + ")");
            } else {
                System.out.println("❌ " + linkUrl + " (BROKEN - " + responseCode + ")");
            }
            return responseCode;
        } catch (Exception e) {
            System.out.println("❌ " + linkUrl + " (ERROR - " + e.getMessage() + ")");
            return 0;
        }
    }

    // Method to extract links from a page
    public static void extractLinksFromPage(String pageUrl) 
    {
        try
        {
            driver.get(pageUrl);
            List<WebElement> links = driver.findElements(By.tagName("a"));

            for (WebElement link : links) {
                String newUrl = link.getAttribute("href");

                if (newUrl != null && newUrl.startsWith("http") && !checkedLinks.contains(newUrl)) {
                    linkQueue.add(newUrl);
                }
            }
        } catch (Exception e) {
            System.out.println("⚠️ Error extracting links from: " + pageUrl);
        }
    }
}
