import java.util.Scanner;


public class Problem2 {

    public static double avg(int[] arr){
        double sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return sum/arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(avg(arr));
    }


}
