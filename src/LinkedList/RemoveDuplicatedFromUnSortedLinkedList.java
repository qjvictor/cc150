package LinkedList;


/**
 * delete duplicated from an unsorted linkedlist.
 * what if temporary buffer is not allowed.
 * @author VictorQian
 *
 */
public class RemoveDuplicatedFromUnSortedLinkedList {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode current = head;
		while (current != null) {
			ListNode runner = current;
			while (runner.next != null) {
				if (runner.next.val == current.val) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current=current.next;
		}
		return head;
    }

	public static void main(String[] args) {
		RemoveDuplicatedFromUnSortedLinkedList r = new RemoveDuplicatedFromUnSortedLinkedList();
		ListNode head = new ListNode(new int[] { 0,1,2,2,1,1,2,3,2,3,1});
		ListNode ret = r.deleteDuplicates(head);
		ret.print();
	}
}
