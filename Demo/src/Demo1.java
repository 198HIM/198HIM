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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev=new ListNode(0);//创造一个预先指针
        int carry=0;//求数字是否超过10，超过10下一位要进1
        ListNode cur=prev;//链接两个指针
        while(l1!=null||l2!=null)
        {
           int x=l1!=null?l1.val:0;
           int y=l2!=null?l2.val:0;
           int sum=x+y+carry;
            carry=sum/10;//求是否大于10
           sum=sum%10;//无论怎么样都要求余
           cur.next=new ListNode(sum);
           cur=cur.next;
           if(l1!=null)
           {
               l1=l1.next;
           }
           if(l2!=null)
           {
               l2=l2.next;
           }
           if(carry==1)
           {
               cur.next=new ListNode(carry);//不能直接等于，类型不匹配
           }
        }
            return prev.next;//没有预先指针可能会失去head指针。
    }
}

