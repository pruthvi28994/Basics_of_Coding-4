package com.pruthvi.noInteractionCaseStudy;

import java.util.Scanner;

class Trainer {
	 public void askQuestion(String quest, String ans)
	 {
		 try{
		  	if(ans.equals("null")){
		  			System.out.println ("Question:"+quest);
		  			System.out.println ("Answer:null");
		  			throw new NoInteractionException();
		  	}else{
		  			System.out.println ("Question:"+quest);
		  			System.out.println ("Answer:"+ans);
		  	}
		 }catch(Exception e){
			 	System.out.println ("NoInteractionException");
		 }
	 }
	}
public class Source {

	public static void main(String[] args) {
		String q,a;
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			q=sc.nextLine();
			a=sc.nextLine();
			Trainer t=new Trainer();
			t.askQuestion(q, a);
		}
		sc.close();
	}

}
