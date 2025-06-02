package org.TpProduct.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data

public class Housing extends Product{

    private double height;
    private double width;

}
