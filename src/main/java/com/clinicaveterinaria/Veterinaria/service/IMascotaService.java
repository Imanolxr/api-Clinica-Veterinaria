
package com.clinicaveterinaria.Veterinaria.service;

import com.clinicaveterinaria.Veterinaria.model.Mascota;
import java.util.List;


public interface IMascotaService {
    
    //alta Mascota
    public void crearMascota(Mascota masco);
    
    //baja Mascota
    public void borrarMascota(Long id);
    
    // lectura 1 mascota
    public Mascota traerMascota(Long id_mascota);
    
    //traer lista completa mascotas
    public List<Mascota> traerListaMascotas();
    
    //modificar Mascota
    public void modificarMascota(Mascota masco);
    
    //traer listado con busqueda especial    
    public List<Mascota> busquedaMascota(String especie, String raza);
    
}
