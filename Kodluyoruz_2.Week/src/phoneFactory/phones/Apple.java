package phoneFactory.phones;

public class Apple extends Phones{

    public Apple(String brandName, long imeiNumber, String versionNumber, String memory, double screenSize) {
        super(brandName, imeiNumber, versionNumber, memory, screenSize);
    }

    public Apple(KeyboardEnum keyboardEnum) {
        super(keyboardEnum);
    }

    @Override
    public void call() {
        System.out.println("You can call any number.At the same time: You can video call.");
    }

    @Override
    public void share() {
        System.out.println("You can share your screen..");
    }


}
