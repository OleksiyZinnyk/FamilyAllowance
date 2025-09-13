package studentorder;

import studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.hFirstName = "Olekisy";
        so.hLastName = "Zinnyk";
        so.wFirstName = "Masha";
        so.wLastName = "Zinnyk";

        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder: " + studentOrder.hFirstName);
        return answer;
    }
}
