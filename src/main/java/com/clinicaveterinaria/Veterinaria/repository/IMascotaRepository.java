
package com.clinicaveterinaria.Veterinaria.repository;

import com.clinicaveterinaria.Veterinaria.model.Mascota;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long>{
    
    // Usar @Query para hacer la búsqueda directamente en la base de datos
    @Query("SELECT m FROM Mascota m WHERE LOWER(m.especie) = LOWER(:especie) AND LOWER(m.raza) = LOWER(:raza)")
    List<Mascota> findByEspecieAndRaza(@Param("especie") String especie, @Param("raza") String raza);
    
    @Query("SELECT m FROM Mascota m WHERE m.dueño.id_dueño = :idDueño")
    List<Mascota> findByIdDueño(@Param("idDueño") Long idDueño);
    
}
