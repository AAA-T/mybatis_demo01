package cn.huiyusheng.domain;

/**
 * @author 悔余生
 * @ClassName:Student
 * @Description:TODO
 * @Date 2020/12/17 上午11:25
 * @Version V1.0
 **/
public class Student {
    private Integer id; //id
    private String name; //姓名
    private Integer age; //年龄
    private String Email; //邮箱

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "学生实体{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Email='" + Email + '\'' +
                '}';
    }
}
