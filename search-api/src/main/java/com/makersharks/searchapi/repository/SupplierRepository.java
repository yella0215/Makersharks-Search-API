package com.makersharks.searchapi.repository;

import com.makersharks.searchapi.model.Supplier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(
            String location,
            String natureOfBusiness,
            List<String> manufacturingProcesses, Pageable pageable);
}
