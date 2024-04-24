// Looping solution - faster and more space efficient than HashMap approach.
public class TribonacciNumber {
    public static void main(String[] args) {
        System.out.println("RESULT: " + findTribonacci(37));
    }
    public static Integer findTribonacci(int n) {
        // Covering first 3 cases
        if(n == 0) {
            return 0;
        }
        if(n == 1 || n == 2) {
            return 1;
        }

        int prev1 = 0;
        int prev2 = 1;
        int prev3 = 1;
        int current = 0;

        for(int i = 3; i <= n; i++) {
            current = prev1 + prev2 + prev3;
            prev1 = prev2;
            prev2 = prev3;
            prev3 = current;
        }

        return current;
    }
}
