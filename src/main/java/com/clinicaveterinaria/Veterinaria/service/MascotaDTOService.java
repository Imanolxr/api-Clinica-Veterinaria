
package com.clinicaveterinaria.Veterinaria.service;


import com.clinicaveterinaria.Veterinaria.dto.MascotaDTO;
import com.clinicaveterinaria.Veterinaria.model.Dueño;
import com.clinicaveterinaria.Veterinaria.model.Mascota;

import org.springframework.stereotype.Service;

@Service
public class MascotaDTOService implements IMascotaDTOService{


    @Override
    public MascotaDTO mapearDTO(Mascota masco, Dueño dueño) {
        MascotaDTO mascoDTO = new MascotaDTO();
        mascoDTO.setNombre_mascota(masco.getNombre());
        mascoDTO.setEspecie(masco.getEspecie());
        mascoDTO.setRaza(masco.getRaza());
        mascoDTO.setNombre_dueño(dueño.getNombre());
        mascoDTO.setApellido_dueño(dueño.getApellido());
        
        return mascoDTO;

        
    }
    
}
