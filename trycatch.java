package YOUR_PACKAGE_NAME; // if you don't need it, just skip this line

public class YOUR_CLASS_NAME { // if you don't need it, just skip this line and line 23
    public static void main(String[] args) {
        System.out.println("Handling Exception\n");
      
        int a = 10; // we made the initial variable. this is just example
        try { // try the code inside this block
            if (a = 10) { // this should be error just ignore it
                System.out.println("10");
            }
        } catch (Exception e) { // this line will catch the error
            System.out.println("Oh no!"); // and running this line
        }
        
        try { // this another example that code is fine
            if (a == 10) { // this should not error
                System.out.println("10000!!!!");
            }
        } catch (Exception e) { // if anything goes fine in try block
            System.out.println("Oh no!"); // this line will not run
        }
    }
}
