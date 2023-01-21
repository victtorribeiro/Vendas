package com.vm.vendas.dtos;

import com.vm.vendas.models.VendedorModel;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class VendasDto {

    @NotNull
    private LocalDateTime dataVenda;

    @NotNull
    private float valor;

    private VendedorModel vendedorId;
}
