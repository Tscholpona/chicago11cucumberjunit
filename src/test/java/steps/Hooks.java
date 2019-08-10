package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    //@Before(value = "@amazon",order = 1)
    @Before
    public void setup(){
        System.out.println("This is hooks setup method");
    }
    @Before(order = 2)
    public void setup2(){
        System.out.println("This is hook setup for google");
    }
    @After
    public void tearDown(Scenario ss){
        System.out.println("Hooks clean up");
        System.out.println(ss.getName());
        System.out.println(ss.getStatus());
        if(ss.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            //attach to report
            ss.embed(screenshot,"image/png");

        }
    }

}
