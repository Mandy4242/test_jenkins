
public class Stack 
{
   private int top;
   private int maxSize;
   private int[] arr;
   
   Stack(int maxSize)
   {
	   this.top = -1;
	   this.maxSize=maxSize;
	   arr = new int[maxSize];
   }
   
   public Boolean isFull()
   {
	   if(top>=(maxSize-1))
	   {
		   return true;
	   }
	   return false;
   }
   public Boolean push(int data)
   {
	   if(isFull())
	   {
		   return false;
	   }
	   else
	   {
		   arr[++top]=data;
		   return true;
	   }
   }
   
   
}
