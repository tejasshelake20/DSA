package QueueUsingStack;
import java.util.Stack;

 // Efficient O(1) - Insertion and O(N) - Removal
class QueueUsingStack {

     private Stack<Integer> first;
     private Stack<Integer> second;
     private int x;

     public QueueUsingStack() {
         first = new Stack<>();
         second = new Stack<>();
     }

     public void push(int x) throws Exception{
         first.push(x);
     }

     public int pop() {

         while (!first.isEmpty()) {
             second.push(first.pop());
         }

         int removed = second.pop();

         while (!second.isEmpty()) {
             first.push(second.pop());
         }
         return removed;
     }

     public int peek() {
         while (!first.isEmpty()) {
             second.push(first.pop());
         }

         int peeked = second.peek();

         while (!second.isEmpty()) {
             first.push(second.pop());
         }
         return peeked;
     }

     public boolean empty() {
         return first.isEmpty();
     }

 }

