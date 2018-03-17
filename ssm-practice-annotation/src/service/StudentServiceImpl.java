package service;

import beans.Student;
import dao.IStudentDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

    @Resource(name="IStudentDao")
    private IStudentDao dao;

    public void setDao(IStudentDao dao) {
        this.dao = dao;
    }


    @Transactional
    public void addStudent(Student student) {
        dao.insertStudent(student);
    }
}
