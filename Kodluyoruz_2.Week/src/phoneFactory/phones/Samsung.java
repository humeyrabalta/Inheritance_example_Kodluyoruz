package phoneFactory.phones;

import phoneFactory.interfaces.ListenMusic;

public class Samsung extends Phones implements ListenMusic {

    public Samsung(String brandName, long imeiNumber, String versionNumber, String memory, double screenSize) {
        super(brandName, imeiNumber, versionNumber, memory, screenSize);
    }

    public Samsung(KeyboardEnum keyboardEnum) {
        super(keyboardEnum);
    }

    @Override
    public void call() {
        System.out.println("You can call any number.");
    }

    @Override
    public void share() {
        System.out.println("You can share your files..");
    }

    @Override
    public void listen() {
        System.out.println("You can listen MP3.");

    }
}
