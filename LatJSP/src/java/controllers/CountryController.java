/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.math.BigDecimal;
import java.util.List;
import models.*;
import org.hibernate.SessionFactory;
import org.hibernate.sql.Insert;

/**
 *
 * @author FES
 */
public class CountryController implements CountryControllerInterface{
    
    private DAOInterface<Country> dao;
    
    public CountryController(SessionFactory factory){
        dao = new GeneralDAO<>(factory, Country.class);
    }


    @Override
    public Country getById(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Country> getAll() {
       return dao.getData("");
    }

    @Override
    public List<Country> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name, String region) {
        if (dao.saveOrDelete(new Country(id, name, new Region(new BigDecimal(region))), true)) {
            return "Save Data Success";
        } else {
            return "Save Failed";
        }
    }

    @Override
    public String delete(String id, String name, String region) {
        if (dao.saveOrDelete(new Country(id, name, new Region(new BigDecimal(region))), true)) {
            return "Delete Data Success";
        } else {
            return "Delete Failed";
        }
    }    
        
}
