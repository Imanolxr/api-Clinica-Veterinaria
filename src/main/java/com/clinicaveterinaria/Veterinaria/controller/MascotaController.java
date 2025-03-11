
package com.clinicaveterinaria.Veterinaria.controller;
import com.clinicaveterinaria.Veterinaria.model.Mascota;
import com.clinicaveterinaria.Veterinaria.service.MascotaDTOService;
import com.clinicaveterinaria.Veterinaria.service.MascotaService;
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
public class MascotaController {
    @Autowired 
    MascotaService mascoServ;
    
    @PostMapping("/mascota/crear")
    public void crearMascota(@RequestBody Mascota masco){
        mascoServ.crearMascota(masco);
    }
    @DeleteMapping("mascota/borrar/{id}")
    public void borrarMascota(@PathVariable Long id){
        mascoServ.borrarMascota(id);        
    }
    @GetMapping("/mascota/traer/{id}")
    public Mascota traerMascota(@PathVariable Long id){
       return mascoServ.traerMascota(id);        
    }
    @PutMapping("/mascota/modificar")
    public void modificarMascota(@RequestBody Mascota masco){
        this.crearMascota(masco);
    }
    @GetMapping("/mascota/busqueda/{raza}/{especie}")
    public List <Mascota> busquedaFiltro(@PathVariable String raza, @PathVariable String especie){
        return mascoServ.busquedaMascota(raza, especie);        
    }
    @GetMapping("/mascota/traer/lista")
    public List<Mascota> traerListaMascotas(){
        return mascoServ.traerListaMascotas();
    }

    
}
