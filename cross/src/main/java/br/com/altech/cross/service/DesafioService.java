package br.com.altech.cross.service;

import br.com.altech.cross.controller.dto.DesafioRequestDTO;
import br.com.altech.cross.entity.Transacoes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class DesafioService {

    private final List<Transacoes> transacoes = new ArrayList<>();

    public void salvar(DesafioRequestDTO requestDTO){
        transacoes.add(new Transacoes(requestDTO));

    }
}
