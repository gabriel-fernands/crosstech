package br.com.altech.cross.controller.dto;

import java.time.OffsetDateTime;

public record DesafioRequestDTO(Double valor, OffsetDateTime dataHora)  {
}
