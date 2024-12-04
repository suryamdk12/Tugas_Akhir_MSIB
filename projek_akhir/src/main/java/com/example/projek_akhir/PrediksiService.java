package com.example.projek_akhir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrediksiService {
    @Autowired
    private PrediksiRepository prediksiRepository;
    @Autowired
    private SejarahSahamRepository sejarahSahamRepository;
    public Prediksi prediksi(PrediksiRequest request) {
        //panggil proses python menggunakan Process Builder atau library
        ProcessBuilder pb = new ProcessBuilder("python", "script_prediksi.py", request.getNamaSaham(), request.getTanggalPrediksi());
        Process procces = pb.start();
    }
}
