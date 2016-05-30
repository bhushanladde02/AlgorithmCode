package OSAlgorithms;
import java.util.ArrayList;
import java.util.List;

public class CPUDeadlockSafeState {

	List listSafeStateSequence=new ArrayList<>();
	public void input()
	{
		String[] process= {"p0","p1","p2","p3","p4"};
		
		boolean[] flagV={false,false,false,false,false};
		
		int[][] allocation = { {0,1,0}, {2,0,0}, {3,0,2},{2,1,1},{0,0,2}};
		
		int[][] max = { {7,5,3}, {3,2,2}, {9,0,2},{2,2,2},{4,3,3}};
		
		int[][] need = { {7,4,3}, {1,2,2}, {6,0,0},{0,1,1},{4,3,1}};
		
		int[][] avail={{3,3,2}};
		
		selectCandidateProcess(allocation, max, need, avail,flagV,process);
			
	}
	public void selectCandidateProcess(int[][] allocation,int[][] max,int[][] need,int[][] avail,boolean flagV[],String process[]){
		int[][] work=avail;
		String[] resultSafeSequence=new String[process.length];
		int countNumberOfProcessExcuted=0;
		//System.out.println(need.length);
		while(true){
			for(int i=0;i<need.length;i++){
				//System.out.println(i);
				if(need[i][0]<=work[0][0] & need[i][1]<=work[0][1] && need[i][2]<=work[0][2] && !flagV[i]){
					//System.out.println("I have come inside the if loop::"+process[i]);
					resultSafeSequence[countNumberOfProcessExcuted]=process[i];
					countNumberOfProcessExcuted=countNumberOfProcessExcuted+1;
					flagV[i]=true;
					work[0][0]=work[0][0]+ need[i][0];
					work[0][1]=work[0][1]+ need[i][1];
					work[0][2]=work[0][2]+ need[i][2];
					if(countNumberOfProcessExcuted==process.length){
						break;
					}
				}
				
			}
			if(countNumberOfProcessExcuted==process.length){
				break;
			}
		}
		printOutput(flagV,resultSafeSequence);
		//return "processSelected";
	}
	
	public void printOutput(boolean flagV[],String resultSafeSequence[]){
		
		for(int i=0;i<flagV.length;i++){
			if(flagV[i]==false){
				System.out.println("System is in unsafe state");
			}else{
				System.out.println(resultSafeSequence[i]);
			}
		}
		
	}
	public static void main(String[] args) {
	 CPUDeadlockSafeState cpu=new CPUDeadlockSafeState();
	 cpu.input();
	// cpu.printOutput();
	}
	
}
