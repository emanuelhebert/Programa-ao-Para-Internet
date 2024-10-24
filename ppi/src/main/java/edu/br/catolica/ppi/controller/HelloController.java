package edu.br.catolica.ppi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloController {


    @GetMapping("/{name}")
    public ResponseEntity<String> hello(@PathVariable String name){
        return ResponseEntity.ok("Hello "+ name);
    }

}
