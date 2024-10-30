public class Methodl{
    // Overloaded method with one integer parameter
    private static void display(int a) {
        System.out.println("Arguments: " + a);
    }

    // Overloaded method with two integer parameters
    private static void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        display(1);        // Calls the first display(int a)
        display(1, 4);     // Calls the second display(int a, int b)
    }
}

