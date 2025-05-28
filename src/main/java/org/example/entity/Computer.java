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

}
