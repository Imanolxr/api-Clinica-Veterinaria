
package com.clinicaveterinaria.Veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Dueño {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_dueño;
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    @OneToMany(mappedBy = "dueño")
    private List<Mascota> listaMascotas;

    public Dueño() {
    }

    public Dueño(Long id_dueño, String dni, String nombre, String apellido, String telefono, List<Mascota> listaMascotas) {
        this.id_dueño = id_dueño;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.listaMascotas = listaMascotas;
    }
    
    
}
