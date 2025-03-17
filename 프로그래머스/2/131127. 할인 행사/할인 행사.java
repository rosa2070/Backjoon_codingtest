import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i=0; i<want.length; i++) {
            map2.put(want[i], number[i]);
        }
        // System.out.println(map2);
    
        
        for (int i=0; i< discount.length -9; i++) {
            HashMap<String, Integer> map = new HashMap<>();

            for (int j=i; j<i+10; j++) {
                // System.out.print(discount[j]);
                map.put(discount[j], map.getOrDefault(discount[j], 0) + 1);
            }
            
            if (map.equals(map2)) {
                answer++;
            }
            // System.out.println(map);
            // System.out.println();
        }
        // 반복 : discount - 10 + 1
        return answer;
    }
}