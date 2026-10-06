import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        // Convert to lowercase to handle both uppercase and lowercase inputs uniformly
        char lowerCh = Character.toLowerCase(ch);

        // Check if the character is a vowel
        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}