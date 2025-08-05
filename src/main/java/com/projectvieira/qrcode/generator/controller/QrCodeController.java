package com.projectvieira.qrcode.generator.controller;

import com.projectvieira.qrcode.generator.dto.QrCodeGenerateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/qrcode")
 @RestController
public class QrCodeController {
    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(RequestBody QrCodeGenerateRequest ){

        return null;
    }
}
