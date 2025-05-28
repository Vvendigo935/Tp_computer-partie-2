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
public class OperatingSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_os;

private String opSystem;



    @OneToMany(mappedBy = "Computer")
    private List<Computer> computers;

}
