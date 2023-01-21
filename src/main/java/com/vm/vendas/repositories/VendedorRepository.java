package com.vm.vendas.repositories;

import com.vm.vendas.models.VendedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends JpaRepository<VendedorModel, Long> {
}
