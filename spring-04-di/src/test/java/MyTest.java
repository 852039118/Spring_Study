import com.warren.pojo.Student;
import com.warren.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
/*
        Student{
            name='warren',
            address=Address{address='南京市鼓楼区'},
            books=[活着, 三国演义, 西游记],
            hobbys=[篮球, 英雄联盟, 听歌, coding],
            card={身份证=420704199706171111, 手机卡=15623356861},
            games=[LOL, COC, CSS], wife='null',
            info={学号=201542401222, url=www.warren.run, driver=db}
        }
*/
    }

    @Test
    public void UserTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
    }
    @Test
    public void UserTest2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user2 = context.getBean("user2", User.class);
        User user = context.getBean("user2", User.class);
        System.out.println(user2.toString());
        System.out.println(user==user2);
    }
}
