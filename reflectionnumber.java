package YOUR_PACKAGE NAME;

public class reflectionnumber{
    public static void main(String[] args) {
        int a = 5; //just for display number
        
        for (int i = 1; i <= 5; i++) { // this line for make a column
            for (int k = 1; k <= 5-i; k++) { // this line for a gap to make it like triangle
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+i); // this line for display number
            }
            // 2 'for' above is to make the row
            System.out.println(" "); // make it cool :)
        }
        System.out.println("-----------"); // just line :V
        
        //we gonna make it opposite from above triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k <= 5-i; k++) {
                System.out.print(a+" ");
            }
            a--; //just decresing the number to make it opposite :L
            System.out.println(" ");
        }
    }
}
