
package com.clinicaveterinaria.Veterinaria.service;

import com.clinicaveterinaria.Veterinaria.model.Dueño;
import com.clinicaveterinaria.Veterinaria.model.Mascota;
import com.clinicaveterinaria.Veterinaria.repository.IDueñoRepository;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DueñoService implements IDueñoService{
    @Autowired
    IDueñoRepository dueñoRepo;    

    @Override
    public void crearDueño(Dueño dueño) {
        dueñoRepo.save(dueño);
    }

    @Override
    public void eliminarDueño(Long id_dueño) {
        dueñoRepo.deleteById(id_dueño);
    }

    @Override
    public Dueño traerDueño(Long id_dueño) {
        return dueñoRepo.findById(id_dueño).orElse(null);
    }

    @Override
    public void modificarDueño(Dueño dueño) {
        this.crearDueño(dueño);
    }

    @Override
    public List<Dueño> traerListaDueños() {
        return dueñoRepo.findAll();
    }

    @Override
    public List<Mascota> traerListaMascotas(Long id_dueño) {
            return dueñoRepo.findById(id_dueño).map(Dueño::getListaMascotas).orElse(Collections.emptyList()); 
    
}
}