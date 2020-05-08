import com.warren.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    /*XML的写法*/
    @Test
    public void shoutTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        People people = context.getBean("people", People.class);

        people.getCat().shout();
        people.getDog().shout();
    }

    /*注解的写法*/
     @Test
     public void annotationTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotation.xml");

        People people = context.getBean("people", People.class);

        people.getCat().shout();
        people.getDog().shout();
     }
}
