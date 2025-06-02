package org.example;

import org.example.dao.ComputerDAO;
import org.example.dao.OperatingSystemDAO;
import org.example.dao.ProcessorDAO;
import org.example.dao.ProjectDAO;
import org.example.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_demo");
        EntityManager em = emf.createEntityManager();
        ComputerDAO computerDAO = new ComputerDAO();
        ProjectDAO projectDAO = new ProjectDAO();
        OperatingSystemDAO operatingSystemDAO = new OperatingSystemDAO();
        ProcessorDAO processorDAO = new ProcessorDAO();

//        Computer computer1 = Computer.builder().model("model1").identification(new Identification("adressMac","127.0.0.1")).build();
//        Computer computer2 = Computer.builder().model("model2").identification(new Identification("adressBigMac","127.0.0.2")).build();
//        Computer computer3 = Computer.builder().model("model3").identification(new Identification("adressMacTominay","127.0.0.3")).build();
//        OperatingSystem op1 = OperatingSystem.builder().opSystem("Windows").build();

//        OperatingSystem operatingSystem1 = OperatingSystem.builder().opSystem("Windows").build();
//        Processor processor1 = Processor.builder().processor("Intel").computers(Arrays.asList(computer1)).build();

//        computer1.setOperatingSystem(OperatingSystem.builder().opSystem(op1).build());
//        operatingSystemDAO.save(op1);
//        computerDAO.update(computer1).setOperatingSystem(op1);

//        computerDAO.save(computer1);
//        computerDAO.save(computer2);
//        computerDAO.save(computer3);

//        Project pj1 = Project.builder().project_name("projet X").project_description("Le projet fait dans une baraque et c'est allé trop loin").build();
//        Project pj2 = Project.builder().project_name("projet Manhattan").project_description("Le projet qui te fait gagner une partie de Civilization").build();
//
//        em.getTransaction().begin();
//        em.persist(pj1);
//        em.persist(pj2);
//        em.getTransaction().commit();
//
//        em.getTransaction().begin();
        Computer computer1 = em.find(Computer.class, 1);
        Computer computer2 = em.find(Computer.class, 2);
        Project pj1 = em.find(Project.class, 1);
        Project pj2 = em.find(Project.class, 2);

//        computer1.addProject(pj1);
//        computer2.addProject(pj2);
//        em.getTransaction().commit();

//        Computer computer1 = em.find(Computer.class, 1);
        System.out.println(computer1);
        System.out.println(computer2);


        Computer computerFound = computerDAO.getById(1, Computer.class);
        computerFound.setProject(projectDAO.getById(2, Project.class));

        computerDAO.update(computerFound);


        System.out.println(computer1.getProjects());
        System.out.println(computer2);

//        Project pj1 = em.find(Project.class, 1);

//        System.out.println(computerDAO.getAll());

    }
}