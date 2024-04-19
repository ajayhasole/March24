class Stack{
 static final int max=5;
 int top;
 int arr[]=new int[max];
 Stack(){
	top=-1;
 }
/*int isEmpty(){
  return top<0;
 }
 int isFull(){
 return top>max;
 }*/
 void push(int data){
  if(top>=max-1){
     System.out.println("Stack Is Overflow");
  }else{
    arr[++top]=data;  
  }
 }
   void pop(){
    if(top<0){
	 System.out.println("Stack underflow");
	}else{
	     int x=arr[--top];
		 //System.out.println(x);
		
	}
    
   }
   void display(){
   for(int i=0;i<top;i++){
      System.out.println(arr[i]);
   }
   }
  public static void main(String arg[]){
     Stack s=new Stack();
	 s.push(11);
	  s.push(12);
	   s.push(13);
	    s.push(14);
		s.display();
		System.out.println("--------------------------------------");
		s.pop();
		s.pop();
		s.display();
  1
  }
}