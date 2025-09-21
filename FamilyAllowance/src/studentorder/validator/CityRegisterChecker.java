package studentorder.validator;

import studentorder.domain.CityRegisterCheckerResponse;
import studentorder.domain.Person;

public interface CityRegisterChecker {
    CityRegisterCheckerResponse checkPerson(Person person);
}
