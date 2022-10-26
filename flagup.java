package YOUR_PACKAGE_NAME;

public class YOUR_CLASS_NAME {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            for (int j = i; j <= 4; j++) {
                System.out.print("  ");
            }
            
            for (int j = i; j <= 4; j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
