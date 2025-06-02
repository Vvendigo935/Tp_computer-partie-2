package org.example.dao;

import org.example.entity.Processor;

import java.util.List;

public class ProcessorDAO extends BaseDAO<Processor> {

    public List<Processor> getAll (){
        return em.createQuery("Select c from Processor c ", Processor.class).getResultList();
    }


}
