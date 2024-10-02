package org.example.repo;

import org.example.db.DbConnection;
import org.example.model.Customer;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerRepo {
    public static Boolean save(Customer customer) throws SQLException {
        String sql = "insert into customer values (?,?,?,?,?)";
        PreparedStatement pstm = DbConnection.getInstance().getConnection().prepareStatement(sql);
        pstm.setObject(1, customer.getId());
        pstm.setObject(2, customer.getName());
        pstm.setObject(3, customer.getAddress());
        pstm.setObject(4, customer.getTel());
        pstm.setObject(5, customer.getStatus());

         return pstm.executeUpdate()>0;

    }

    public static boolean delete(String id) throws SQLException {
        String sql = "update customer set status ='deactivate' where id = ? ";

        PreparedStatement pstm = DbConnection.getInstance().getConnection().prepareStatement(sql);

        pstm.setString(1, id);

        return pstm.executeUpdate()>0;
    }
}
