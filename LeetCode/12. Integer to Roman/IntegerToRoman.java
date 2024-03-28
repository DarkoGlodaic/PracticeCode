public class IntegerToRoman {
    public static void main(String[] args) {
        // Keep in mind there is no check for valid input
        int num = Integer.parseInt(args[0]);
        String result = toRoman(num);


        System.out.println("\nRESULT: " + result);
    }


    public static String toRoman(int num) {
        String result = "";
        // We make two corresponding value arrays, intArray where the indexes match romanArray's corresponding numerals
        // for example 400 is written as CD in roman numerals: index 3 is 400 in intArray while being CD in romanArray
        int[] intArray = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanArray = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < intArray.length; i++) {
            while (num >= intArray[i]) {
                result += romanArray[i];
                num -= intArray[i];
            }
        }
        return result;
    }
}
