package java_Examples;
//ele  1		2		3		4		5		6
//pos  1		2		3		4		5		6
//removoddpos  2		4		6
//pos  1		2		3
//removoddpos  4   ==> return last element
import java.util.Scanner;
import java.util.*;

public class java_RemoveOddPosition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Vector<Integer> arr=new Vector<>();
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			arr.add(sc.nextInt());
		}
		removeoddpos(arr);
		
	}
	
	
	//recursive call of remove_odd_position
	public static void removeoddpos(Vector<Integer> arr) {
		if(arr.size()==1) System.out.println(arr);
		else 
		{
				Vector<Integer> copy=new Vector<>();
				for(int i=0;i<arr.size()-1;i++) {
					if(i%2==0 && i<arr.size()-1){
					arr.set(i, arr.get(i+1));					
					}
				}	
				if(arr.size()%2==0) {
						for(int i=0;i<arr.size();i=i+2){
							copy.add(arr.get(i));
						}
				}
				else if(arr.size()%2!=0){
						for(int i=0;i<arr.size()-1;i=i+2){
								copy.add(arr.get(i));
						}
				}
		removeoddpos(copy);
		}
	}
}
