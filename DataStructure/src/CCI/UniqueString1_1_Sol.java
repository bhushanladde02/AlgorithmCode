package CCI;

public class UniqueString1_1_Sol {
	public static void main(String[] args) {
		String s="Bhushan";
		boolean a[]=new boolean[128];
		boolean checkDup=false;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			//System.out.println(a[ch]);
			if(a[ch]){
				System.out.println("duplicates found");
			}
			a[ch]=true;
		}
	}

}
