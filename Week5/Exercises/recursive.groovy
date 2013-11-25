int multi =  (4 * 3 * 2 * 1)
println  multi


int res = factorial(4)
println res

int factorial(int n) 
{
 if (n == 1) {
 return 1;
} else {
	println "loop " + n
        int result = n * factorial(n-1)
        return result
        }
}
