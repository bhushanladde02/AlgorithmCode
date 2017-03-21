package Extraproblem;

public class MaximumSubArraySumProblemShobhaki {
	public static int binarySearch(int a[],int start, int end){
		if(start==end){
			return a[start];
		}
		
		int mid=(start+end)/2;
		int leftMax=binarySearch(a,start,mid);
		int rightMax=binarySearch(a,mid+1,end);
		int crossMax=crossMax(a,start,end,mid);
		System.out.println("start :"+start+" end :"+ end+" mid :"+mid+" crossmax :"+crossMax);
		int firstMax=Math.max(leftMax,rightMax);
		return Math.max(firstMax,crossMax);
	}
	public static int crossMax(int a[],int start,int end,int mid){
		int leftSum=0;
		int rightSum=0;
		int left_sum = Integer.MIN_VALUE;
		int right_sum = Integer.MIN_VALUE;
		
		for(int i=mid;i>=start;i--){
			leftSum=leftSum+a[i];
			if(left_sum<leftSum){
				left_sum=leftSum;
			}
		}
		for(int i=mid+1;i<=end;i++){
			rightSum=rightSum+a[i];
			if(right_sum<rightSum){
				right_sum=rightSum;
			}
		}
		return left_sum+right_sum;
	}
	
/*	
 	public static int addNumber(int a[],int start,int end){
		int sum=0;
		for(int i=start;i<end;i++){
			sum=sum+a[i];
		}
		return sum;
	}
*/

	public static void main(String[] args) {
		int a[]={-1,3,4,-5,9,2};
		int result=binarySearch(a,0,a.length-1);
		System.out.println(result);
	}

}
