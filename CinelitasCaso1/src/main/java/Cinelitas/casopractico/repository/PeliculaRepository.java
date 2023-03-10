/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinelitas.casopractico.repository;

import Cinelitas.casopractico.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author david
 */
@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula,Long> {
    
}
