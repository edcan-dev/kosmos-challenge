package dev.edcan.kosmoschallenge.service.impl;

import dev.edcan.kosmoschallenge.model.Office;
import dev.edcan.kosmoschallenge.repository.OfficeRepository;
import dev.edcan.kosmoschallenge.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OfficeServiceImpl implements OfficeService {

  OfficeRepository officeRepository;

  @Autowired
  public OfficeServiceImpl(OfficeRepository officeRepository) {
    this.officeRepository = officeRepository;
  }


  @Override
  public List<Office> findAll() {
    return this.officeRepository.findAll();
  }
}
