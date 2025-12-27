package studentorder.dao;

import studentorder.config.Config;
import studentorder.domain.Street;
import studentorder.domain.StudentOrder;
import studentorder.domain.StudentOrderStatus;
import studentorder.exception.DaoException;

import java.sql.*;

public class StudentDaoImpl implements StudentOrderDao {

    private static final String INSERT_ORDER =
            "INSERT INTO public.jc_student_order\n" +
                    "(student_order_status, student_order_date, h_sur_name, h_given_name," +
                    " h_patronymic, h_date_of_birth, h_passport_seria, h_passport_number, h_passport_date," +
                    " h_passport_office_id, h_post_index, h_street_code, h_building, h_extension, h_apartment," +
                    " w_sur_name, w_given_name, w_patronymic, w_date_of_birth, w_passport_seria, w_passport_number," +
                    " w_passport_date, w_passport_office_id, w_post_index, w_street_code, w_building, w_extension," +
                    " w_apartment, certificate_id, register_office_id, marriage_date)\n" +
                    "VALUES(nextval('jc_student_order_student_order_id_seq'::regclass)," +
                    " '', '', '', '', '', '', '', '', 0, '', 0, '', '', '', '', '', '', ''," +
                    " '', '', '', 0, '', 0, '', '', '', '', 0, '');";

    //TODO make one method
    private Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(
                Config.getProperties(Config.DB_URL),
                Config.getProperties(Config.DB_LOGIN),
                Config.getProperties(Config.DB_PASSWORD));
        return con;
    }

    @Override
    public Long saveStudentOrder(StudentOrder so) throws DaoException {
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(INSERT_ORDER);){

            stmt.setInt(1, StudentOrderStatus.START.ordinal());
            stmt.setTimestamp(2,java.sql.Timestamp.valueOf(so.getStudentOrderDate()));
            stmt.setString(3,so.getHusband().getSurName());
            stmt.setString(4,so.getHusband().getGivenName());
            stmt.setString(5,so.getHusband().getPatronymic());
            stmt.setDate(6,java.sql.Date.valueOf(so.getHusband().getDateOfBirth()));

        }catch (SQLException ex){
            throw new DaoException(ex);
        }
        return 0L;
    }
}
