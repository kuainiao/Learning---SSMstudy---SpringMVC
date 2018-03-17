package dao;

import beans.Student;
import org.apache.ibatis.annotations.Insert;

public interface IStudentDao {
    @Insert("insert into student(name,age) values(#{name},#{age})")
    void insertStudent(Student student);
}
