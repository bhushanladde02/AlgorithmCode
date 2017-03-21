package CCI;

public class Permetation1_2 {
	public static void main(String[] args) {
		String name="bhushan";
		String other="nashuhb";
		boolean check=true;
		//boolean array[]=new boolean[128];
		char otherArr[]=other.toCharArray();
		if(name.length()==other.length()){
			for(int i=0;i<otherArr.length;i++){
				if(name.indexOf(otherArr[i])!=-1){
					check=false;
				}
			}

		}
		if(check){
			System.out.println("String does not contain the permatations");
		}else{
			System.out.println("String contains permitations");
		}

	}

}
