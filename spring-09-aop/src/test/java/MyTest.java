import com.warren.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理 代理的是接口：注意点
        UserService userServiceImpl = context.getBean("userServiceImpl", UserService.class);

        userServiceImpl.add();
    }
}
