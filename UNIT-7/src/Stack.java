
public class Stack
{
   private int count;
   private Object data[] = new Object [50];
   public Stack ()
   {
      count = 0;
   }


   public void push (Object addMe)
   {
      data [count] = addMe;
      count++;
   }


   public int size ()
   {
      return count;
   }


   public boolean isFull ()
   {
      return (count == 50);
   }


   public Object pop ()
   {
      count--;
      return data [count];
   }


   public Object peek ()
   {
      return data [count--];
   }


   public boolean isEmpty ()
   {
      return count == 0;
   }


   public void clear ()
   {
      count = 0;
   }
}