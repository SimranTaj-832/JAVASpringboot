package AnonymousPac;

public class TestI1Impl {

	public static void main(String[] args) {
		TestI1 fobj=(int x)->System.out.println(2*x);
		fobj.abstractFun(5);
		fobj.normalFun();
		TestI1 fobj1=(int x)->System.out.println(3*x);
		fobj1.abstractFun(10);
		TestI1 fobj2=(int n)->System.out.println(5+n);
		fobj2.abstractFun(10);
		fobj2.normalFun();

	}

}
