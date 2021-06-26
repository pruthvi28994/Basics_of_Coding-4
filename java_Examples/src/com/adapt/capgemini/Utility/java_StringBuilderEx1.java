package com.adapt.capgemini.Utility;

public class java_StringBuilderEx1 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Hello ");

		// Stringbuilder.append(char[]);
		sb1.append("java");
		System.out.println("Stringbuilder.append(char[]):=>" + sb1 + "\n");
		// prints hello java

		StringBuilder sb2 = new StringBuilder(10);
		sb2.append("ABC");
		sb2.insert(1, "abc");
		System.out.println("Insert in position using SB,insert(int offset,char[] )=>" + sb2 + "\n");

		StringBuilder sb3 = new StringBuilder(sb1);

		// delete by start and end position delete(int strt,int end)
		System.out.println();
		sb3.delete(1, 4);
		System.out.println("Delete delete(int strt,int end)=>" + sb3 + "\n");
		// replace
		sb3.replace(1, 3, "PRUTHVI");
		System.out.println("Replace using replace(strt,end,char[])=>" + sb3 + "\n");
		// reverse

		System.out.println("Reverse =>" + sb1.reverse() + " " + sb1.reverse() + "\n");

		// capacity
		StringBuilder sb4 = new StringBuilder();
		System.out.println("capacity of empty SB=>" + sb4.capacity());
		sb4.append("hello pruthvi");
		System.out.println(sb4 + " Capacity =>" + sb4.capacity() + "\n");
		sb4.append(" sagar s");
		// if old SB is increased from its current stringb then size is increase by
		// (oldcapcity*2)+2
		System.out.println(sb4.capacity());

		// ensureCapacity(10) ensures that the given capacity is minimum to the current
		// capacity
		// if it is greater than the cur capacity it increase capactiy by (old*2)+2
		sb4.append(" NMIT");
		System.out.println(sb4.capacity() + "\n");

		StringBuilder sb = new StringBuilder("one");
		sb.append("+two");
		StringBuilder same = sb.append("+three");
		System.out.println(same + "\n");

		StringBuilder s1 = new StringBuilder("bat");
		StringBuilder s2 = s1.reverse().append("let");
		System.out.println(s1 + " " + s2 + "\n");

		String s3 = new String("Hello");
		String s4 = new String("Hello");

		if (s3 == s4) { // because String created using object have diffent address
			System.out.println("Hello");
		}
		if (s3.equalsIgnoreCase(s4)) {
			System.out.println("World");
		}
	}

}
