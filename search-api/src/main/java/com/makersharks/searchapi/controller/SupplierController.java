package com.makersharks.searchapi.controller;

import com.makersharks.searchapi.model.Supplier;
import com.makersharks.searchapi.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public ResponseEntity<Page<Supplier>> querySuppliers(
            @RequestParam String location,
            @RequestParam String natureOfBusiness,
            @RequestParam List<String> manufacturingProcesses,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        Page<Supplier> suppliers = supplierService.findSuppliers(
                location, natureOfBusiness, manufacturingProcesses, page, size);

        return ResponseEntity.ok(suppliers);
    }
}
