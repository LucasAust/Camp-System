import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class CampUI {
    private Scanner scanner;
    private Facade facade;
    private Random rand;

    public CampUI() {
        scanner = new Scanner(System.in);
        facade = new Facade();
        rand = new Random();
    }

    public void run() {

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CampUI campUI = new CampUI();
        campUI.run();
        System.out.println("Would you like to exit the program? Enter 'y' or 'n'.");
        String ans = scanner.nextLine();
        if(ans.equals("n"));
        System.out.println("Thank you for looking at our camp.");
        System.exit(0);
    }
}