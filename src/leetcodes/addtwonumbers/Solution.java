package leetcodes.addtwonumbers;

import javax.sound.sampled.Line;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *///Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode answer = new ListNode(0);
        ListNode first = answer;

        while(l1 != null || l2 != null){
            if(l1!= null && l2 != null){
                answer.next = new ListNode (l1.val + l2.val );
                answer = answer.next;
                l1 = l1.next;
                l2 = l2.next;
                continue;
            }
            if(l1 == null){
                answer.next = new ListNode(l2.val);
                answer = answer.next;
                l2 = l2.next;
                continue;
            }
            if(l2 == null){
                answer.next = new ListNode(l1.val);
                answer = answer.next;
                l1 = l1.next;
                continue;
            }


        }

        ListNode iterator = first;
        while (iterator != null){
            int overflow;
            if(iterator.val >= 10){
                overflow = iterator.val/10;
                iterator.val = iterator.val -10;
                if(iterator.next == null)
                    iterator.next = new ListNode(overflow);
                else
                    iterator.next.val += overflow;
            }
            iterator = iterator.next;

        }


       return first.next;
    }

    public static void main(String[] args) {
        ListNode first1 = new ListNode(9);
        ListNode first2 = new ListNode(9);

        ListNode re = addTwoNumbers(first1, first2);


        while(re != null){
            System.out.println(re.val);
            re = re.next;

        }


    }
}