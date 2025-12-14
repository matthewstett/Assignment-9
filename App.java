//Matthew Stettnisch Assignment 9


// (Assignment Instructions)
/*
1. Take the stack I created and find the maximum and minimum value
2. Find out how many elements were in the stack
3. Find the middle value of the linkedlist I created
4. Implement a real life example of any of the structures and do at least 3 operations to it
*/

import java.util.Stack;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<Integer> stax = new Stack<>();
        
        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);

        // the method size() returns how many things are in the stack:
        int stackItems = stax.size();

        //Prints out the amount of elements in the stack (by printing stackItems variable)
            System.out.println(stackItems);
            // Peek is used to look at the top item, doesnt remove or add it 

            int minimumValue = stax.peek();
            int maximumValue = stax.peek();

            /*
            This goes through the stack (stax) one at a time, the varible number holds the varible
            temporarily throughout the loop
            */
            for (int number : stax) {

                if (number > minimumValue) {
                    minimumValue = number;
                }
                if (number > maximumValue) {
                    maximumValue = number;
                }

            }
        System.out.println("The stack minimum value is:" + minimumValue);
        System.out.println("The stack maximum value is: " + maximumValue);
        
        
        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);

        // Looks at how many items are in the list
        int listsSize = linky.size();     

        // Dividing by 2 provides the middle index
        int middleIndex = listsSize / 2;   
        //assigning the integer variable middleIndex to give us the element at the middle index
        int middleValue = linky.get(middleIndex);

        // Print out the values/answers:
        System.out.println("The LinkedList size  is: " + listsSize);
        System.out.println("The LinkedList middle index is: " + middleIndex);
        System.out.println("The LinkedList middle value is: " + middleValue);


        Stack<String> newStack = new Stack<>();
        
        // How the push, pop, and peak can be used (interfacing wiht a computer/app in this case)

        // Push for when the user does actions that we store
        newStack.push("Typed banana");
        newStack.push("Deleted a word");
        newStack.push("Copy and Paste a sentence");

        // Peek allows you to see the most recent action and doesnt remove anything
        String newUndo = newStack.peek();
        System.out.println("The next action to undo " + newUndo);

        // Undoes the recent action, and removes it too
        String undoAction = newStack.pop();
        System.out.println("The Undid action " + undoAction);


    }
}
