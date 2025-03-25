import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws Exception {

        // 네이버로 이동
        driver.get("https://nid.naver.com/nidlogin.login");

        Scanner sc = new Scanner(System.in);

        System.out.print("id : ");
        String id = sc.nextLine();
        System.out.print("pw : ");
        String pw = sc.nextLine();

        // 아이디/비번 입력
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('id').value='" + id + "'");
        js.executeScript("document.getElementById('pw').value='" + pw + "'");

        // 로그인 버튼 클릭
        WebElement loginButton = driver.findElement(By.id("log.login"));
        loginButton.click();

    }
}
