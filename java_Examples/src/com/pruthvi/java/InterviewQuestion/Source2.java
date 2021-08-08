package com.pruthvi.java.InterviewQuestion;

import java.util.Scanner;

public class Source2 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int xycordinate1[]=new int[3];
			for(int i=0;i<3;i++) {
				xycordinate1[i]=sc.nextInt();
			}
			int xycordinate2[]=new int[3];
			for(int i=0;i<3;i++) {
				xycordinate2[i]=sc.nextInt();
			}
			double pi=Math.PI;
			double area;
			double valu=Math.sqrt((xycordinate2[0]-xycordinate1[0])*(xycordinate2[0]-xycordinate1[0])+(xycordinate2[1]-xycordinate1[1])*(xycordinate2[1]-xycordinate1[1]));
			if(valu>=(xycordinate2[2]+xycordinate1[2]))area=0;
			else if(valu<=Math.abs(xycordinate2[2]-xycordinate1[2])) {
				if(xycordinate1[2]<=xycordinate2[2]) area=pi*xycordinate1[2]*xycordinate1[2];
				else area=pi*xycordinate2[2]*xycordinate2[2];
			}
			else {
				double per=(valu+xycordinate2[2]+xycordinate1[2]/2);
				double s=2*Math.sqrt(per*(per-valu)*(per-xycordinate2[2]));
			}
			sc.close();
	}

}
