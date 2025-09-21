package studentorder.validator;

import studentorder.domain.CityRegisterCheckerResponse;
import studentorder.domain.Person;

public class FakeCityRegisterChecker implements CityRegisterChecker {
    public CityRegisterCheckerResponse checkPerson(Person person) {
        return null;
    }
}
