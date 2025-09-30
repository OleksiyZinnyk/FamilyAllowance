package studentorder.validator;

import studentorder.domain.CityRegisterCheckerResponse;
import studentorder.domain.Person;
import studentorder.exception.CityRegisterException;

public interface CityRegisterChecker {
    CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException;
}
