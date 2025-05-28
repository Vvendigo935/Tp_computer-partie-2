package org.example;

import org.example.dao.ComputerDAO;
import org.example.dao.OperatingSystemDAO;
import org.example.dao.ProcessorDAO;
import org.example.entity.Computer;
import org.example.entity.Identification;
import org.example.entity.OperatingSystem;
import org.example.entity.Processor;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ComputerDAO computerDAO = new ComputerDAO();
        OperatingSystemDAO operatingSystemDAO = new OperatingSystemDAO();
        ProcessorDAO processorDAO = new ProcessorDAO();

        Computer computer1 = Computer.builder().model("model1").identification(new Identification("adressMac","127.0.0.1")).build();
        Computer computer2 = Computer.builder().model("model2").identification(new Identification("adressBigMac","127.0.0.2")).build();
        Computer computer3 = Computer.builder().model("model3").identification(new Identification("adressMacTominay","127.0.0.3")).build();
        OperatingSystem op1 = OperatingSystem.builder().opSystem("Windows").build();

//        OperatingSystem operatingSystem1 = OperatingSystem.builder().opSystem("Windows").build();
//        Processor processor1 = Processor.builder().processor("Intel").computers(Arrays.asList(computer1)).build();

//        computer1.setOperatingSystem(OperatingSystem.builder().opSystem(op1).build());
//        operatingSystemDAO.save(op1);
//        computerDAO.update(computer1).setOperatingSystem(op1);

//        computerDAO.save(computer1);
//        computerDAO.save(computer2);
//        computerDAO.save(computer3);

        System.out.println(computerDAO.getAll());





    }
}