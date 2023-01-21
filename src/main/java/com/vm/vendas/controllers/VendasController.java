package com.vm.vendas.controllers;

import com.vm.vendas.dtos.VendasDto;
import com.vm.vendas.models.VendasModel;
import com.vm.vendas.services.VendasService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class VendasController {

    @Autowired
    VendasService vendasService;

    @PostMapping("save-vendas")
    public ResponseEntity<VendasModel> saveVendas(@RequestBody @Valid VendasDto vendasDto){

        VendasModel vendasModel = new VendasModel();
        BeanUtils.copyProperties(vendasDto, vendasModel);

        vendasService.saveVendas(vendasModel);

        return new ResponseEntity<>(vendasModel, HttpStatus.CREATED);
    }

}
