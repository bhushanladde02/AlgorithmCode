package CCI;

public class URLify1_3 {
	
	public void stringSpaceOperations(String str){
		int count=0;
		String[] arry=str.split(",");
		int aVal=Integer.parseInt(arry[1]);
	
		char[] arrychar=arry[0].toCharArray();
		System.out.println(aVal);
		
		for(int i=0;i<aVal;i++){
			if(arrychar[i]==' '){
				count++;
			}
		}
		int totalArrayLength=aVal+(count*3);
		int counter=0;
		System.out.println(totalArrayLength);
		char[] finalArr=new char[totalArrayLength-count];
		for(int i=0;i<aVal;i++){
			if(arrychar[i]==' '){
				finalArr[counter]='%';
				counter=counter+1;
				finalArr[counter]='2';
				counter=counter+1;
				finalArr[counter]='0';
				counter++;
			}else{
				//System.out.println(counter +": compare :"+ i );
				//System.out.println(arrychar[i]);
				finalArr[counter]=arrychar[i];
				counter++;
			}
		}
		
		String strFinal=new String(finalArr);
		System.out.println(strFinal);
	}
	
	
	public static void main(String[] args) {
		String str= "I am Bhushan   ,15";	
		URLify1_3 url=new URLify1_3();
		url.stringSpaceOperations(str);
	}
}
