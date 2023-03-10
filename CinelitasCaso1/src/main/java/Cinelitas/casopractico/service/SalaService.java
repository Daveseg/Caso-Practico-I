/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinelitas.casopractico.service;

import Cinelitas.casopractico.entity.Sala;
import Cinelitas.casopractico.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class SalaService implements ISalaService {

    @Autowired
    private SalaRepository salaRespository;

    @Override
    public List<Sala> listCinema() {
        return (List<Sala>) salaRespository.findAll();
    }

}
