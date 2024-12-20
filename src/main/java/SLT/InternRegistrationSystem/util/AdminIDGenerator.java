package SLT.InternRegistrationSystem.util;

import org.hibernate.HibernateException;
import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdminIDGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        String prefix = "A";
        String query = "SELECT MAX(adminID) FROM admins";

        try {
            JdbcConnectionAccess connectionAccess = session.getJdbcConnectionAccess();

            try (Connection connection = connectionAccess.obtainConnection();
                 Statement statement = connection.createStatement();
                 ResultSet rs = statement.executeQuery(query)) {

                if (rs.next()) {
                    String lastID = rs.getString(1);
                    if (lastID != null) {
                        int id = Integer.parseInt(lastID.substring(1));
                        return prefix + String.format("%06d", id + 1);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prefix + "000001";
    }
}
