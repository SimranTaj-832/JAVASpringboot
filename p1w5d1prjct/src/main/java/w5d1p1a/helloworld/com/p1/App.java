package w5d1p1a.helloworld.com.p1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello!!!" );
        AnnotationConfigApplicationContext apctx=new AnnotationConfigApplicationContext();
        apctx.register(HiConfig.class);
        apctx.refresh();
        HI objHi=(HI)apctx.getBean("hobj");
        System.out.println(objHi);
    }
}
