
/*
nDisks = the number of disks that need to be moved
fromPeg = the identifier (index) of the peg where the disks originate
toPeg = the identifier (index) of the peg where the disks are moved to

We want to know how to move the disks
therefore - The return type is String

Find out which smaller Tower of Hanoi problems you need to use to solve the original Tower of Hanoi problem
Find out how to use the solutions of the smaller Tower of Hanoi problems to solve the original Tower of Hanoi problem.
Find the solutions for a sufficient number of the base cases.

When we come to three discs, we can break down the solution into its constituents. 
We use the solution for two discs to move all of the discs except one onto tower B so we can move the biggest disc across to from tower A to tower C.
Then we use the solution for two discs to move the remaining discs from tower B to tower C.
*/


int n = 3
int result = countMovesHanoi(n)
print "it takes " + result + " moves to move all discs across three pegs"


int countMovesHanoi(int diskCount)
{
	if (diskCount == 1)
	{
	    return 1
	}
	int result = 1 + 2 * countMovesHanoi(diskCount - 1);
	return result;
}
































