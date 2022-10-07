package YOUR_PACKAGE_NAME;

public class playground {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                b += a;
                System.out.print(a+"\t");
                a+=3;
            }
            System.out.println(" ");
        }
        System.out.println("\nTotal: "+b);
    }
}
