package com.adapt.capgemini;

import java.util.*;

interface Shape {
	public abstract double getArea();

	public abstract double getPerimeter();
}

abstract class AbstractShape implements Shape {
	private String colour;

	public AbstractShape(String colour) {
		super();
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	@Override
	public String toString() {
		return "colour=" + colour;
	}
}

class Rectangle extends AbstractShape {
	private int length;
	private int breadth;

	public Rectangle(String colour, int length, int breadth) {
		super(colour);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub

		return length * breadth;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (length + breadth);
	}

	@Override
	public String toString() {
		return "Rectangle [colour=" + this.getColour() + ", length=" + length + ", breadth=" + breadth + "]";
	}

}

class Circle extends AbstractShape {

	private int radius;

	public Circle(String colour, int radius) {
		super(colour);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [colour=" + this.getColour() + ", radius" + radius + "]";
	}

}

public class java_ShapeHierachy {
	/*
	 * Sample Input 1 CIRCLE RED 5 Circle [colour=RED, radius5] Area : 79,Perimeter:
	 * 31
	 * 
	 * Sample Input 2 RECTANGLE GREEN 10 5 Rectangle [colour=GREEN, length=10,
	 * breadth=5] Area : 50,Perimeter: 30
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ch = sc.nextLine();
		switch (ch) {
		case "CIRCLE":
			String input1[] = sc.nextLine().split(" ");
			Circle c = new Circle(input1[0], Integer.parseInt(input1[1]));
			printShape(c);
			break;
		case "RECTANGLE":
			String input2[] = sc.nextLine().split(" ");
			Rectangle r = new Rectangle(input2[0], Integer.parseInt(input2[1]), Integer.parseInt(input2[2]));
			printShape(r);
			break;
		}
	}

	public static void printShape(Shape obj) {
		System.out.println(obj + "\nArea : " + (int) Math.round(obj.getArea()) + ",Perimeter: "
				+ (int) Math.round(obj.getPerimeter()));
	}
}
