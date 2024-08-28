package sdet_assignments;

import java.util.HashMap;
import java.util.Map;

public class P3 {
    public static Map<String, Integer> extractSubstrings(String s) {
        Map<String, Integer> substrCount = new HashMap<>();
        int n = s.length();

       
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substr = s.substring(i, j);
                System.out.println(substr);
                substrCount.put(substr, substrCount.getOrDefault(substr, 0) + 1);
            }
        }

        return substrCount;
    }

    public static void main(String[] args) {
        String inputStr = "abababa";
        Map<String, Integer> result = extractSubstrings(inputStr);

        System.out.println(result);
    }
}
