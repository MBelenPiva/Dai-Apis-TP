package com.example.tpdaiapis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OMDBActivity extends AppCompatActivity {
    public static final String APIKey = "81a327d5";
    TextView tvSalida;
    Button btnTest01, btnTest2,  btnTest3, btnTest4, btnTest5;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_m_d_b);
        setTitle("ASYNKTASK OMDB");

        ObtenerReferencias();

        SetearListeners();

    }

    private void ObtenerReferencias() {
        tvSalida = (TextView) findViewById(R.id.tvSalida);
        btnTest01 = (Button) findViewById(R.id.btnTest1);
    }

    private void SetearListeners() {
        btnTest01.setOnClickListener(btnTest01_Click);
    }

    View.OnClickListener btnTest01_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AsinkTask();
        }
    };

    private void AsinkTask(){
        TareaAsincronica miTarea = new TareaAsincronica();
    }

    private class TareaAsincronica extends AsynkTask<Void, Void, Void>{
        @Override
        public void onPreExecute(){
            super.onPreExecute();
            LogHelper.d();

        }

    }


}
