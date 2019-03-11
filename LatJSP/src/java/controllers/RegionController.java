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
public class RegionController implements RegionControllerInterface{
    
    private DAOInterface<Region> dao;
    
    public RegionController(SessionFactory factory){
        dao = new GeneralDAO<>(factory, Region.class);
    }


    @Override
    public Region getById(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Region> getAll() {
       return dao.getData("");
    }

    @Override
    public List<Region> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name) {
        if (dao.saveOrDelete(new Region(new BigDecimal(id), name), true)) {
            return "Save Data Success";
        } else {
            return "Save Failed";
        }
    }

    @Override
    public String delete(String id, String name) {
        if (dao.saveOrDelete(new Region(new BigDecimal(id), name), true)) {
            return "Delete Data Success";
        } else {
            return "Delete Failed";
        }
    }    
        
}
