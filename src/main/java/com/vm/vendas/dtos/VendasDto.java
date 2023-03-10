package com.vm.vendas.dtos;

import com.vm.vendas.models.VendedorModel;
import lombok.Data;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class VendasDto {

    private LocalDateTime dataVenda;

    private float valor;

    private VendedorModel vendedorId;

    private float media;

    private float valorTotal;

    private LocalDateTime dataInicial;

    private LocalDateTime dataFinal;
}
