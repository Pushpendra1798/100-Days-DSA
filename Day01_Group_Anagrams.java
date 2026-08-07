import java.util.*;
class Day01_Group_Anagrams {


    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str  :strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            // if(!map.containsKey(key)) {
            //     map.put(key, new ArrayList<>());
            // }

            // map.get(key).add(str);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str); // Replace above three lines ofcode
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            String[] strs = new String[N];
            for(int i=0; i<N; i++) {
                strs[i] = sc.next();
            }
            System.out.println(groupAnagrams(strs));
        }
    }
}