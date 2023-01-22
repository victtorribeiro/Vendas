package com.vm.vendas.controllers;

import com.vm.vendas.dtos.VendasDto;
import com.vm.vendas.models.VendasModel;
import com.vm.vendas.services.VendasService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

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

    @GetMapping("find-all-vendas")
    public List<VendasModel> findVendas(){
        List<VendasModel> vendasModel = vendasService.findVendas();
        return vendasModel;
    }

    @GetMapping("find-all-vendas-media")
    public List<VendasDto> findVendasMedia(
            @RequestParam(value = "vendedor_id") Long vendedor_id
           // @RequestParam(value = "data_inicial", required = false) @DateTimeFormat LocalDateTime data_inicial,
            //@RequestParam(value = "data_final", required = false) @DateTimeFormat LocalDateTime data_final
    ){
        VendasDto vendasDto = new VendasDto();
        vendasDto.setDataInicial(LocalDateTime.now());
        vendasDto.setDataFinal(LocalDateTime.now());
        return vendasService.findVendasMedia(vendasDto);
    }

}
