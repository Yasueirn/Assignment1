import java.util.Scanner;

public class Problem3 {

    public static String check(int n){
        if (n < 2) return "Not composite and not prime";

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return "composite";
        }
        return "prime";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(check(n));

    }
}
