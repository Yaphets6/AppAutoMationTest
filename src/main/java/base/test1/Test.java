package base.test1;

public class Test {
    private String deviceName;
    private String deviceType;
    private String deviceVersion;


    public Test() {
    }

    public Test(String deviceName, String deviceType, String deviceVersion) {
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.deviceVersion = deviceVersion;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceVersion() {
        return deviceVersion;
    }

    public void setDeviceVersion(String deviceVersion) {
        this.deviceVersion = deviceVersion;
    }


}
