
public class w2d3 {

	public static void main(String[] args) {
		Runnable r1=new Runnable() {
			public void run() {
				for(int i=0;i<50;i++) {
					System.out.println(" "+i*2+" ");
				}
				System.out.println();
			}
		};
		Runnable r2=()->{for(int i=50;i<100;i++) {
			System.out.println(" "+i*2+" ");
		}
		System.out.println();
	};
	new Thread(r1).start();
	new Thread(r2).start();
	}
}
