package basicPrograms;
import java.util.Arrays;
import java.util.Comparator;

public class LargestValueArrangement {
    public static void main(String[] args) {
        int[] arr = {54, 546, 548, 60};
        String largestValue = arrangeLargestValue(arr);
        System.out.println(largestValue);
    }

    public static String arrangeLargestValue(int[] arr) {
        int[] strArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strArr[i] = Integer.valueOf(arr[i]);
        }
        Arrays.sort(strArr, new LargestValueComparator());
        StringBuilder largestValue = new StringBuilder();
        for (int str : strArr) {
            largestValue.append(str);
        }

        return largestValue.toString();
    }

    static class LargestValueComparator implements Comparator<int> {
        public int compare(int str1, int str2) {
           
            return s2.compareTo(s1); 
        }
    }
}