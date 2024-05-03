public class VersionNumberComparisson {

    public static void main(String[] args) {
        System.out.println("Result: " + CompareVersionNumber("1.0", "1"));
    }

    public static int CompareVersionNumber(String version1, String version2) {
        String[] version1Array = version1.split("\\.");
        String[] version2Array = version2.split("\\.");
        int current1 = 0;
        int current2 = 0;
        int i = 0;
        int j = 0;

        while(i < version1Array.length && j < version2Array.length) {
            current1 = Integer.parseInt(version1Array[i]);
            current2 = Integer.parseInt(version2Array[i]);
            if (current1 > current2) return 1;
            else if (current1 < current2) return -1;

            i++; j++;
        }

        while(i < version1Array.length && Integer.parseInt(version1Array[i]) == 0) i++;
        while(j < version2Array.length && Integer.parseInt(version2Array[j]) == 0) j++;

        if(i < version1Array.length) return 1;
        if(j < version2Array.length) return -1;
        return 0;
    }
}
