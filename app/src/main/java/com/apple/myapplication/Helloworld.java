package com.apple.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Helloworld extends AppCompatActivity {

    //b1. khai báo các widget được sử dụng
    EditText Chieudai,Chieurong;
    Button Tinh;
    TextView Ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloworld);

        //b2. Kết nối giữa các code và giao diện
        Chieudai = (EditText)findViewById(R.id.etChieudai);
        Chieurong = (EditText)findViewById(R.id.etChieurong);
        Ketqua = (TextView)findViewById(R.id.tvKetqua);
        Tinh = (Button)findViewById(R.id.btnTinh);

        //event

        Tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ichieudai, ichieurong;
                ichieudai = Integer.parseInt(Chieudai.getText().toString());
                ichieurong = Integer.parseInt(Chieurong.getText().toString());
                int chuvi = (ichieudai + ichieurong)*2;
                int dientich = ichieudai * ichieurong;
                Ketqua.setText("Chu vi: " + chuvi + "," + "Diện tích: " + dientich);
            }
        });
    }
}
