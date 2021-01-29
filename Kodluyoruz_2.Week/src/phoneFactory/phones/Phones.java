package phoneFactory.phones;


import phoneFactory.interfaces.CallAndMessage;
import phoneFactory.interfaces.Share;

public abstract class Phones implements CallAndMessage, Share {

    private String brandName;
    private long imeiNumber;
    private  String versionNumber;
    private String memory;
    private double screenSize;

   private KeyboardEnum keyboard;

    public Phones(KeyboardEnum keyboardEnum) {
        this.keyboard = keyboardEnum;
    }

    public Phones(String brandName, long imeiNumber, String versionNumber, String memory, double screenSize) {
        this.brandName = brandName;
        this.imeiNumber = imeiNumber;
        this.versionNumber = versionNumber;
        this.memory = memory;
        this.screenSize = screenSize;
    }

    @Override
    public void send() {
        System.out.println("You can send message to any number..");
    }



    public KeyboardEnum getKeyboardEnum() {
        return keyboard;
    }

    public void setKeyboardEnum(KeyboardEnum keyboard) {
        this.keyboard = keyboard;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public long getImeiNumber() {
        return imeiNumber;
    }

    public void setImeiNumber(long imeiNumber) {
        this.imeiNumber = imeiNumber;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phones{" +
                "brandName='" + brandName + '\'' +
                ", imeiNumber=" + imeiNumber +
                ", versionNumber='" + versionNumber + '\'' +
                ", memory=" + memory +
                ", screenSize=" + screenSize +
                ", keyboard=" + keyboard +
                '}';
    }
}



