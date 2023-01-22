package com.vm.vendas.repositories;

import com.vm.vendas.dtos.VendasDto;
import com.vm.vendas.models.VendasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendasRepository extends JpaRepository<VendasModel, Long> {

    @Query(value = "SELECT vmm.vendedorId, vmm.nome, AVG(vm.valor) as media, SUM(vm.valor) as valorTotal " +
            " FROM VendasModel vm, VendedorModel vmm  GROUP BY vmm.vendedorId")
    List<Object> findByMedia(VendasDto vendasDto);
}
