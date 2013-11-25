/*
Write a program in which you create and use a class called Point, with two fields of type double (e.g. x, y) and the
following methods:
distanceTo(Point): calculates the distance to another point.
distanceToOrigin(): calculates the distance to the origin. Implement it by calling the first method.
moveTo(double x, double y): changes the coordinates of this point to be the given parameters x and y.
moveTo(Point): changes the coordinates of this point to move where the given point is.
clone(): returns a copy of the current point with the same coordinates.
opposite(): returns a copy of the current point with the coordinates multiplied by -1.
Two methods in a class can have the same name (identifier) as long as their parameters are different. This is
called method overloading and we will see more of that in the future.
*/


class Point
{

Double x
Double y


	//get distance between two points 2D
	Double distanceTo (Point tempPoint)
	{
	//distance = suareroot of sum (x2-x1)2 + (y2-y1)2
	  Double xCo1 = tempPoint.x
	  Double yCo1 = tempPoint.y
	  // no need to access self in this class - i.e mainPoint.x - just x
	  Double xCo2 = x
	  Double yCo2 = y
	  Double part1 =  xCo2 - xCo1
	  part1 = part1 * part1
	  Double part2 =  yCo2 - yCo1
	  part2 = part2 * part2
	  Double Final = part1 + part2
	  Final = Math.sqrt(Final)  
	  Final  
	}
	
	Double distanceToOrigin()
	{
		//distance = suareroot of sum (x2-x1)2 + (y2-y1)2
		//origin = 0.0
		  Double xCo1 = 0
		  Double yCo1 = 0
		  // no need to access self in this class - i.e mainPoint.x - just x
		  Double xCo2 = x
		  Double yCo2 = y
		  Double part1 =  xCo2 - xCo1
		  part1 = part1 * part1
		  Double part2 =  yCo2 - yCo1
		  part2 = part2 * part2
		  Double Final = part1 + part2
		  Final = Math.sqrt(Final)  
		  Final  
	}
	
	void moveTo(Double newX, Double newY)
	{
	  x = newX
	  y = newY	
	  println "New X: " + x + " New Y: " + y
	}
	
	void moveTo(Point tempPoint)
	{
		  x = tempPoint.x
		  y = tempPoint.y	
		  println "New X: " + tempPoint.x + " New Y: " + tempPoint.y
	}
	
	
	

}//end of class point


//variables
String str = ""
Double coX = 0.00
Double coY = 0.00


Point mainPoint = new Point()
mainPoint.x = 0
mainPoint.y = 0

boolean complete = false

while (!complete)
{

	println "[0] Distance between two points "
	println "[1] Distance away from 0,0 (origin)"
	println "[2] change position of static mainPoint (moveTo) "
	println "[3] change position of static mainPoint (moveTo - POINT)"
	println "[9] exit program: "
	println "Please insert your choice : "


	String strOption = System.console().readLine()
	int option = Integer.parseInt(strOption)

	switch (option)
	{
		case 0: 
			print "Please insert your x co-ordinate: "
			str = System.console().readLine()
			coX = Double.parseDouble(str)

			print "Please insert your y co-ordinate: "
			str = System.console().readLine()
			coY = Double.parseDouble(str)

			Point newPointA = new Point()
			newPointA.x = coX
			newPointA.y = coY

			double distanceBetween = mainPoint.distanceTo(newPointA)
			println "Distance is : " + distanceBetween
			break


		case 1: Double distanceToOrig = mainPoint.distanceToOrigin()
			println "Distance from origin is : " + distanceToOrig	
			break


		case 2: print "Please insert your x co-ordinate: "
			str = System.console().readLine()
			coX = Double.parseDouble(str)

			print "Please insert your y co-ordinate: "
			str = System.console().readLine()
			coY = Double.parseDouble(str)

			Point newPointB = new Point()
			newPointB.x = coX
			newPointB.y = coY		
			mainPoint.moveTo(newPointB.x, newPointB.y)
			break

		case 3: print "Please insert your x co-ordinate: "
			str = System.console().readLine()
			coX = Double.parseDouble(str)

			print "Please insert your y co-ordinate: "
			str = System.console().readLine()
			coY = Double.parseDouble(str)

			Point newPointB = new Point()
			newPointB.x = coX
			newPointB.y = coY			
			 mainPoint.moveTo(newPointB)
			 break


		case 9: print "exiting "
		complete = true
		break

		default: print "error"
		break
	}


}