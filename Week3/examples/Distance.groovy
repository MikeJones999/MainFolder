/*
Write a program that reads the X and Y coordinates of three points and then outputs which of the three are closer.
Use the following class to store the data for the points:
class Point 
{
double x;
2
double y;
}
*/


Double result1 = 0
Double result2 = 0
Double result3 = 0


class Point 
{
 double x;
 double y;
}


Point firstCo = new Point()
firstCo.x = 40.30
firstCo.y = 5.10

Point secondCo = new Point()
secondCo.x = 10.5
secondCo.y = 5.3


Point thirdCo = new Point()
thirdCo.x = 8.3
thirdCo.y = 7.5



result1 = distanceFormula(firstCo.x, firstCo.y, secondCo.x, secondCo.y)
result2 = distanceFormula(secondCo.x, secondCo.y, thirdCo.x, thirdCo.y)
result3 = distanceFormula(firstCo.x, firstCo.y, thirdCo.x, thirdCo.y)


//output the closest result
if (result1 < result2 && result1 < result3)
{
 println "Closest point are firstCO and SecondCo = " +  result1
}else if (result2 < result1 && result2 < result3)
{
  println "Closest point are secondCo and thirdCo = " + result2
}else if (result3 < result1 && result3 < result2)
{
  println "Closest point are firstCo and thirdCo = " + result3
}




//get distance between two points 2D
Double distanceFormula (Double x1, Double y1, Double x2, Double y2)
{
//distance = suareroot of sum (x2-x1)2 + (y2-y1)2
  Double xCo1 = x1
  Double yCo1 = y1
  Double xCo2 = x2
  Double yCo2 = y2
    
  Double part1 =  xCo2 - xCo1
  part1 = part1 * part1
  //println part1
  
  Double part2 =  yCo2 - yCo1
  part2 = part2 * part2
  //println part2
  
  Double Final = part1 + part2
  Final = Math.sqrt(Final)  
  
  Final  
}