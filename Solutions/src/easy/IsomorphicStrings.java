package easy;



import java.util.HashMap;

public class IsomorphicStrings {

    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "badc";
        String t = "baba";
        System.out.println(solution.isIsomorphic(s,t));

    }
    static class Solution{
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character,Character> hashMap = new HashMap<Character, Character>();
            HashMap<Character, Boolean> characterHashMap = new HashMap<Character, Boolean>();
            for(int i = 0;i<s.length();i++){
                if(hashMap.containsKey(s.charAt(i))){
                    if(hashMap.get(s.charAt(i)).equals(t.charAt(i)))
                        continue;
                    else
                        return false;
                }
                else{
                    if(characterHashMap.containsKey(t.charAt(i)))
                        return false;
                    hashMap.put(s.charAt(i),t.charAt(i));
                    characterHashMap.put(t.charAt(i),true);
                }
            }
            return true;
        }
    }

}
