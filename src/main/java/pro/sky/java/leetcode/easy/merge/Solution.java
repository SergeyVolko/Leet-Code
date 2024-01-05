package pro.sky.java.leetcode.easy.merge;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode result = new ListNode();
        ListNode tmp = result;
        while (true) {
            if (list1.val < list2.val) {
                tmp.val = list1.val;
                list1 = list1.next;
                if (list1 == null) {
                    tmp.next = list2;
                    break;
                }
            } else {
                tmp.val = list2.val;
                list2 = list2.next;
                if (list2 == null) {
                    tmp.next = list1;
                    break;
                }
            }
            tmp.next = new ListNode();
            tmp = tmp.next;
        }
        return result;
    }

    public ListNode mergeTwoListsRecourse(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null)
        {
            if(list1.val < list2.val)
            {
                list1.next =  mergeTwoListsRecourse(list1.next,list2);
                return list1;
            }
            else
            {
                list2.next = mergeTwoListsRecourse(list1,list2.next);
                return list2;
            }
        }
        if(list1 == null)
            return list2;
        return list1;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = new Solution().mergeTwoListsRecourse(list1, list2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }
}
