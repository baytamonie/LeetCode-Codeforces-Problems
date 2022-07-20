package easy;

import utils.ListNode;

import java.util.HashMap;

public class IsSubsequence {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s2 = "abc";
        String t2 = "ahbgdc";
        String t1 = "axc";
        String s1 = "ahbgdc";
        System.out.println(solution.isSubsequence(s2, t2));
        System.out.println(solution.isSubsequence(s1, t1));

    }

    static class Solution {
        public boolean isSubsequence(String s, String t) {
            int j = 0;

            for(int i = 0;i<t.length();i++){
                if(j>=s.length())
                    break;
                if(s.charAt(j) == t.charAt(i))
                    j++;
            }
            return  j == s.length();
        }
    }

}
