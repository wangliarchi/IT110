import acm.program.*;


public class Fibonacci extends ConsoleProgram {
	public void run(){
   println("");
   int max =readInt("input max value:");
   fab(max);       	
}
	private void fab(int max){
	int t1 = 0;
	int t2 = 1;
	while(t1 < max){
		println(t1);
		int temp = t1+t2;
		t1 = t2;
		t2 = temp;
	}
	}
	}
