package com.vm.vendas.services;

import com.vm.vendas.models.VendedorModel;
import com.vm.vendas.repositories.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorService {

    @Autowired
    VendedorRepository vendedorRepository;

    public VendedorModel saveVendedor(VendedorModel vendedorModel) {

        return vendedorRepository.save(vendedorModel);

    }
}
