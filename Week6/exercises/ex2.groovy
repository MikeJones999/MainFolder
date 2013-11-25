
int[] array1 = [6,7,8,9,10]
int[] array2 = [1,2,3,4,5,12,13,14,15]

ArrayCopier array = new ArrayCopier(array1, array2)

int count1 = array.getArrayLength1()
int[] arrayDup1 = array.getArray1()

int count2 = array.getArrayLength2()
int[] arrayDup2 = array.getArray2()

println "array1 length: " + count1
println "array1 contents: " + arrayDup1

println "array2 length: " + count2
println "array2 contents: " + arrayDup2

//int[] newArray = array.copyArray()
println "Array 2 now contains: " + array.copyArray()

arrayDup2 = array.getArray2()
println "array2 length: " + count2
println "array2 contents: " + arrayDup2
