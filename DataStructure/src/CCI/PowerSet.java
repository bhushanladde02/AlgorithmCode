package CCI;

public class PowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] set = {1,2};
		
		int size = set.length;

		for(int i=0; i<Math.pow(2, size); i++) {
			System.out.print("{");
			for(int j=0; j<set.length; j++) {
				if( (i & 1<<j) != 0) {
					System.out.print(" "+set[j]);
				}
			}
			System.out.println("}");
			
		}
	}
}
