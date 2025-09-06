public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll(){
        checkCityRegister();
        checkMarriage();
        checkChildren();
        checkStudent();
    }

    static void checkCityRegister() {
        System.out.println("City register");
    }

    static void checkMarriage(){
        System.out.println("Meriage running");
    }

    static void checkChildren(){
        System.out.println("Children check is running");
    }

    static void checkStudent(){
        System.out.println("Student is checking");
    }
}
