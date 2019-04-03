import java.util.*;

class StackDS {
    protected int array[];
    protected int top, size, length;

    public StackDS(int size) {
        this.size = size;
        length = 0;
        array = new int[this.size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {    // this method will check if the stack is fill or not
        return top == size - 1;
    }

    public int getSize() {  // this method will check  the stack size
        return length;
    }

    public int peek() {          // this method will return the top element of the stack
        if (isEmpty())
            throw new NoSuchElementException("Stack is empty");
        return array[top];
    }

    // function to add element in the stack
    public void push(int i) {
        if (top >= size - 1)// if array if full
            throw new IndexOutOfBoundsException("Overflow");
        if (top < size)// array is not full
        {
            top = top + 1;
            array[top] = i;
        }
        length++;
    }

    public int pop() {              // this method will remove the top element of the stack
        int ele;
        if (isEmpty())
            throw new NoSuchElementException("Underflow");
        length--;
        ele = array[top];
        top = top - 1;
        return ele;
    }

    public void display() {                   
        System.out.print("STACK   ");
        if (length == 0) {
            System.out.print("Stack is Empty");
            return;
        }
        for (int i = top; i >= 0; i--) { 
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

class Stack {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int n = scan.nextInt();
        int ch ;


        StackDS stack = new StackDS(n);

        do {
            System.out.println("1->Push\n2->Pop\n3->Peek\n4->Is Empty\n5->Is Full\n6->Size\n7->Display\n8->Exit");

            System.out.println("Enter your choice");
            
              ch=scan.nextInt();
            switch (ch) {
            case 1:
                System.out.println("Enter integer element to push");
                try {
                    int item = scan.nextInt();
                    stack.push(item);
                } catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
                break;

            case 2:
                try {

                    System.out.println("The Element that is poped is " + stack.pop());
                } catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
                break;

            case 3:
                try {
                    System.out.println("Peek element" + stack.peek());
                } catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
                break;
            case 4:
                try {
                    System.out.println("Stack is Empty" + stack.isEmpty());
                } catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
                break;
            case 5:
                try {
                    System.out.println("Stack is full" + stack.isFull());
                } catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
                break;
            case 6:
                try {
                    System.out.println("Stack size" + stack.getSize());
                } catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
                break;
            case 7:
                try {
                    stack.display();
                } catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
                break;
            default:
                System.out.println("WRONG INPUT");
                break;
            }
        }while(ch!= 8);
    }
}
