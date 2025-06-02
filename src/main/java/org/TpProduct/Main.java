package org.TpProduct;

import org.TpProduct.DAO.ProductDAO;
import org.TpProduct.entity.Electronic;
import org.TpProduct.entity.Food;
import org.TpProduct.entity.Housing;
import org.TpProduct.entity.Product;
import org.TpProduct.util.IHM;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_demo");
        EntityManager em = emf.createEntityManager();
        ProductDAO productDAO = new ProductDAO();

        Food couscous = Food.builder().product_name("Le couscous de nouvel an").price(5.5).expiryDate("10/10/2025").build();
        Electronic nokia3310 = Electronic.builder().product_name("Chuck Norris").price(12.3).batteryDuration(999).build();
        Housing schtomel = Housing.builder().product_name("haha un Schtömel pas un CHTEUMEUL").price(66.66).height(10.3).width(8.6).build();

        new IHM().start();

    }
}
