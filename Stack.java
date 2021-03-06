import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


interface IStack {
    void push(Object o);
    Object pop();

}

class StackImpl implements IStack
{
    protected Object[] stackArray;
    protected int tos;

    public StackImpl(int capacity)
    {
        tos=-1;
        stackArray = new Object[capacity];
    }

    public void push(Object item)
    {
        //if(!isFull())
       // {
        tos++;
        stackArray[tos]=item;
       // }
    }

    public Object pop()
    {
        //if(!isEmpty())
            return stackArray[tos--];
    }
  

    public Object peek()
    {
        //if(!isEmpty())
        return stackArray[tos];
    }
   
}

interface ISafeStack extends IStack
{
    boolean isEmpty();
    boolean isFull();
}

class SafeStackImpl extends StackImpl implements ISafeStack
{
    public SafeStackImpl(int capacity)
    {
        super(capacity);
    }

      public boolean isFull()
    {
        return (tos==stackArray.length-1);
    }
     public boolean isEmpty()
    {
        return (tos==-1);
    }
}
public class Stack {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // Declare the variable
        int a;
        
        // Read the variable from STDIN
        a = in.nextInt();
        
        // Output the variable to STDOUT
        System.out.println(a);
   }
}
