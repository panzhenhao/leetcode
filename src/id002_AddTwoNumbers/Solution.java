package id002_AddTwoNumbers;

public class Solution {
	// Definition for singly-linked list.

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode reTemp = new ListNode(2);
		ListNode re = null;
		int temp = 0;
		int carry = 0;
		while (l1 != null) {
			if (l2 != null) {
				temp = l1.val + l2.val + carry;
				carry = 0;
				if (temp >= 10) {
					temp = temp - 10;
					carry = carry + 1;
				}
				if (re == null) {
					re = new ListNode(temp);
					reTemp.next =re;
				} else {
					re.next = new ListNode(temp);
					re=re.next;
				}
				l1 = l1.next;
				l2 = l2.next;
			}else{
				temp = l1.val + carry;
				carry = 0;
				if (temp >= 10) {
					temp = temp - 10;
					carry = carry + 1;
				}
				if (re == null) {
					re = new ListNode(temp);
					reTemp.next =re;
				} else {
					re.next = new ListNode(temp);
					re=re.next;
				}
				l1 = l1.next;
			}
		}
		while(l2!=null){
			temp = l2.val + carry;
			carry = 0;
			if (temp >= 10) {
				temp = temp - 10;
				carry = carry + 1;
			}
			if (re == null) {
				re = new ListNode(temp);
				reTemp.next =re;
			} else {
				re.next = new ListNode(temp);
				re=re.next;
			}
			l2 = l2.next;
		}
		if (carry == 1) {
			re.next = new ListNode(carry);
		}

		return reTemp.next;

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode l;
		l = solution.addTwoNumbers(l1, l2);

		while (l != null) {
			System.out.println(l.val);
			l = l.next;
		}
	}

}
