package org.example.dao;

import org.example.entity.Project;

import java.util.List;

public class ProjectDAO extends BaseDAO<Project>{

    public List<Project> getAll (){
        return em.createQuery("Select c from Project c ", Project.class).getResultList();
    }


}
