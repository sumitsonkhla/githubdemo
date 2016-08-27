package com.algorithms.recursion;


/**
 * Sort the Stack using push and pop operation(Original Code) .
 * 
 * Pseudo-code should be followed.
 * sortStack(stack S)
	if stack is not empty:
		temp = pop(S);  
		sortStack(S); 
		sortedInsert(S, temp);
---------		------------------------
		 sortedInsert(Stack S, element)
	if stack is empty OR element > top element
		push(S, elem)
	else
		temp = pop(S)
		sortedInsert(S, element)
		push(S, temp)
 * 
 * @author Judas
 * 
 */
public class StackReverse {
	static int top = -1, size = 0;

	public static void main(String args[]) {
		int[] stack = { 43, 9, 45, 2, 1 };
		size = stack.length;
		top = stack.length - 1;
		try {
			int largest = pop(stack);
			sort(stack, largest);
			for (int i = 0; i < size; i++) {
				System.out.println(stack[i] + " ");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sort the stack recursively.
	 * 
	 * @param stack
	 * @param largest
	 * @throws Exception
	 */
	private static void sort(int[] stack, int largest) throws Exception {
		if (isEmpty(stack)) {
			push(stack, largest);
			return;
		}

		int k = pop(stack);
		int temp = 0;
		if (k > largest) {
			temp = largest;
			largest = k;
		} else {
			temp = k;
		}
		sort(stack, largest);
		push(stack, temp);
	}

	/**
	 * Push into the stack.
	 * 
	 * @param stack
	 * @param value
	 * @throws Exception
	 */
	private static void push(int[] stack, int value) throws Exception {
		if (top == size) {
			new Exception("Stack Full");
		}
		top++;
		stack[top] = value;
	}

	/**
	 * Pop from the stack.
	 * 
	 * @param stack
	 * @return
	 * @throws Exception
	 */
	private static int pop(int[] stack) throws Exception {
		if (isEmpty(stack)) {
			new Exception("Stack Empty");
		}
		int k = stack[top];
		top--;
		return k;
	}

	/**
	 * check if an array is empty or not.
	 * 
	 * @param stack
	 * @return
	 */
	private static boolean isEmpty(int[] stack) {
		if (top == -1)
			return true;

		return false;
	}

}
