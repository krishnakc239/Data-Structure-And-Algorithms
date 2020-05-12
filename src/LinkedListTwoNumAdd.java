/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.*/

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }

      public String toString(){
          return this.next.val+", "+this.next.next.val+", "+ this.next.next.next.val;
      }
 }
public class LinkedListTwoNumAdd {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode resultNode = addTwoNum(l1,l2);
        while (resultNode.next !=null){
            System.out.print(resultNode.next.val+" > ");
            resultNode = resultNode.next;
        }
    }

    public static ListNode addTwoNum(ListNode l1, ListNode l2){

        ListNode dummy = new ListNode(0);
        ListNode p = dummy;

        int carry = 0;
        while(l1 !=null || l2 !=null){
            int sum = carry;
            if(l1 !=null){
                sum+= l1.val;
                l1=l1.next;
            }
            if(l2 !=null){
                sum+= l2.val;
                l2=l2.next;
            }

            if(sum > 9){
                carry = 1;
                sum = sum-10;
            }else{
                carry = 0;
            }
            ListNode newNode = new ListNode(sum);
            p.next = newNode;
            p = p.next;
        }
        if(carry >0){
            ListNode carryNode = new ListNode(carry);
            p.next = carryNode;
        }
        return dummy;
    }
}
