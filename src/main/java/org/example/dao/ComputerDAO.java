package org.example.dao;

import org.example.entity.Computer;

import java.util.List;

public class ComputerDAO extends BaseDAO<Computer> {

    public List<Computer> getAll (){
        return em.createQuery("Select c from Computer c ", Computer.class).getResultList();
    }
}
