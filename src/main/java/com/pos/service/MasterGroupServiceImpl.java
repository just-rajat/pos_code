package com.pos.service;

import com.pos.model.MasterGroup;
import com.pos.repository.MasterGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MasterGroupServiceImpl implements MasterGroupService{
    @Autowired
    MasterGroupRepository masterGroupRepository;

    @Override
    public MasterGroup addGroup(MasterGroup masterGroup) {
        masterGroup.setCreated_on(new Date());
        return masterGroupRepository.save(masterGroup);
    }
}
