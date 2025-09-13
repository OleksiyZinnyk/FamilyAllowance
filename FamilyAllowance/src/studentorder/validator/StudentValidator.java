package studentorder.validator;

import studentorder.domain.AnswerStudent;
import studentorder.domain.StudentOrder;

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student is checking");
        return new AnswerStudent();
    }
}
