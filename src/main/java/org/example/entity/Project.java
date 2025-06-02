package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String project_name;
    private String project_description;

    @ManyToMany(mappedBy = "projects")
    private List<Computer> computers;





    @Override
    public String toString() {
        return "id du projet : " + id +
                ", nom du projet : " + project_name + '\'' +
                ", description : " + project_description + '\'' +

                '}';
    }
}
