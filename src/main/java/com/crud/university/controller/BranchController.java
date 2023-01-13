package com.crud.university.controller;

import com.crud.university.dto.BranchDto;
import com.crud.university.model.Branch;
import com.crud.university.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BranchController {

    BranchService branchService;

    @Autowired
    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }

    @PostMapping("/addBranch")
    public Branch addBranch(@RequestBody BranchDto branchDto){
        return branchService.addBranch(branchDto);
    }
}
