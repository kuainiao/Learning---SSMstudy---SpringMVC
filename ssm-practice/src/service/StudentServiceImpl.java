package service;

import beans.Student;
import dao.IStudentDao;

public class StudentServiceImpl implements IStudentService {
    private IStudentDao dao;

    public void setDao(IStudentDao dao) {
        this.dao = dao;
    }


    @Override
    public void addStudent(Student student) {
        dao.insertStudent(student);
    }
}
