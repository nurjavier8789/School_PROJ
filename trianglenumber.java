package YOUR_PACKAGE_NAME;

public class playground {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                b += a;
                System.out.print(a+"\t");
                a+=3;
            }
            System.out.println(" ");
        }
        System.out.println("\nTotal: "+b);
    }
}
