package com.pos.controller;

import com.pos.model.MasterGroup;
import com.pos.repository.MasterGroupRepository;
import com.pos.service.MasterGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class MasterGroupController {

    @Autowired
    MasterGroupService masterGroupService;
    @Autowired MasterGroupRepository masterGroupRepository;

    @PostMapping("/addGroup")
    public MasterGroup addGroup(MasterGroup masterGroup){
        return masterGroupService.addGroup(masterGroup);
    }

    @GetMapping("/getGroup/{id}")
    public MasterGroup getGroup(@PathVariable Integer id){
        return masterGroupRepository.findById(id).get();
    }

    @PutMapping("/updateGrp/{id}")
    public void updateGroup(@PathVariable Integer id,@RequestParam("grp_name") String name, MasterGroup masterGroup){
        MasterGroup group = masterGroupRepository.findById(id).get();
        group.setGroup_name(name);
        group.setModified_on(new Date());
        masterGroupRepository.save(group);
    }

    @GetMapping("/getAllGroup")
    public List<MasterGroup> getList(){
        return (List<MasterGroup>) masterGroupRepository.findAll();
    }

}

