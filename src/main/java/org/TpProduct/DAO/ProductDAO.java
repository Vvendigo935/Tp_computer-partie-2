package org.TpProduct.DAO;

import org.TpProduct.entity.Product;

import java.util.List;

public class ProductDAO extends BaseDAOproduct<ProductDAO>{

    public List<Product> getAll (){
        return em.createQuery("Select c from product c ", Product.class).getResultList();
    }


}
