/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinelitas.casopractico.service;

import Cinelitas.casopractico.entity.Pelicula;
import java.util.List;

/**
 *
 * @author david
 */
public interface IPeliculaService {
    public List<Pelicula> getAllPelicula();
    public Pelicula gePeliculaById (Long id);
    public void savePelicula (Pelicula pelicula);
    public void delete (Long id);
}