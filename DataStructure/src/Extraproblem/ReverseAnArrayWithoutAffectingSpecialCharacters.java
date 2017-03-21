package Extraproblem;

public class ReverseAnArrayWithoutAffectingSpecialCharacters {

	public static void main(String[] args) {
		String str = "a!!!b.c.d,e'f,ghi";
		char[] temp=str.toCharArray();
		char[] copy=new char[temp.length];

		for(int i=0;i<copy.length;i++){
			copy[i]='0';
		}

		int l=0,k=str.length()-1;
		
		while(l<k){
			if((((int)temp[l] >= 65 && (int)temp[l] <= 90) || ((int)temp[l]>= 97 && (int)temp[l]<= 122)) &&
			   (((int)temp[k] >= 65 && (int)temp[k] <= 90) || ((int)temp[k]>= 97 && (int)temp[k]<= 122))){
				char ch=temp[l];
				temp[l]=temp[k];
				temp[k]=ch;
				l++;
				k--;
			}else if( ((int)temp[l] >= 65 && (int)temp[l] <= 90) || ((int)temp[l]>= 97 && (int)temp[l]<= 122)){
				k--;
			}else { //if(((int)temp[k] >= 65 && (int)temp[k] <= 90) || ((int)temp[k]>= 97 && (int)temp[k]<= 122)){
				l++;
			}/*else if(l==k){
				l++;
				k--;
			}*/
		}

		String str1=new String(temp);
		System.out.println(str1);
		/*int count=0,flg=0;;
		for(int i=temp.length-1;i>=0;i--){
			if(temp[i] == ',' || temp[i] == '$' || temp[i]=='!'){
				copy[i]=temp[i];
			}
			if(copy[count]=='0'){
				copy[count]=temp[i];

			}
			if((temp[i] <= 'a' && temp[i] >= 'z') || (temp[i]<= 'A' && temp[i]>= 'Z') || flg==1){
				flg=1;
				count++;
			}
		}
		String str1=new String(copy);
		System.out.println(str1);*/
	}
}
