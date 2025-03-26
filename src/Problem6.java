import java.util.Scanner;

public class Problem6 {

    public static int pw(int n, int b){
        int result = 1;

        for (int i = 1; i <= b; i++){
            result *= n;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(pw(n,b));
    }
}
