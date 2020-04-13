import java.util.*;
class Node{
	int data;
	Node next;
}
public class StackusingLL{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	Stack si=new Stack();
	si.push(10);
	si.push(20);
	si.push(30);
	si.push(40);
	si.push(50);
	System.out.println("peek:-  "+si.peek(2));
	si.display();
	System.out.println(si.pop());
	System.out.println("StacktTop:-  "+si.stackTop());
	
	 
	}
}
class Stack{
	Node top;
	public void push(int data){
		Node node=new Node();
		if(node==null){
			System.out.println("OverFlow condition");
		}else{
			node.data=data;
			node.next=top;
			top=node;
		}
	}
	public int pop(){
		int x=-1;
		if(top==null){
			System.out.println("UnderFlow COndtion");
		}else{
			Node t=top;
			top=top.next;
			x=t.data;
			t=null;
		}
		return x;
	}
	public void display(){
		Node t=top;
		while(t!=null){
			System.out.println("data:- "+t.data);
			t=t.next;
		}
	}
	public int stackTop(){
		if (top==null){
			return -1;
		}else
			return top.data;
	}
	public int peek(int pos){
		Node n=top;
		for(int i=0;n!=null&&i<pos-1;i++)
			n=n.next;
		if (n!=null)
			return n.data;
		else
			return -1;
	}
}