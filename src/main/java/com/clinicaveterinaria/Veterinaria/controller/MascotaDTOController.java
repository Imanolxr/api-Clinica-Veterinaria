
package com.clinicaveterinaria.Veterinaria.controller;

import com.clinicaveterinaria.Veterinaria.dto.MascotaDTO;
import com.clinicaveterinaria.Veterinaria.model.Dueño;
import com.clinicaveterinaria.Veterinaria.model.Mascota;
import com.clinicaveterinaria.Veterinaria.service.DueñoService;
import com.clinicaveterinaria.Veterinaria.service.MascotaDTOService;
import com.clinicaveterinaria.Veterinaria.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaDTOController {
    @Autowired 
    MascotaService mascoServ;
    @Autowired
    MascotaDTOService mascoDTO;
    @Autowired
    DueñoService dueñoServ;
    
        @GetMapping("/mascota/traer/dto/{id_mascota}")
    public MascotaDTO traerDto(@PathVariable Long id_mascota){
        Mascota masco = mascoServ.traerMascota(id_mascota);
        Dueño dueño = masco.getDueño();
        return mascoDTO.mapearDTO(masco, dueño);
    }
    
}
