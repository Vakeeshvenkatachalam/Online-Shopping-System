import java.util.Scanner;

public class Utils {
    static Scanner sc = new Scanner(System.in);

    public static int getInt(String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    public static String getString(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static void waitForEnter() {
        System.out.println("Press Enter to continue...");
        sc.nextLine();
    }
}