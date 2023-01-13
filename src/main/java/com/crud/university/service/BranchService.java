package com.crud.university.service;

import com.crud.university.dao.BranchRepository;
import com.crud.university.dto.BranchDto;
import com.crud.university.model.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchService {

    BranchRepository branchRepository;

    @Autowired
    public BranchService(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    public Branch addBranch(BranchDto branchDto){
        Branch branch = new Branch();
        branch.setId(branchDto.getId());
        branch.setBranchName(branchDto.getBranchName());
        branch.setBranchCode(branchDto.getBranchCode());
        branchRepository.save(branch);
        return branch;
    }
}
