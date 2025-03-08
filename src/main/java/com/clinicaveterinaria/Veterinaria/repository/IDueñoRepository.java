
package com.clinicaveterinaria.Veterinaria.repository;

import com.clinicaveterinaria.Veterinaria.model.Dueño;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDueñoRepository extends JpaRepository <Dueño, Long>{
    
}
