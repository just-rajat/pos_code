package com.pos.service;

import com.pos.model.MasterSetting;
import com.pos.repository.MasterSettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasterSettingServiceImpl implements MasterSettingService{

    @Autowired MasterSettingRepository masterSettingRepository;
    @Override
    public MasterSetting addMasterSetting(MasterSetting masterSetting) {
        return masterSettingRepository.save(masterSetting);
    }
}
