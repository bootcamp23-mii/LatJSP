/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.RegionController;
import controllers.RegionControllerInterface;
import daos.DAOInterface;
import daos.GeneralDAO;
import java.math.BigDecimal;
import models.Country;
import models.Location;
import models.Region;
import org.hibernate.SessionFactory;

/**
 *
 * @author FES
 */
public class LatORM {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        RegionControllerInterface rc = new RegionController(sessionFactory);
        System.out.println(sessionFactory);
        for (Region region : rc.getAll()) {
            System.out.println(region.getName());
        }
//        for (Region region : rdao.getAll()) {
//            System.out.println(region.getName());
//            for (Country country : region.getCountryList()) {
//                System.out.println("->"+country.getName()+"("+country.getRegion().getName()+")");
//                for (Location location : country.getLocationList()) {
//                    System.out.println("-->"+location.getStreetAddress());
//                }
//            }
//        }
//        System.out.println(rdao.SearchById("1"));
//        Region regS = rdao.getById("1");
//        System.out.println(regS.getId()+" <<>> "+regS.getName());
//        for (Region region : rdao.getData("a")) {
//            System.out.println(region.getId()+" <<>> "+region.getName());
//        }
    }
}
