package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Identification {
    private String mac;
    private String ipAddress;

    @Override
    public String toString() {
        return "Identification{" +
                "mac='" + mac + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                '}';
    }
}
