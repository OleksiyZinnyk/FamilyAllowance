package studentorder.validator;

import studentorder.domain.CityRegisterCheckerResponse;
import studentorder.domain.Person;
import studentorder.exception.CityRegisterException;

public class RealCityRegisterChecker implements CityRegisterChecker{
    public CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException {
        return null;
    }
}
