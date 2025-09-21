package studentorder.validator;

import studentorder.domain.AnswerCityRegister;
import studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;
    protected int port;
    private String login;
    String password;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        personChecker.checkPerson(so.getHusband());
        personChecker.checkPerson(so.getWife());
        personChecker.checkPerson(so.getChild());

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
