package com.vm.vendas.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class VendedorDto {

    @NotBlank
    private String nome;
}
