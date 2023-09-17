package Methods;

public class TowerofHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nDisks = 3;
	      TowerOfHanoi(nDisks, 'A', 'B', 'C');
	}
	public static void TowerOfHanoi(int N, char src, char inter, char dest) {
	      if (N == 1) {
		         System.out.println("Move Disk " + N + " from " + src + " to " + dest);
	      } else {
	    	  TowerOfHanoi(N - 1, src, dest, inter);
	         System.out.println("Move Disk " + N + " from " + src + " to " + dest);
	         TowerOfHanoi(N - 1, inter, src, dest);
	      }
	}
}
