import java.util.Scanner;

public class Collatz_Conjecture {
    public static void main(String[] args) {
        int n;
        int even = 0, odd = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Collatz Conjecture.\n\n");

        System.out.println("Enter a value greater than 1");
        n = scanner.nextInt();

        while(n > 1){
            if(n % 2 == 0){
                n /= 2;
                even++;
            }
            else if(n % 2 != 0){
                n *= 3;
                n++;
                odd++;
            }
        }
        System.out.println("It took " + even + " divisions and " + odd + " multiplications + 1");
    }
}
