package com.vm.vendas.repositories;

import com.vm.vendas.models.VendasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendasRepository extends JpaRepository<VendasModel, Long> {

}
