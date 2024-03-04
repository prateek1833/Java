import java.util.HashMap;

public class LargestSumZero {
    public static void main(String arg[]) {
        int a[] = { 15, 2, -2, 8, -7, -1, 6 };
        int sum = 0;
        int len = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (map.containsKey(sum)) {
                len = Math.max(len, (i - map.get(sum)));
            }
            else{
                map.put(sum, i);
            }
        }
        System.out.print("Largest subarray  with Sum zero = "+len );
    }

}
