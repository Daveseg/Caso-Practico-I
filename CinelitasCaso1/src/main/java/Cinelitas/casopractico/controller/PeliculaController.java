/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinelitas.casopractico.controller;

import Cinelitas.casopractico.entity.Pelicula;
import Cinelitas.casopractico.entity.Sala;
import Cinelitas.casopractico.service.IPeliculaService;
import Cinelitas.casopractico.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author david
 */
@Controller
public class PeliculaController {

    @Autowired
    private IPeliculaService peliculaService;

    @Autowired
    private ISalaService salaService;

    @GetMapping("/pelicula")
    public String index(Model model) {
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        model.addAttribute("titulo", "Cartelera");
        model.addAttribute("peliculas", listaPelicula);
        return "pelicula";
    }

    @GetMapping("/personaN")
    public String crearPelicula(Model model) {
        List<Sala> listaSalas = salaService.listCinema();
        model.addAttribute("titulo", "Formulario");
        model.addAttribute("pelicula", new Pelicula());
        model.addAttribute("salas", listaSalas);
        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id") Long idPelicula) {
        peliculaService.delete(idPelicula);
        return "redirect:/pelicula";
    }

    @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula) {
        peliculaService.savePelicula(pelicula);
        return "redirect:/pelicula";
    }

    @GetMapping("/editPelicula/{id}")
    public String editarPelicula(@PathVariable("id") Long idPelicula, Model model) {
        Pelicula pelicula = peliculaService.gePeliculaById(idPelicula);
        List<Sala> listaSalas = salaService.listCinema();
        model.addAttribute("pelicula", pelicula);
        model.addAttribute("salas", listaSalas);
        return "Crear";
    }
}