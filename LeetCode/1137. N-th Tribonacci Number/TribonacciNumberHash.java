// Simple HashMap solution - slower and less space efficient
import java.util.HashMap;

public class TribonacciNumberHash {
    public static void main(String[] args) {
       HashMap<Integer, Integer> t = new HashMap<Integer, Integer>();
       t.put(0, 0);
       t.put(1, 1);
       t.put(2, 1);
       
       // Test with 37 to see how much slower this solution is than TribonacciNumber.java
       System.out.println("RESULT: " + findTribonacci(4, t));
    }

    public static Integer findTribonacci(int n, HashMap<Integer, Integer> t) {
        if(t.get(n) != null) {
            return t.get(n);
        }

        return findTribonacci(n - 3, t) + findTribonacci(n - 2, t) + findTribonacci(n - 1, t);
    }
}
