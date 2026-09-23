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
    public ListNode removeZeroSumSublists(ListNode head) {
        List<Integer> li = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            li.add(temp.val);
            temp = temp.next;
        }

        boolean changed = true;

        while (changed) {

            changed = false;

            for (int i = 0; i < li.size(); i++) {

                int s = 0;

                for (int j = i; j < li.size(); j++) {

                    s += li.get(j);

                    if (s == 0) {

                        li.subList(i, j + 1).clear();

                        changed = true;
                        break;
                    }
                }

                if (changed) {
                    break;
                }
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (int i = 0; i < li.size(); i++) {
            curr.next = new ListNode(li.get(i));
            curr = curr.next;
        }
        return dummy.next;

    }
}