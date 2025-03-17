import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        // System.out.println(map);
        
        for (String c : completion) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            }
        }
        
        // System.out.println(map);
        
        for (String p: participant) {
            if (map.get(p) != 0) {
                return p;
            }
        }

        
        String answer = "";
        return answer;
    }
}