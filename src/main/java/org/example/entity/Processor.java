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
public class Processor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_processor;

    private String processor;

    @OneToMany(mappedBy = "Computer")
    private List<Computer> computers;

}