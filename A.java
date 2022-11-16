package YOUR_PACKAGE;

public class YOUT_CLASS {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 6; i++) {
            System.out.print("  ");
        }
        for (int i = 1; i <= 12; i++) {
            System.out.print("* ");
        }
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 10; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
