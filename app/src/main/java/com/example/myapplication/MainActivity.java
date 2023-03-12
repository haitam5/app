package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner sp1,sp2;
    EditText ed1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.txtmount);
        sp1=findViewById(R.id.spfrom);
        sp2=findViewById(R.id.spto);
        b1=findViewById(R.id.btn);



        String[] from = {"MAD"};
        ArrayAdapter ad = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to = {"USD","EUR","Yen","Rouble russe","Riyal qatarien","Riyal saoudien","Peso mexicain","Couronne suédoise","Roupie indonésienne","Dirham des Émirats arabes unis","Dinar tunisien"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);


       b1.setOnClickListener( new View.OnClickListener() {
        @Override
           public void onClick(View v){

                Double taux;
                Double amount = Double.parseDouble(ed1.getText().toString());
                    if(sp1.getSelectedItem().toString() == "MAD" && sp2.getSelectedItem().toString() == "USD")
                    {
                        taux=amount*10.34;
                        Toast.makeText(getApplicationContext(),taux.toString(),Toast.LENGTH_LONG).show();
                    }
            else if(sp1.getSelectedItem().toString() == "MAD" && sp2.getSelectedItem().toString() == "EUR")
            {
                taux=amount*11.02 ;
                Toast.makeText(getApplicationContext(),taux.toString(),Toast.LENGTH_LONG).show();
            }
            else if(sp1.getSelectedItem().toString() == "MAD" && sp2.getSelectedItem().toString() == "Yen")
            {
                taux=amount*13.07 ;
                Toast.makeText(getApplicationContext(),taux.toString(),Toast.LENGTH_LONG).show();
            }
            else if(sp1.getSelectedItem().toString() == "MAD" && sp2.getSelectedItem().toString() == "Rouble russe")
            {
                taux=amount*7.38 ;
                Toast.makeText(getApplicationContext(),taux.toString(),Toast.LENGTH_LONG).show();
            }
            else if(sp1.getSelectedItem().toString() == "MAD" && sp2.getSelectedItem().toString() == "Riyal qatarien")
            {
                taux=amount*0.35 ;
                Toast.makeText(getApplicationContext(),taux.toString(),Toast.LENGTH_LONG).show();
            }
            else if(sp1.getSelectedItem().toString() == "MAD" && sp2.getSelectedItem().toString() == "Peso mexicain")
            {
                taux=amount*1.79;
                Toast.makeText(getApplicationContext(),taux.toString(),Toast.LENGTH_LONG).show();
            }
            else if(sp1.getSelectedItem().toString() == "MAD" && sp2.getSelectedItem().toString() == "Couronne suédoise")
            {
                taux=amount*1.04;
                Toast.makeText(getApplicationContext(),taux.toString(),Toast.LENGTH_LONG).show();
            }
            else if(sp1.getSelectedItem().toString() == "MAD" && sp2.getSelectedItem().toString() == "Roupie indonésienne")
                    {
                        taux=amount*1501.15;
                        Toast.makeText(getApplicationContext(),taux.toString(),Toast.LENGTH_LONG).show();
                    }
            else if(sp1.getSelectedItem().toString() == "MAD" && sp2.getSelectedItem().toString() == "Dirham des Émirats arabes unis")
                    {
                        taux=amount*0.24;
                        Toast.makeText(getApplicationContext(),taux.toString(),Toast.LENGTH_LONG).show();
                    }

                    else if(sp1.getSelectedItem().toString() == "MAD" && sp2.getSelectedItem().toString() == "Dinar tunisien")
                    {
                        taux=amount*0.20;
                        Toast.makeText(getApplicationContext(),taux.toString(),Toast.LENGTH_LONG).show();
                    }

        }
        });

    }
}