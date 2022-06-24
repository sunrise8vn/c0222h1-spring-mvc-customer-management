package com.cg.service;

import com.cg.model.Province;
import com.cg.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public List<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Optional<Province> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Province getById(Long id) {
        return provinceRepository.getById(id);
    }

    @Override
    public void save(Province province) {

    }

    @Override
    public void remove(Long id) {

    }
}
