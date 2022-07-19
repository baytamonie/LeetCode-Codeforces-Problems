package medium;

import easy.PivotIndex;
import utils.ListNode;

import java.util.HashMap;

public class LinkedListCycle2 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(10);
        System.out.println(node2.equals(node1));
    }

    static class Solution {
        public ListNode detectCycle(ListNode head) {

            HashMap<ListNode,Integer> hm = new HashMap<>();
            ListNode node = head;
            int pos = 0;
            while(node!=null){
                if(hm.containsKey(node))
                    return node;
                hm.put(node,pos++);
                node = node.next;
            }
            return null;
        }
    }
}
