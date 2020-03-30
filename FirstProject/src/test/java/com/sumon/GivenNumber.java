package com.sumon;

import java.util.Scanner;

public class GivenNumber {
	
		public static void main(String args[]){
		
	
		Scanner in = new Scanner(System.in);
		System.out.println("enter the num for which u want the factorial");
		int num = in.nextInt();
		for(int i=num-1; i<2; i-- ){
		num = num*i;
		}
		System.out.println(num);
		
		
		
		
		
		}
		}

