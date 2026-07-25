package br.com.altech.cross.entity;

import br.com.altech.cross.controller.dto.DesafioRequestDTO;

import java.time.OffsetDateTime;
public class Transacoes {
    
    private Double valor;
    private OffsetDateTime dataHora;

    public Transacoes(Double valor, OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public Transacoes(DesafioRequestDTO requestDTO) {
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
