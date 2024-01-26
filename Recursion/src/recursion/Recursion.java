package recursion;

public class Recursion {

    public static void main(String[] args) {
        Examples e = new Examples();
        e.increment(0);
        System.out.println("\n" + e.faktoriyel(1, 6));
        System.out.println(e.tersFaktoriyel(5));
        System.out.println("\n" + e.fibonacci(8));
    }
    
}
