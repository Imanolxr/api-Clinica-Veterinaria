
package com.clinicaveterinaria.Veterinaria.service;

import com.clinicaveterinaria.Veterinaria.model.Mascota;
import com.clinicaveterinaria.Veterinaria.repository.IMascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{
    
    @Autowired
    IMascotaRepository mascoRepo;

    @Override
    public void crearMascota(Mascota masco) {
        mascoRepo.save(masco);
    }

    @Override
    public void borrarMascota(Long id) {
        mascoRepo.deleteById(id);
    }

    @Override
    public Mascota traerMascota(Long id_mascota) {
        return mascoRepo.findById(id_mascota).orElse(null);
    }

    @Override
    public List<Mascota> traerListaMascotas() {
        return mascoRepo.findAll();
    }

    @Override
    public void modificarMascota(Mascota masco) {
        this.crearMascota(masco);
    }

    @Override
    public List<Mascota> busquedaMascota(String especie, String raza) {
        return mascoRepo.findByEspecieAndRaza(raza, especie);
    }
    
}
