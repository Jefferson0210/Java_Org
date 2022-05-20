
package com.mycompany.movilbackend.dao;

import com.mycompany.movilbackend.model.Dirrecion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirrecionRepository extends JpaRepository<Dirrecion, Long>{

   
    
}
