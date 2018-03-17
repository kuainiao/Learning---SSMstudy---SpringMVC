package handlers;

import beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.IStudentService;

@Controller
@RequestMapping("/test")
public class StudentController {

    @Autowired
    @Qualifier("studentService")
    // @Resource(name="studnetService")
    private IStudentService service;

    public void setService(IStudentService service) {
        this.service = service;
    }

    @RequestMapping("/register.do")
    public String doRegister(String name, int age) {
        System.out.println("==================================================================");
        Student student = new Student(name, age);
        service.addStudent(student);
        return "/welcome.jsp";
    }

}
