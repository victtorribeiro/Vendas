package com.vm.vendas.controllers;

import com.vm.vendas.dtos.VendedorDto;
import com.vm.vendas.models.VendedorModel;
import com.vm.vendas.services.VendedorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class VendedorController {

    @Autowired
    VendedorService vendedorService;

    @PostMapping("save-vendedor")
    public ResponseEntity<VendedorModel> saveVendedor(@RequestBody @Valid VendedorDto vendedorDto){
        VendedorModel vendedorModel = new VendedorModel();
        BeanUtils.copyProperties(vendedorDto, vendedorModel);

        vendedorService.saveVendedor(vendedorModel);

        return new ResponseEntity<>(vendedorModel, HttpStatus.CREATED);
    }
}
