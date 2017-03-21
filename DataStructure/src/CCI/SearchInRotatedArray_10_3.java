package CCI;
//difficult problem
public class SearchInRotatedArray_10_3 {

	public static int search(int a[],int start,int end,int key){
		int mid=(start+end)/2;
		if(a[mid]==key){
			return mid;
		}
		if(end<start){
			return -1;
		}
		if(a[start]<a[mid]){
			if(a[start]<=key && a[mid]>key) //to handle the rotating condition we are doing like this
				return search(a,start,mid-1,key);
			else
				return search(a,mid+1,end,key);
		}else if(a[start]>a[mid]){ //to handle the rotating condition we are doing like this
			if(a[end]>key && a[mid]<key)
				return search(a,mid+1,end,key);
			else
				return search(a,start,mid-1,key);
		}else if(a[start]==a[mid]){ //important case //use of this tast case???? take test case to dry run this 
			//this is for first element in a array or last element in array

			if(a[end]!=a[mid]){
				return search(a,mid+1,end,key);
			}else{
				int result = search(a,start,mid-1,key);//try to search in half part
				if(result==-1){
					return search(a,mid+1,end,key); //try to search in other half part
				}else{
					return result;
				}
			}
		}

		return -1;
	}


	public static void main(String[] args) {
		int[] rotatingArr={15,16,19,20,25,1,3,4,5,7,10,14};
		int result=search(rotatingArr,0,rotatingArr.length-1,5);
		System.out.println(result);
	}

}
