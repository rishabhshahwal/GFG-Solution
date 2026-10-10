import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // If n is odd, you take the last turn. If even, your friend does.
        if (n % 2 != 0) {
            System.out.println("You");
        } else {
            System.out.println("Friend");
        }

        sc.close();
    }
}