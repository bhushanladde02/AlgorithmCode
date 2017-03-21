package CCI;
//program 1.1
public class UniqueChara {
	public static void main(String[] args) {
		String name="Bhushan";
		int checkDuplicates=0;
		char ch='$';
		int i=0,m=0;
		char array[]=name.toCharArray();
		while(i<name.length()){
			if(checkDuplicates==0){
				ch=array[i];
				checkDuplicates=1;
			}else{
				if(ch==array[i]){
					checkDuplicates=2;
					System.out.println("Duplicates found");
					break;
				}
				else if((i+1)==name.length()){
					checkDuplicates=0;
					m=m+1;
					i=m;
				}
			}
			if(checkDuplicates!=0)
			i++;
		}
	}
}
