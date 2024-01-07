package iphone;

public class IphoneSettings {
    private static IphoneSettings instance;

    private int brightness = 67;
    private boolean disWifi = false;
    private boolean enableWifi = true;
    private int volume = 2;

    private IphoneSettings() {

    }

    public static IphoneSettings getInstance() {
        if (instance == null) {
            instance = new IphoneSettings();
        }
        return instance;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setDisWifi(boolean disWifi) {
        this.disWifi = false;
    }

    public boolean getdisWifi() {
        return disWifi;
    }

    public void setEnWifi(boolean enableWifi) {
        this.enableWifi = true;
    }

    public boolean getEnableWifi() {
        return enableWifi;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
