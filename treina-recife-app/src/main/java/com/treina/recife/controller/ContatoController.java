package com.treina.recife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.treina.recife.model.Contato;
import com.treina.recife.service.ContatoService;
@RestController
public class ContatoController {
    @PostMapping("/contatos")
    
   public Contato criarNovoContato(@RequestBody Contato contato){
        return contatoService.save(contato);
   }

   @GetMapping("/contatos")
   public List<Contato> obterTodosContatos(){
    return contatoService.findAll();
   }

   @Autowired
   private ContatoService contatoService;
}
