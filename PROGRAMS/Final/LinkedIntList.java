/**
 * 6. Write a method called hasTwoConsecutive that returns whether or not a
 * list of integers has two adjacent numbers that are consecutive integers
 * (true if such a pair exists and false otherwise). For example, if a
 * variable list stores the values [1, 18, 2, 7, 8, 39, 18, 40], then
 * the call list.hasTwoConsecutive() should return true because the list
 * contains the adjacent numbers (7, 8), which are a pair of consecutive numbers.
 * 
 * @editby J.Ho
 */
public class LinkedIntList {
	private ListNode front; // first value in the list
	
	// post: constructs an empty list
	public LinkedIntList() {
		front = null;
	}
	
	//-------------- Add by J.Ho ----------------
	public boolean hasTwoConsecutive() {
	
		boolean flag = false;
		ListNode current = front;
		
		while(current != null && current.next != null) {
			if(current.data + 1 == current.next.data) {
				flag = true;
				break;
			}
			current = current.next;
		}
		return flag;
	}
	//--------------------------------------
	
	// post: returns the current number of elements in the list
	public int size() {
		int count = 0;
		ListNode current = front;
		while (current != null) {
			current = current.next;
			count++;
		}
		return count;
	}

	// pre : 0 <= index < size()
	// post: returns the integer at the given index in the list
	public int get(int index) {
		return nodeAt(index).data;
	}

	// post: returns comma-separated, bracketed version of list
	public String toString() {
		if (front == null) {
			return "[]";
		} else {
			String result = "[" + front.data;
			ListNode current = front.next;
			while (current != null) {
				result += ", " + current.data;
				current = current.next;
			}
			result += "]";
			return result;
		}
	}

	// post: returns the position of the first occurrence of the
	// given value (-1 if not found)
	public int indexOf(int value) {
		int index = 0;
		ListNode current = front;
		while (current != null) {
			if (current.data == value) {
				return index;
			}
			index++;
			current = current.next;
		}
		return -1;
	}

	// post: appends the given value to the end of the list
	public void add(int value) {
		if (front == null) {
			front = new ListNode(value);
		} else {
			ListNode current = front;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value);
		}
	}

	// pre: 0 <= index <= size()
	// post: inserts the given value at the given index
	public void add(int index, int value) {
		if (index == 0) {
			front = new ListNode(value, front);
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = new ListNode(value, current.next);
		}
	}

	// pre : 0 <= index < size()
	// post: removes value at the given index
	public void remove(int index) {
		if (index == 0) {
			front = front.next;
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = current.next.next;
		}
	}

	// pre : 0 <= i < size()
	// post: returns a reference to the node at the given index
	private ListNode nodeAt(int index) {
		ListNode current = front;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}

}