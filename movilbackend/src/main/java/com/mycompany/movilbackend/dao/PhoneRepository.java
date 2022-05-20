/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.movilbackend.dao;

import com.mycompany.movilbackend.model.Person;
import com.mycompany.movilbackend.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DELL
 */
@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {

    public void save(Person persona);
    
}
