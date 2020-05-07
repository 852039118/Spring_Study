import com.warren.dao.UserDaoMySQLImpl;
import com.warren.dao.UserDaoOracleImpl;
import com.warren.dao.UserDaoSqlServerImpl;
import com.warren.service.UserService;
import com.warren.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        //控制反转：不用在业务层由程序员来创建对象，而是用户根据需要自己选择创建什么对象
        userService.setUserDao(new UserDaoSqlServerImpl());
        userService.getUser();

        userService.setUserDao(new UserDaoMySQLImpl());
        userService.getUser();
    }
}

