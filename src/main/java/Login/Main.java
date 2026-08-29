package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + i);
//<<<<<<< HEAD
            System.out.println("hassan");
            // System.out.println("Momina");
//=======
            System.out.println("MominaNewchanges");
            WebDriver driver= new ChromeDriver();
            driver.get("https://www.youtube.com/watch?v=68XLP0ayjPA&list=PLL34mf651faMBuvJa915xQ-BU6lB1Km84&index=6");
            Thread.sleep(10000);
            driver.findElement(By.xpath("//*[@id=\"trailing-icon\"]/span[1]")).click();

        }
    }
}
