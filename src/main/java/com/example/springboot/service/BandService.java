package com.example.springboot.service;

import com.example.springboot.dataaccess.BandsDAO;
import com.example.springboot.domain.Band;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class BandService {

    @Autowired
    BandsDAO bandsDAO;

    public List<Band> getBands() throws SQLException, ClassNotFoundException{
        return bandsDAO.getBands();
    }
}
