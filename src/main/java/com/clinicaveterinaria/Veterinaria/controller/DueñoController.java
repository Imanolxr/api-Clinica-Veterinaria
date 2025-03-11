
package com.clinicaveterinaria.Veterinaria.controller;

import com.clinicaveterinaria.Veterinaria.model.Dueño;
import com.clinicaveterinaria.Veterinaria.model.Mascota;
import com.clinicaveterinaria.Veterinaria.service.DueñoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DueñoController {
    @Autowired
    DueñoService dueñoServ;
    
    @PostMapping("/dueño/crear")
    public void crearDueño(@RequestBody Dueño dueño){
        dueñoServ.crearDueño(dueño);
    }

    @DeleteMapping("/dueño/eliminar/{id}")
    public void eliminarDueño(@PathVariable Long id){
        dueñoServ.eliminarDueño(id);
    }
    
    @GetMapping("/dueño/traer/{id}")
    public Dueño mostrarDueño(@PathVariable Long id){
        return dueñoServ.traerDueño(id);
    }
    @PutMapping("/dueño/modificar")
    public void modificarDueño(@RequestBody Dueño dueño){
        this.crearDueño(dueño);
    }
    
    @GetMapping("/dueño/lista")
    public List<Dueño> traerListaDueño(){
        return dueñoServ.traerListaDueños();
    }
    @GetMapping("/dueño/lista/mascotas/{id}")
    public List<Mascota> traerListaMascotasDueño(@PathVariable Long id){
        return dueñoServ.traerListaMascotas(id);
    }
    

}
