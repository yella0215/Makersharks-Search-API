package com.makersharks.searchapi.service;

import com.makersharks.searchapi.model.Supplier;
import com.makersharks.searchapi.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public Page<Supplier> findSuppliers(String location, String natureOfBusiness,
                                        List<String> manufacturingProcesses,
                                        int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(
                location, natureOfBusiness, manufacturingProcesses, pageable);
    }
}
