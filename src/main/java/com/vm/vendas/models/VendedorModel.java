package com.vm.vendas.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tb_vendedor")
public class VendedorModel {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vendedor_id")
    private Long vendedorId;
    private String nome;

}
