package profileschool;
import java.util.Scanner; //must import the Scanner

public class newnewCode {
    public static void main (String[] args) {
        Scanner input/*this name is up to you*/ = new Scanner(System.in); //make input things
        
        System.out.print("Masukan Nilai p: ");
        double p = input.nextDouble(); //we use this from line 6
        System.out.print("Masukan Nilai l: ");
        double l = input.nextDouble();
        double luas = p*l; //count the number of inputs
        System.out.println("Luas Persegi Panjang: "+luas); //display total
    }
}
