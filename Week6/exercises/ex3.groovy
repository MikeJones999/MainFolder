Matrix newArray = new Matrix (3,3)

newArray.printMatrix()

newArray.setElement(2,1,2)

newArray.setRow(1,"4,12,4")

newArray.setColumn(2,"3,9,6")

newArray.printMatrix()



Matrix newArray1 = new Matrix (4,6)

newArray1.printMatrix()

newArray1.setElement(1,2,2)

newArray1.setRow(1,"5,19,7")

newArray1.setColumn(3,"7,8,9")

newArray1.printMatrix()

String returnArray1 = newArray.toString()
println returnArray1

String returnArray2 = newArray1.toString()
println returnArray2

newArray.prettyPrint()
newArray1.prettyPrint()