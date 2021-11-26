package com.infotech.ElectricityBills.repository;

import com.infotech.ElectricityBills.entity.Bills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillsRepository extends JpaRepository<Bills, Long> {
    Bills findByUserIdAndPassword(Long id, String password);

    Bills findByUserId(Long id);
}
