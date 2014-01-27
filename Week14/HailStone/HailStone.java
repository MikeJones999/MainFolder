import java.util.LinkedList;

public class HailStone {
	public LinkedList<Integer> anagramList;
	public HailStone(){
		anagramList = new LinkedList<Integer>();
	}
	
	public LinkedList<Integer> hailSolve(int hailNo){
		
		if(hailNo == 1){
			return anagramList;
		}
		
		if(hailNo % 2 !=0){
			hailNo = (hailNo*3) +1;
			anagramList.add(hailNo);
			return hailSolve(hailNo);
		} else {
			hailNo /= 2;
			anagramList.add(hailNo);
			return  hailSolve(hailNo);
		}
	
	//return anagramList;
	}	
	
	public static void main(String[] args)	{
		int userInput = Integer.parseInt(args[0]);
		new HailStone().launch(userInput);
	}
	
	private void launch(int userInput)	{
		System.out.println(hailSolve(userInput));
	}
}