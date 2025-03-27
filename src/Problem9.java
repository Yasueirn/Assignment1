import java.util.Scanner;

public class Problem9 {

    public static int bc(int n, int k){
        if (k == 0 || k == n){
            return 1;
        }

        return bc(n - 1, k) + bc(n - 1, k - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(bc(n, k));

    }
}
