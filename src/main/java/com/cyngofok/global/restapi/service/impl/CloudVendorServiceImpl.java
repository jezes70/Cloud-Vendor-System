package com.cyngofok.global.restapi.service.impl;

import com.cyngofok.global.restapi.model.CloudVendor;
import com.cyngofok.global.restapi.repository.CloudVendorRepository;
import com.cyngofok.global.restapi.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        System.out.println(cloudVendor);
       CloudVendor cloudVendor1=new CloudVendor(

               cloudVendor.getVendorName(),
               cloudVendor.getVendorAddress(),
               cloudVendor.getVendorPhoneNumber()
       );
        cloudVendorRepository.save(cloudVendor1);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(Long cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(Long cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).orElse(null);
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }


}
