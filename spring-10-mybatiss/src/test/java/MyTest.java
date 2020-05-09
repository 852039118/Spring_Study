import com.warren.dao.UserMapper;
import com.warren.pojo.User;
import com.warren.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
        
        sqlSession.close();
    }
}
