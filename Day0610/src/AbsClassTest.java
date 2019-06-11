public abstract class Memory {//추상 클래스
 protected int arr[];
 protected int i=0;
 public Memory() {
  arr = new int[5];
 }
 public void Push(int data) {
  arr[i++]=data;
  
 }
 public abstract int Pop();
}
public class Stack extends Memory{//스택 클래스


 
 public int Pop() {
  int Popdata=arr[--i];
  arr[i]=0;
  return Popdata;
 }
}
public class Q extends Memory{//큐 클래
 private int j=0;
 
 public int Pop() {
  int Popdata=arr[j];
  arr[j++]=0;
  return Popdata;
 }
}
public class main {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  Memory mem = new Stack();//동적 binding
  mem.Push(10);
  mem.Push(20);
  mem.Push(30);
  
  System.out.println(mem.Pop());
  System.out.println(mem.Pop());
  System.out.println(mem.Pop());
  mem = new Q();
  
  mem.Push(10);
  mem.Push(20);
  mem.Push(30);
  
  System.out.println(mem.Pop());
  System.out.println(mem.Pop());
  System.out.println(mem.Pop());  
  
  
  
 }

}
