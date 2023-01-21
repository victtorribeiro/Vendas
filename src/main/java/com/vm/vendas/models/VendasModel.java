package com.vm.vendas.models;

import lombok.Data;
import org.springframework.ui.Model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "tb_vendas")
public class VendasModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "venda_id")
    private Long vendaId;
    @Column(name = "data_venda")
    private LocalDateTime dataVenda;
    private float valor;
    @JoinColumn(name = "vendedor_id")
    @ManyToOne
    private VendedorModel vendedorId;

}
