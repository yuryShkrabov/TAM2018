package object_model.sevice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {

    public static int enterPrice() {
        Scanner priceScanner;
        int price;
        try {
            priceScanner = new Scanner(System.in);
            price = priceScanner.nextInt();
            return price;
        } catch (InputMismatchException e) {
            System.out.println("Invalid data type.");
            return 0;
        }
    }
}
