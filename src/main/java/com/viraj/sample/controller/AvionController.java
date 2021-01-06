package com.viraj.sample.controller;

import java.util.List;

import com.viraj.sample.entity.Avion;
import com.viraj.sample.service.AvionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/avion/")
public class AvionController {
    @Autowired
    private AvionService avionService;

    @GetMapping(path = "/hello")
    public String getMessage() {
        return "Hello boot";
    }

    @PostMapping("/save")
    public Avion saveAvion(@RequestBody Avion avion) {

        return avionService.saveAvion(avion);
    }

    @PutMapping("/update/{avionId}")
    public Avion updateAvion(@RequestBody Avion avion,@PathVariable(name = "avionId") Integer avionId) {
        Avion existing=this.avionService.getAvion(avionId);
        existing.setAvionName(avion.getAvionName());
        existing.setAvionMarque(avion.getAvionMarque());
        existing.setAvionNbrP(avion.getAvionNbrP());
        return this.avionService.saveAvion(existing);
        
    }

    @GetMapping("/getall")
    public List<Avion> getAllAvions() {
        return avionService.getAllAvions();
    }

    @GetMapping("/getone/{avionId}")
    public Avion getAvion(@PathVariable(name = "avionId") Integer avionId) {
        return avionService.getAvion(avionId);
    }

    @DeleteMapping("/delete/{avionId}")
    public void deleteAvion(@PathVariable(name = "avionId") Integer avionId) {
        avionService.deleteAvion(avionId);
    }
}
