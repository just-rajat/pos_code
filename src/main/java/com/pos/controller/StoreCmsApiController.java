package com.pos.controller;

import com.pos.model.StoreBanner;
import com.pos.model.StoreCms;
import com.pos.repository.StoreBannerRepository;
import com.pos.repository.StoreCmsRepository;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
public class StoreCmsApiController {

    @Autowired
    StoreCmsRepository storeCmsRepository;
    @Autowired StoreBannerRepository storeBannerRepository;

    @CrossOrigin
    @PostMapping("/addPage")
    public ResponseEntity<Object> addStoreCms(StoreCms storeCms){
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy 'AT' hh:mm a");
        String timestamp = formatter.format(today);
        storeCms.setCreated_on(timestamp);
        storeCms.setIs_active(true);
        storeCmsRepository.save(storeCms);
        HashMap<String,Object> user = new HashMap<String, Object>();
       // user.put("Entered Data",user);
        user.put("message","success");
        user.put("res_code","200");
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
    @PostMapping("/addPages")
    public ResponseEntity<Object> addStoreCmss(StoreCms storeCms){
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy 'AT' hh:mm a");
        String timestamp = formatter.format(today);
        storeCms.setCreated_on(timestamp);
        storeCms.setIs_active(true);
        storeCmsRepository.save(storeCms);
        HashMap<String,Object> user = new HashMap<String, Object>();
        // user.put("Entered Data",user);
        user.put("message","success");
        user.put("res_code","200");
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

   @CrossOrigin
    @PostMapping("/addBanner")
    public ResponseEntity<Object> addBanner(StoreBanner storeBanner, BindingResult result, @RequestParam("banner_image") MultipartFile multipartFile) throws IOException {
        storeBanner.setBanner_image(multipartFile.getBytes());
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy 'AT' hh:mm a");
        String timestamp = formatter.format(today);
        storeBanner.setCreated_on(timestamp);
        storeBannerRepository.save(storeBanner);
        HashMap<String,Object> user = new HashMap<String, Object>();
        user.put("Entered Data",storeBanner);
        user.put("message","success");
        user.put("res_code","200");
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @CrossOrigin(maxAge = 3600)
    @GetMapping("/getData/{id}")
    public StoreCms getCms(@PathVariable Integer id) throws ResourceNotFoundException {
        return storeCmsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Data not found for this id :: " + id));
    }

    @CrossOrigin(maxAge = 3600)
    @GetMapping("/getBannerData/{id}")
    public StoreBanner getBanner(@PathVariable Integer id) throws ResourceNotFoundException {
        return storeBannerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Data not found for this id :: " + id));
    }

    @CrossOrigin(maxAge = 3600)
    @GetMapping("/getAllCms")
    public ResponseEntity<Object> allStoreCms(){
        List<StoreCms> list = (List<StoreCms>) storeCmsRepository.findAll();
        HashMap<String,Object> user = new HashMap<String, Object>();
        user.put("PageList",list);
        user.put("message","success");
        user.put("res_code","200");
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @CrossOrigin(maxAge = 3600)
    @GetMapping("/getAllBanner")
    public ResponseEntity<Object> allStoreBanner(){
        List<StoreBanner> list = (List<StoreBanner>) storeBannerRepository.findAll();
        HashMap<String,Object> user = new HashMap<String, Object>();
        user.put("BannerList",list);
        user.put("message","success");
        user.put("res_code","200");
        return ResponseEntity.status(HttpStatus.OK).body(user);
        //return (List<StoreBanner>) storeBannerRepository.findAll();
    }
    @CrossOrigin(maxAge = 3600)
    @PutMapping("/updatePage/{id}")
    public ResponseEntity<Object> updateStoreCms(@PathVariable Integer id,
                               StoreCms storeCms,BindingResult result) throws ResourceNotFoundException {
        StoreCms cms = storeCmsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Data not found for this id :: " + id));
        cms.setName(storeCms.getName());
        cms.setType(storeCms.getType());
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy 'AT' hh:mm a");
        String timestamp = formatter.format(today);
        cms.setModified_on(timestamp);
        cms.setIs_active(storeCms.getIs_active());
        cms.setContent(storeCms.getContent());
        storeCmsRepository.save(cms);
        //List<StoreBanner> list = (List<StoreBanner>) storeBannerRepository.findAll();
        HashMap<String,Object> user = new HashMap<String, Object>();
        user.put("UpdatedData",cms);
        user.put("message","success");
        user.put("res_code","200");
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @CrossOrigin(maxAge = 3600)
    @PutMapping("/updateBanner/{id}")
    public ResponseEntity<Object> updateBanner(@PathVariable Integer id,
                             StoreBanner storeBanner, BindingResult result,
                             @RequestParam("banner_image") MultipartFile multipartFile) throws ResourceNotFoundException, IOException {
        StoreBanner banner = storeBannerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Data not found for this id :: " + id));
        banner.setClient(storeBanner.getClient());
        banner.setEntity_type(storeBanner.getEntity_type());
        banner.setName(storeBanner.getName());
        banner.setPosition(storeBanner.getPosition());
        banner.setIs_active(storeBanner.getIs_active());
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy 'AT' hh:mm a");
        String timestamp = formatter.format(today);
        banner.setModified_on(timestamp);
        banner.setBanner_image(multipartFile.getBytes());
        storeBannerRepository.save(banner);
        HashMap<String,Object> user = new HashMap<String, Object>();
        user.put("UpdatedData",banner);
        user.put("message","success");
        user.put("res_code","200");
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @CrossOrigin(maxAge = 3600)
    @PutMapping("/updateBannerStatus/{id}")
    public ResponseEntity<Object> updateStat(@PathVariable Integer id,
                                             @RequestParam("status") Boolean stat){
        StoreBanner banner = storeBannerRepository.findById(id).get();
        banner.setIs_active(stat);
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy 'AT' hh:mm a");
        String timestamp = formatter.format(today);
        banner.setModified_on(timestamp);
        storeBannerRepository.save(banner);
        HashMap<String,Object> user = new HashMap<String, Object>();
        user.put("message","success");
        user.put("res_code","200");
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
