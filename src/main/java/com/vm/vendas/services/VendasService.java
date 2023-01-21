package com.vm.vendas.services;

import com.vm.vendas.models.VendasModel;
import com.vm.vendas.repositories.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class VendasService {

    @Autowired
    VendasRepository vendasRepository;

    public VendasModel saveVendas(VendasModel vendasModel){
        return vendasRepository.save(vendasModel);
    }

}
