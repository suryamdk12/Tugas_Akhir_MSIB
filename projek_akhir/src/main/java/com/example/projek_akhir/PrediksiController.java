package com.example.projek_akhir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prediksi")
public class PrediksiController {

    @Autowired
    private PrediksiService prediksiService;

    @PostMapping
    public Prediksi prediksiSaham(@RequestBody PrediksiRequest request) {
        return prediksiService.prediksi(request);
    }
}
