package cn.huiyusheng;

import cn.huiyusheng.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 悔余生
 * @ClassName:MyTest
 * @Description:TODO
 * @Date 2020/12/9 下午4:34
 * @Version V1.0
 **/
public class MyTest {

    /**
     * 测试mybatis执行sql语句
     */
    @Test
    public void testSelectStudentById() throws IOException {
        //调用mybatis某个对象的方法，执行mapper文件中的sql语句
        //mybatis的核心类：SqlSessionFactory

        //1.定义mybatis主配置文件的位置，从类路径开始的相对路径
        String config = "MyBatis.xml";

        //2.读取主配置文件。使用mybatis中的Resource类
        InputStream inputStream = Resources.getResourceAsStream(config);//org.apache.ibatis.io.Resources;

        //3.创建SqlSessionFactory对象， 使用SqlSessionFactoryBuidler 类
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        //4.获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //5.指定要执行的sql语句的id
        //sql的id = namesqpce+"." + select|update|insert|delete标签的id属性值
        String sqlId ="cn.huiyusheng.dao.StudentDao"+"."+"selectStudentById";
        //6.通过SqlSession的方法执行sql语句
        Student student = sqlSession.selectOne(sqlId,1001);

        System.out.println("使用mybatis查询一个"+student);

        //7.关闭sqlsession对象
        sqlSession.close();
    }

    @Test
    public void testSelectStudentById01() throws IOException {
        //调用mybatis某个对象的方法，执行mapper文件中的sql语句
        //mybatis的核心类：SqlSessionFactory

        //1.定义mybatis主配置文件的位置，从类路径开始的相对路径
        String config = "MyBatis.xml";

        //2.读取主配置文件。使用mybatis中的Resource类
        InputStream inputStream = Resources.getResourceAsStream(config);//org.apache.ibatis.io.Resources;

        //3.创建SqlSessionFactory对象， 使用SqlSessionFactoryBuidler 类
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        //4.获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //5.指定要执行的sql语句的id
        //sql的id = namesqpce+"." + select|update|insert|delete标签的id属性值
        String sqlId ="cn.huiyusheng.dao.StudentDao"+"."+"selectStudentById";
        //6.通过SqlSession的方法执行sql语句
        Student student = sqlSession.selectOne(sqlId,1002);

        System.out.println("使用mybatis查询一个"+student);

        //7.关闭sqlsession对象
        sqlSession.close();
    }

    @Test
    public void testInsertStudent() throws IOException {

        String config = "MyBatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(config);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        //4.获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //5.指定要执行的sql语句的id
        //sql的id = namesqpce+"." + select|update|insert|delete标签的id属性值
        String sqlId ="cn.huiyusheng.dao.StudentDao"+"."+"insertStudent";

        Student student = new Student();
        student.setId(1005);
        student.setName("tyy");
        student.setEmail("tyy@qq.com");
        student.setAge(18);
        int rows = sqlSession.insert(sqlId,student);

        //6.通过SqlSession的方法执行sql语句
        System.out.println("使用mybatis添加一个学生，rows="+rows);

        //mybatis默认执行sql语句是 手工提交事务模式
        sqlSession.commit();
        //7.关闭sqlsession对象
        sqlSession.close();
    }
}

