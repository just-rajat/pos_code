package com.pos.controller;

import com.pos.model.MasterSetting;
import com.pos.repository.MasterSettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
public class MasterSettingApiController {

    @Autowired
    MasterSettingRepository masterSettingRepository;

    @PostMapping("/addSetting")
    public ResponseEntity<Object> addMasterSetting(MasterSetting masterSetting, BindingResult result, @RequestParam("logo")MultipartFile logo,
                                           @RequestParam("back_image") MultipartFile background) throws IOException {
        masterSetting.setBack_image(background.getBytes());
        masterSetting.setLogo(logo.getBytes());
        HashMap<String,Object> user = new HashMap<String, Object>();
        user.put("message","success");
        user.put("res_code","200");
        return ResponseEntity.status(HttpStatus.OK).body(user);
      //  masterSettingRepository.save()
        //return masterSettingRepository.save(masterSetting);
    }
    @PutMapping("/updateSetting/{id}")
    public ResponseEntity<Object> updateSetting(@PathVariable Integer id,
                              @RequestParam("logo")MultipartFile logo,@RequestParam("back_image") MultipartFile background,MasterSetting master,BindingResult result) throws IOException {
        MasterSetting masterSetting = masterSettingRepository.findById(id).get();
        masterSetting.setUser_location(master.getUser_location());
        masterSetting.setLogo(logo.getBytes());
        masterSetting.setBack_image(background.getBytes());
        masterSetting.setApplicable_order_status_cust(master.getApplicable_order_status_cust());
        masterSetting.setEnable_cancellation(master.getEnable_customer_cancellation());
        masterSetting.setEnable_del_partner_can(master.getEnable_del_partner_can());
        masterSetting.setFacebook_url(master.getFacebook_url());
        masterSetting.setInstagram_url(master.getInstagram_url());
        masterSetting.setTwitter_url(master.getTwitter_url());
        masterSetting.setItem_grouping(master.getItem_grouping());
        masterSetting.setMax_bandwidth_time(master.getMax_bandwidth_time());
        masterSetting.setMax_time(master.getMax_time());
        masterSetting.setModified_on(new Date());
        masterSetting.setShow_out_stock(master.getShow_out_stock());
        masterSetting.setShow_tax_split(master.getShow_tax_split());
        masterSetting.setUser_latitude(master.getUser_latitude());
        masterSetting.setUser_longitude(master.getUser_longitude());
        masterSettingRepository.save(masterSetting);
        HashMap<String, Object> userMap = new HashMap<String, Object>();
        userMap.put("Updated Data",masterSetting);
        userMap.put("msg", "success");
        userMap.put("res_code", 200);
        return ResponseEntity.status(HttpStatus.OK).body(userMap);
    }

    @GetMapping("/getSetting")
    public List<MasterSetting> getSettings(){
        return (List<MasterSetting>) masterSettingRepository.findAll();
    }
}
