package deviceFactory;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.remote.DesiredCapabilities;



public abstract class deviceFactory {
    DesiredCapabilities device_android = new DesiredCapabilities();
    public static DesiredCapabilities getMobileDevice(){
        device_android.setCapability();
    }
}
