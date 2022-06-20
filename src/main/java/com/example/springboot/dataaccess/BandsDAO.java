package com.example.springboot.dataaccess;

import com.example.springboot.domain.Band;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BandsDAO {

    public List<Band> getBands() throws SQLException, ClassNotFoundException {
        Connection con=ConnectionHelper.getMSSQLConnection();
        Statement stmt=con.createStatement();
        System.out.println("Got the statement:"+stmt);
        ResultSet rs=stmt.executeQuery("select * from bands");
        System.out.println("Got the result set");
        List<Band> bands=new ArrayList();
        while(rs.next()) {
            Band band = new Band();
            band.setId(rs.getLong(1));
            band.setName(rs.getString(2));
            bands.add(band);
        }
        return bands;
    }
}
