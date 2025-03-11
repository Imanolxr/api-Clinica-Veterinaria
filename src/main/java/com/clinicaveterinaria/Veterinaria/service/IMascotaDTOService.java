
package com.clinicaveterinaria.Veterinaria.service;

import com.clinicaveterinaria.Veterinaria.dto.MascotaDTO;
import com.clinicaveterinaria.Veterinaria.model.Dueño;
import com.clinicaveterinaria.Veterinaria.model.Mascota;


public interface IMascotaDTOService {
    public MascotaDTO mapearDTO(Mascota masco, Dueño dueño);
    
}
