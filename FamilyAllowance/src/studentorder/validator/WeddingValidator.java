package studentorder.validator;

import studentorder.domain.AnswerWedding;
import studentorder.domain.StudentOrder;

public class WeddingValidator {
    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Meriage is running");
        return new AnswerWedding();
    }
}
