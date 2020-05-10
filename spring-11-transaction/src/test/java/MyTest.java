import com.warren.dao.UserMapper;
import com.warren.dao.UserMapperImpl;
import com.warren.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void springMybatis(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper mapper = context.getBean("userMapper", UserMapperImpl.class);

        User user = new User(9, "transaction", "warren");

        mapper.addUser(user);

        mapper.deleteUser(9);
    }
}
