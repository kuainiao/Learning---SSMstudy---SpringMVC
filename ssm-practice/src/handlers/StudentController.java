package handlers;

import beans.Student;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import service.IStudentService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentController implements Controller {

    private IStudentService service;

    public void setService(IStudentService service) {
        this.service = service;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        String name = httpServletRequest.getParameter("name");
        String ageStr = httpServletRequest.getParameter("age");
        Integer age = Integer.parseInt(ageStr);
        Student student = new Student(name, age);

        service.addStudent(student);

        return new ModelAndView("/welcome.jsp");
    }
}
