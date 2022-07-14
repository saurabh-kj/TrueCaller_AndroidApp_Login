import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestTruecaller {
    AndroidDriver driver = null;
    TestTruecallerPF tpf;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability("appWaitPackage", "com.truecaller");
        cap.setCapability("appWaitActivity", "com.truecaller.ui.WizardActivity");
        cap.setCapability("appPackage", "com.truecaller");
        cap.setCapability("appActivity", "com.truecaller.ui.TruecallerInit");
        cap.setCapability("udid", "RZ8N50HKXFW");
        cap.setCapability("appWaitDuration","50000");
//        cap.setCapability("noReset", "true");
//        cap.setCapability("fullReset", "false");
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver(url, cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        tpf = new TestTruecallerPF(driver);
    }

    @Test
    public void loginTruecaller() throws InterruptedException {
        tpf.clickGetStarted();
        tpf.setTrueCallerDefault1();
        tpf.setTrueCallerDefault2();
        tpf.allowContact();
        tpf.allowContactPermission();
        tpf.denySuggestedNumber();
        tpf.login();
        tpf.completeProfile();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
