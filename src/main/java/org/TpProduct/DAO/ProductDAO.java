package org.TpProduct.DAO;

import org.TpProduct.entity.Product;

import java.util.List;

public class ProductDAO extends BaseDAOproduct<Product>{

    public List<Product> getAll (){
        return em.createQuery("Select c from product c ", Product.class).getResultList();
    }


}
