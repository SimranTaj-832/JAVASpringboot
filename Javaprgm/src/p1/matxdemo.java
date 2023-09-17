package p1;

public class matxdemo {

	public static void main(String[] args) {
		int mat[][] = new int[2][3];
		mat[0][0]=25;
		mat[0][1]=12;
		mat[0][2]=23;
		mat[1][0]=10;
		mat[1][1]=17;
		mat[1][2]=9;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
			System.out.print(mat[i][j] + " ");
			}
			System.out.println();
			}
		int arr[]=new int[4];
		arr[0]=33;
		arr[1]=34;
		arr[2]=35;
		arr[3]=36;
		
		for(int arr1:arr) {
			System.out.print(arr1+" ");
		}
		System.out.println();
		for(int mat1[]:mat) {
			for(int q:mat1) {
			System.out.print(q+"\t");
			}
			System.out.println();
		}
	}

}
