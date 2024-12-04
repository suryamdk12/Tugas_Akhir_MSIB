package com.example.projek_akhir;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InvestasiUI extends JFrame {
    private JTextField txtSaham, txtTanggal;
    private JComboBox<String> cmbPrediksi;
    private JButton btnPrediksi;
    private JLabel lblHasil;
    public InvestasiUI(){
        //inisialisasi komponen UI

        btnPrediksi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String saham = txtSaham.getText();
                String tanggal = txtTanggal.getText();
                String jenisPrediksi = cmbPrediksi.getSelectedItem().toString();

                //panggil API Spring Boot untuk melakukan prediksi
                //...
            }
        });
    };

    //metode untuk membuat frame, mengatur layout, dll

}
