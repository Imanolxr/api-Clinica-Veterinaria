
package com.clinicaveterinaria.Veterinaria.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MascotaDTO {
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_dueño;
    private String apellido_dueño;

    public MascotaDTO() {
    }

    public MascotaDTO(String nombre_mascota, String especie, String raza, String nombre_dueño, String apellido_dueño) {
        this.nombre_mascota = nombre_mascota;
        this.especie = especie;
        this.raza = raza;
        this.nombre_dueño = nombre_dueño;
        this.apellido_dueño = apellido_dueño;
    }
    
    
    
}
