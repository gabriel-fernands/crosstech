package br.com.altech.cross.controller;

import br.com.altech.cross.controller.dto.DesafioRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/transacao")
@RestController
public class DesafioController {

    @PostMapping
    public void salvar(@RequestBody DesafioRequestDTO requestDTO){
        System.out.println(requestDTO);
    }
}
