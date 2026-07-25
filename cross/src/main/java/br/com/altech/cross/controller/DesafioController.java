package br.com.altech.cross.controller;

import br.com.altech.cross.controller.dto.DesafioRequestDTO;
import br.com.altech.cross.service.DesafioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/transacao")
@RestController
@Slf4j
public class DesafioController {

    private DesafioService desafioService;

    public DesafioController(DesafioService desafioService) {
        this.desafioService = desafioService;
    }

    @PostMapping
    public void salvar(@RequestBody DesafioRequestDTO requestDTO){
        log.info("Recebida requisição para salvar transação: {}", requestDTO);
        desafioService.salvar(requestDTO);
        log.info("transação salva: {}",  requestDTO);
    }
}
