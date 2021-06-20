package java_Examples;

import java.util.Scanner;

public class java_CheckRightAngleTraingle {
	public static void checkRightAngleTraingle(int a,int b,int c) {
		if(a>b && b>c && a>c){
            if(Math.pow(c,2)+Math.pow(b,2)==Math.pow(a,2)){
                System.out.println("RIGHT ANGLE");
            }else{
                System.out.println("NOT RIGHT ANGLE");
            }
        }else{
            System.out.println("INVALID_INPUT");
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sides of Triangle in increasing order of sides");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        checkRightAngleTraingle(a,b,c);
	}

}
