package com.adapt.capgemini.StringBuilder;

import java.util.Scanner;

public class java_EncryptMessage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		String result=encrypt(string);
		System.out.println(result);
	}

	public static String encrypt(String string) {
		string=string.toLowerCase();
		char msg[]=string.toCharArray();
		for(int i=0;i<msg.length;i++) {
			if(msg[i]=='a')
				msg[i]='e';
			else if(msg[i]=='e')
				msg[i]='a';
			else if(msg[i]=='o')
				msg[i]='u';
			else if(msg[i]=='u')
				msg[i]='o';
			else if(msg[i]=='i')
				msg[i]='!';
			else if(msg[i]==' ')
				msg[i]='+';
			else if(msg[i]=='z')
				msg[i]='b';
			else if(msg[i]=='0')
				msg[i]='1';
			else if (msg[i] == 'd') 
               msg[i] = 'f';
            else if (msg[i] == 'h') 
               msg[i] = 'j';
            else if (msg[i] == 'n')
               msg[i] = 'p'; 
            else if (msg[i] == 't')
               msg[i] = 'v'; 
            else if (msg[i] == '9')
               msg[i] = '0';
            else if (msg[i] >= 'a' && msg[i] <= 'z')
               msg[i] += 1;
			else if(msg[i]>='0' && msg[i]<='9')
				msg[i]+=1;
		}
		
		return String.valueOf(msg);
	}

}
