package cmsc256;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.EmptyStackException;

import bridges.base.SLelement;

public class MyStack<E> implements StackInterface<E>{
	private SLelement<E> head;      // Pointer to first element
	private int size;  
	
	public MyStack(){
		head = null; 
		size = 0;
	}
	
	public MyStack(int size){
		head = null; 
		size = 0;
	}

	
	public static boolean isBalanced(File webpage) throws FileNotFoundException{
	/*	MyStack<String> htmlDelim = new MyStack<String>();
		StringBuilder fileIn = new StringBuilder();
			BufferedReader readIn = new BufferedReader(new FileReader(webpage));
			String temp;
				try {
					while((temp = readIn.readLine()) != null) {
						
						if(htmlDelim.isEmpty() && temp.length()>1) 
							htmlDelim.push(temp.substring(temp.indexOf('<')+1, temp.indexOf('>')));
						else if(temp.length() > 1) {
							System.out.println(temp.substring(temp.indexOf('<')+1, temp.indexOf('>'))+" A");
							System.out.println(htmlDelim.peek().toString());
							if(temp.substring(temp.indexOf('<')+1, temp.indexOf('>')).equals(htmlDelim.peek().toString())) {
								return false;
							}
							if(!temp.substring(temp.indexOf('<')+1, temp.indexOf('>')).contains("/"))
								htmlDelim.push(temp.substring(temp.indexOf('<')+1, temp.indexOf('>')));
							
							if(temp.substring(temp.indexOf('<')+1, temp.indexOf('>')).equals("/html")){
								if(!htmlDelim.peek().toString().equals("html")) {
									return false;
								}
								else
									htmlDelim.pop();
							}
							if(temp.substring(temp.indexOf('<')+1, temp.indexOf('>')).equals("/body")){	
								if(!htmlDelim.peek().toString().equals("body")) {
									return false;
								}
								else
									htmlDelim.pop();
							}
							if(temp.substring(temp.indexOf('<')+1, temp.indexOf('>')).equals("/h1")){
								if(!htmlDelim.peek().toString().equals("h1"))
									return false;
								else
									htmlDelim.pop();
							}
							if(temp.substring(temp.indexOf('<')+1, temp.indexOf('>')).equals("/p")){		
								if(!htmlDelim.peek().toString().equals("p"))
									return false;
								else
									htmlDelim.pop();
							}
						}
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
				*/	
				return true;
					
	}
	

	
	@Override
	public void push(E newEntry) {
		if(newEntry == null) {
			throw new IllegalArgumentException();
		}
			head = new SLelement<E>(newEntry, head);
			size++;
	}

	@Override
	public E pop() {
		if(head == null){
			throw new EmptyStackException();
		}
		E it = head.getValue();
		head = head.getNext();
		size--;
		return it;
	}

	@Override
	public E peek() {
		if (head == null) {
			throw new EmptyStackException();
		}
		return head.getValue();
	}

	@Override
	public boolean isEmpty() {
		try {
			return size == 0;
		}
		catch(EmptyStackException E) {
			
		}
		return true;
	}

	@Override
	public void clear() {
		head = null; 
		size = 0;
		// TODO Auto-generated method stub
		
	}

}
