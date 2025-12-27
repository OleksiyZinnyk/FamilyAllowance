package studentorder.dao;

import studentorder.domain.StudentOrder;
import studentorder.exception.DaoException;

public interface StudentOrderDao {
    Long saveStudentOrder(StudentOrder so) throws DaoException;
}
