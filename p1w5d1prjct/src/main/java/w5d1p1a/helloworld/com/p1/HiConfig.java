package w5d1p1a.helloworld.com.p1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HiConfig {
	public HiConfig() { }

		@Bean(name="hobj")
		public HI returnBean() {
		HI obj = new HI();
		obj.setUser("abc");
		return obj;
		}

}
