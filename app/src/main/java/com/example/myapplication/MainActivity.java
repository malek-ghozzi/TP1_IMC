package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private Button btn;
    private EditText tailletxt,poidstxt;

TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tailletxt=(EditText)findViewById(R.id.edittextpoidsid);
        poidstxt=(EditText)findViewById(R.id.edittexttailleid);
        btn =(Button)findViewById(R.id.calculbtn) ;
        result=(TextView)findViewById(R.id.res) ;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res="";
                float tailleval = Float.parseFloat(tailletxt.getText().toString());
                float poidsval = Float.parseFloat(poidstxt.getText().toString());

                float imc = poidsval / (tailleval * tailleval);
                if (imc < 18.5){
                    res="La personne est considérée comme mince!"; }
                else  if (imc<25){
                    res="La personne est normale";}
                else  res="La personne est en surpoids";

                
                result.setText(res);


            }
        });

    }
}