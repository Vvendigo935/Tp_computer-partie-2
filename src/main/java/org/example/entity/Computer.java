package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.util.ComputerOS;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String model;

    @Embedded
    private Identification identification;

    @ManyToOne
    @JoinColumn(name = "id_os")
    private OperatingSystem operatingSystem;

    @ManyToOne
    @JoinColumn(name = "id_processor")
    private Processor processor;

    @ManyToMany
    @JoinTable(name = "computer_project",
            joinColumns = @JoinColumn(name = "computerId"),
            inverseJoinColumns = @JoinColumn(name = "projectId"))
    private List<Project> projects;

    public void addProject(Project project){
        projects.add(project);
    }
    public void deleteProject(Project project){
        projects.remove(project);
    }
    public void setProject(Project project){
        projects.set(id, project);
    }


    @Override
    public String toString() {
        return "Computer : " +
                "id du PC : " + id +
                ", le modèle :" + model + '\'' +
                ", les matricules : " + identification +
                ", OS : " + operatingSystem +
                ", le processeur" + processor +
                ", affecté au projet : " + projects;
    }
}
