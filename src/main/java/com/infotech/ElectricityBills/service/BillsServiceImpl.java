package com.infotech.ElectricityBills.service;

import com.infotech.ElectricityBills.controller.LoginRequest;
import com.infotech.ElectricityBills.controller.UpdateUser;
import com.infotech.ElectricityBills.entity.Bills;
import com.infotech.ElectricityBills.repository.BillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BillsServiceImpl implements BillsService {

    @Autowired
    private BillsRepository billsRepository;

    @Override
    public Bills saveBills(Bills bills) {
        return billsRepository.save(bills);

    }

    @Override
    public String login(LoginRequest loginRequest) throws Exception {


        Bills bills = billsRepository.findByUserId(loginRequest.getId());

         if(loginRequest.getPassword().equals(bills.getPassword())) {
             return "Success";
         }else {
             return "Failed";
         }
    }

    @Override
    public Object fetchBillsById(Long userId) {
        return billsRepository.findById(userId);

    }

    @Override
    public List<Bills> fetchByList() {
        return billsRepository.findAll();
    }

    @Override
    public String deleteBillsById(Long userId) {
        billsRepository.deleteById(userId);
        return "User Deleted Successfully";
    }

    @Override
    public String updateBills(Long userId, Bills bills) {

        Bills bills1 = billsRepository.findByUserId(userId);


        bills1.setUserName(bills.getUserName());
        bills1.setPassword(bills.getPassword());
        bills1.setPayment(bills.getPayment());
        bills1.setProp(bills.getProp());
        bills1.setAmount(bills.getAmount());
        bills1.setUnits(bills.getUnits());
        billsRepository.save(bills1);


        return "User Updated Succefully";
    }



}
