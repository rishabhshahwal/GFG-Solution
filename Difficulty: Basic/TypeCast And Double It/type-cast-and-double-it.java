import java.util.*;

class GFG {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        // Typecast to int, double it, and print
        int ans = Integer.parseInt(num) * 2;

        System.out.println(ans);
    }
}