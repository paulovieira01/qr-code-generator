package com.projectvieira.qrcode.generator.service;

import com.projectvieira.qrcode.generator.ports.StoragePort;

public class S3StorageAdapter implements StoragePort{
    @Override
    public String uploadFile(byte[] fileData, String fileName, String contentType) {
        return null;
    }
}
