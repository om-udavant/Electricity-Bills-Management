package com.infotech.ElectricityBills.service;

import com.infotech.ElectricityBills.controller.LoginRequest;
import com.infotech.ElectricityBills.controller.UpdateUser;
import com.infotech.ElectricityBills.entity.Bills;

import java.util.List;

public interface BillsService {

    public Bills saveBills(Bills bills);

    public String login(LoginRequest loginRequest) throws Exception;

    public Object fetchBillsById(Long userId);

    public List<Bills> fetchByList();

    public String deleteBillsById(Long userId);

    public String updateBills(Long userId, Bills bills);


}
