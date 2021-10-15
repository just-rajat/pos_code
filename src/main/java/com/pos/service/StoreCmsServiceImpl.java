package com.pos.service;

import com.pos.model.StoreCms;
import com.pos.repository.StoreCmsRepository;
import org.springframework.stereotype.Service;

@Service
public class StoreCmsServiceImpl implements StoreCmsService{
    StoreCmsRepository storeCmsRepository;

    @Override
    public StoreCms addStoreCms(StoreCms storeCms) {
        return storeCmsRepository.save(storeCms);
    }
}
