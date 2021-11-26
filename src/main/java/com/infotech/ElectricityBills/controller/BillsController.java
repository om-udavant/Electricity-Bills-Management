package com.infotech.ElectricityBills.controller;

import com.infotech.ElectricityBills.entity.Bills;
import com.infotech.ElectricityBills.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bills")
public class BillsController {

    @Autowired
    private BillsService billsService;

    @GetMapping("/health")
    public String healthCheck() {

        return "I am alive ✔.";
    }


    @PostMapping("/add")
    public Bills saveBills(@RequestBody Bills bills) {

        return billsService.saveBills(bills);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) throws Exception {
        System.out.println(loginRequest);

        return billsService.login(loginRequest);

    }

    @GetMapping("/user/{id}")
    public Optional<Bills> fetchBillsById(@PathVariable("id") Long userId){

        return (Optional<Bills>) billsService.fetchBillsById(userId);

    }

    @GetMapping("/user")
    public List<Bills> fetchByList(){
        return billsService.fetchByList();
    }

   @DeleteMapping("/user/{id}")
    public String deleteBillsById(@PathVariable("id") Long userId){
       String s = "User Deleted Successfully";
       return billsService.deleteBillsById(userId) ;
    }

    @PutMapping("/user/{id}")
    public String updateBills(@PathVariable("id") Long userId, @RequestBody Bills bills){
        return billsService.updateBills(userId,bills);
    }



}
