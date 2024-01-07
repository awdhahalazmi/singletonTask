package iphone;

public class Iphonemain {
    public static void main(String[] args) {
        IphoneSettings iphoneset = IphoneSettings.getInstance();
        // iphoneset.getBrightness() = 40;
        // iphoneset.getdiseWifi() = true;
        iphoneset.setBrightness(22);
        iphoneset.setDisWifi(false);
        iphoneset.setVolume(5);

        System.out.println(iphoneset.getBrightness());
        System.out.println(iphoneset.getVolume());
        System.out.println(iphoneset.getdisWifi());
    }

}
