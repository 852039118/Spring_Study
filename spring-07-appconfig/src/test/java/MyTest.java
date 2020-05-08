import com.warren.config.WarrenConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test(){
        //如果完全使用了配置类方式去做，我们就只能通过AnnotationConfigApplicationContext上下文来获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(WarrenConfig.class);
        Object user = context.getBean("getUser");

        System.out.println(user.toString());
    }
}
