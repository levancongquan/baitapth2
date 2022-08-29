package com.example.baituan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button button1;
    EditText editchieucao, editcannang;
    TextView txtketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.btntinh);
        button1.setOnClickListener(new view.OnClickListener(this);

        }

    public void onClick(View view){
        try {
            double cc = Double.parseDouble(editchieucao.getText().toString());
            double cn = Double.parseDouble(editcannang.getText().toString());

            double BMI = cn / Math.pow(cc, 2) * 10000;
                    if (BMI < 18)
                        txtketqua.setText("Bạn hơi gầy");
                    else if (18 <= BMI && BMI < 25)
                        txtketqua.setText("Bạn bình thường");
                    else if (25 <= BMI && BMI < 30)
                        txtketqua.setText("Bạn béo phì độ 1");
                    else if (30 <= BMI && BMI < 35)
                        txtketqua.setText("Bạn béo phì độ 2");
                    else if (35 <= BMI)
                        txtketqua.setText("Bạn béo phì độ 3");

        }
        catch (Exception e) {
            Toast.makeText(getBaseContext(), "bạn chưa nhập ", Toast.LENGTH_SHORT).show();
        }
    }
}