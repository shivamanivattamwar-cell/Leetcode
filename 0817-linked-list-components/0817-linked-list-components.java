/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        int c=0;
        HashSet<Integer> hs1=new HashSet<>();
        for(int x:nums){
            hs1.add(x);
        }
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            if(hs1.contains(temp.val) && (prev==null || !hs1.contains(prev.val))){
                c++;
            }
            prev=temp;
            temp=temp.next;
        }

        return c;

    }
}