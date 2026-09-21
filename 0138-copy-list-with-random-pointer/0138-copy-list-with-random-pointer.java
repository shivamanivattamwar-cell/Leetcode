/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> hm = new HashMap<>();
        Node temp = head;

        while (temp != null) {
            hm.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        Node dummy = new Node(-1);
        Node curr = dummy;
        temp = head;

        while (temp != null) {
            curr.next = hm.get(temp);
            curr = curr.next;
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            if (temp.random != null) {
                hm.get(temp).random = hm.get(temp.random);
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}