package it.mensa.controller;

import it.mensa.service.ServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public abstract class AbstractController<DTO> {

    @Autowired
    public ServiceDTO<DTO> service;

    @PostMapping("/insert")
    public DTO insert(DTO dto){
        return service.insert(dto);
    }
    @GetMapping("/read")
    public DTO read(long id){
        return service.read(id);
    }
    @PutMapping("/update")
    public DTO update(DTO dto){
        return service.update(dto);
    }
    @DeleteMapping("/delete")
    public void delete(long id){
        service.delete(id);
    }
    @GetMapping("/getAll")
    public Iterable<DTO> getAll(){
        return service.getAll();
    }
}
