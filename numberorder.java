package programming;
import java.util.Scanner;

public class anotherronee {
    public static void main (String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai Awal = "); //initial value
        int a = masuk.nextInt();
        System.out.print("Masukkan Nilai Akhir = "); //final value
        int b = masuk.nextInt();
        
        for (var i = a; i<=b; i++) { 
         //we use Statement "for" for repeat initial value until final value
            System.out.println(i); //we gonna display the number
        }
    }
}
