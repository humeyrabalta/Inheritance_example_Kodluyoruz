package phoneFactory;


import phoneFactory.phones.Apple;
import phoneFactory.phones.KeyboardEnum;
import phoneFactory.phones.Samsung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Samsung samsung = new Samsung("GalaxyS8",123456789,"C4895", "2048 MB", 5.6);
        samsung.setKeyboardEnum(KeyboardEnum.KEYPAD);
        System.out.println("Samsung" + samsung.toString());

        samsung.call();
        samsung.send();
        samsung.share();
        samsung.listen();

        System.out.println("----------------------------------");

        Apple apple = new Apple("Iphone12Pro",987654321,"A1920", "4096 MB", 6.1);
        apple.setKeyboardEnum(KeyboardEnum.TOUCHABLE);
        System.out.println("Apple "+ apple.toString());
        apple.call();
        apple.send();
        apple.share();


        System.out.println("Which phone do you want to buy ?" + "You can press for Apple to 1 or for Samsung to 2.");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if (i == 20) {
            System.out.println("Samsung congratulates you");
        }else {
            System.out.println("Apple congratulates you");
        }








    }
}
