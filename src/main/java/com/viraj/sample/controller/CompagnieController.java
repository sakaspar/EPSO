package com.viraj.sample.controller;

import java.util.List;

import com.viraj.sample.entity.Compagnie;
import com.viraj.sample.service.CompagnieService;

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
@RequestMapping("/compagnie/")
public class CompagnieController {
    @Autowired
    private CompagnieService compagnieService;

    @GetMapping(path = "/hello")
    public String getMessage() {
        return "Hello boot";
    }

    @PostMapping("/save")
    public Compagnie saveCompagnie(@RequestBody Compagnie compagnie) {

        return compagnieService.saveCompagnie(compagnie);
    }

    @PutMapping("/update/{compagnieId}")
    public Compagnie updateCompagnie(@RequestBody Compagnie compagnie ,@PathVariable(name = "compagnieId") Integer compagnieId) {
        Compagnie existing=this.compagnieService.getCompagnie(compagnieId);
        existing.setCompagnieName(compagnie.getCompagnieName());
        existing.setCompagniePays(compagnie.getCompagniePays());
        return this.compagnieService.saveCompagnie(existing);
    }

    @GetMapping("/getall")
    public List<Compagnie> getAllCompagnies() {
        return compagnieService.getAllCompagnies();
    }

    @GetMapping("/getone/{compagnieId}")
    public Compagnie getCompagnie(@PathVariable(name = "compagnieId") Integer compagnieId) {
        return compagnieService.getCompagnie(compagnieId);
    }

    @DeleteMapping("/delete/{compagnieId}")
    public void deleteCompagnie(@PathVariable(name = "compagnieId") Integer compagnieId) {
        compagnieService.deleteCompagnie(compagnieId);
    }
    @GetMapping("/getS/{compagnieId}")
    public String getS(@PathVariable(name = "compagnieId") Integer compagnieId) {
        return compagnieService.getS(compagnieId);
    }
}
