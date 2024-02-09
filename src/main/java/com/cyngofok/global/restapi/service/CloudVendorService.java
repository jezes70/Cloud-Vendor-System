package com.cyngofok.global.restapi.service;

import com.cyngofok.global.restapi.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    String createCloudVendor(CloudVendor cloudVendor);
    String updateCloudVendor(CloudVendor cloudVendor);
     String deleteCloudVendor(Long cloudVendorId);
     CloudVendor getCloudVendor(Long cloudVendorId);
    List<CloudVendor> getAllCloudVendors();
}
