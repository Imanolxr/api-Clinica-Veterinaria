
package com.clinicaveterinaria.Veterinaria.service;

import com.clinicaveterinaria.Veterinaria.model.Dueño;
import com.clinicaveterinaria.Veterinaria.model.Mascota;
import java.util.List;

public interface IDueñoService {
    //alta dueño
    public void crearDueño(Dueño dueño);
    
    //baja dueño
    public void eliminarDueño(Long id_dueño);
    
    // lectura de un dueño
    public Dueño traerDueño(Long id_dueño);
    
    //modificar dueño
    public void modificarDueño(Dueño dueño);
    
    //traer lista de Dueños
    public List<Dueño> traerListaDueños();
    
    //traer lista de mascota de un dueño
    public List<Mascota> traerListaMascotas(Long id_dueño);
    
}
