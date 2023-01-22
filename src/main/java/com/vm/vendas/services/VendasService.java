package com.vm.vendas.services;

import com.vm.vendas.dtos.VendasDto;
import com.vm.vendas.models.VendasModel;
import com.vm.vendas.repositories.VendasRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VendasService {

    @Autowired
    VendasRepository vendasRepository;

    public VendasModel saveVendas(VendasModel vendasModel){
        return vendasRepository.save(vendasModel);
    }

    public List<VendasModel> findVendas(){
        return vendasRepository.findAll();
    }

    public List<VendasDto> findVendasMedia(VendasDto vendasDto) {
        List<Object> vendasModel = vendasRepository.findByMedia(vendasDto);
        List<VendasDto> vendasDtos = new ArrayList<>();
        BeanUtils.copyProperties(vendasModel, vendasDtos);

        vendasDtos =(List<VendasDto>)(Object) vendasModel;



        return vendasDtos ;
    }
}
