package org.example.dao;

import org.example.entity.Computer;
import org.example.entity.OperatingSystem;

import java.util.List;

public class OperatingSystemDAO extends BaseDAO<OperatingSystem> {

    public List<OperatingSystem> getAll (){
        return em.createQuery("Select c from OperatingSystem c ", OperatingSystem.class).getResultList();
    }



}
