package cn.huiyusheng.domain;

/**
 * @author 悔余生
 * @ClassName:Student
 * @Description:TODO
 * @Date 2020/12/9 下午4:00
 * @Version V1.0
 **/
public class Student {
    //属性名和列名保持一致

    private Integer id; // ID
    private String name; //姓名
    private String email; //邮箱
    private Integer age; // 年龄

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "学生实体的信息：{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
