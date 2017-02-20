// Program to find area of Triangle, Circle and Rectangle .
// Written by: Amitva Pal, Grade VI

import java.util.Scanner;

public class shapesArea {
	
	public static void main (String[] args) {
		
		// ask user for shape choice		
		Scanner userShape = new Scanner(System.in);
		System.out.println("Press 1 for Reactangle, 2 for Circle and 3 for Triangle area.");
		
		int userShapeInput = userShape.nextInt();

		if (userShapeInput == 1) {
			
			System.out.println("Enter length of Rectangle");
			double myLength = userShape.nextDouble();
			System.out.println("Enter width of Rectangle");
			double myWidth = userShape.nextDouble();
			
			areaRectangle myRectangleArea = new areaRectangle(); 
			
			System.out.println("Area of Rectangle is " + myRectangleArea.areaOfRectangle(myLength, myWidth));
		}
		
		else if (userShapeInput == 2) {
			
			System.out.println("Enter radius of circle");
			double myRadius = userShape.nextDouble();
			
			areaCircle myCircleArea = new areaCircle();
			
			System.out.println("Area of Circle is " + myCircleArea.areaOfCircle(myRadius));
		}
		
		else if (userShapeInput == 3) {
			
			System.out.println("Enter length of Triangle");
			double myLength = userShape.nextDouble();
			System.out.println("Enter width of Triangle");
			double myWidth = userShape.nextDouble();
			 
			areaTriangle myTriangleArea = new areaTriangle();
			
			System.out.println("Area of Rectangle is " + myTriangleArea.areaOfTriangle(myLength, myWidth));
		}
		
		else {
			
			System.out.println("Please choose input carefully.");
		}
		
		
	}// end of main method

} // end of class shapesArea
