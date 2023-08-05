import java.util.Scanner;

public class ruff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read the number of test cases

        for (int i = 0; i < t; i++) {
            int N = scanner.nextInt(); // Read the value of N for the current test case
            int[] arr = new int[N]; // Create an empty array of size N
            int start = 0;
            int end = N - 1;
            int num = 1;

            while (start <= end) {
                arr[start] = num;
                start++;
                num += 2;

                if (start <= end) {
                    arr[end] = num;
                    end--;
                    num += 2;
                }
            }

            for (int j = 0; j < N; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
