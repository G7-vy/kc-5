package com.example.currency;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    TextView v1,v2;
    Button b1;
    Spinner s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(EditText) findViewById(R.id.input1);

        v2=(TextView)findViewById(R.id.ans);
        b1=(Button) findViewById(R.id.button1);
        s1=(Spinner) findViewById(R.id.spinner1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=t1.getText().toString();
                float rup=Float.parseFloat(a);
                int x=s1.getSelectedItemPosition();
                double num1=0;
                if(x==1)
                {
                    num1=rup*74.77;

                    v2.setText(rup+"dollors="+num1+"rupees");
                }
                else if(x==2)
                {
                    num1=rup/74.77;

                    v2.setText(rup+"ruppes="+num1+"dollors");
                }
                else if(x==3)
                {
                    num1=rup/95;

                    v2.setText(rup+"rupees="+num1+"gbp");
                }
                else if(x==4)
                {
                    num1=rup*95;

                    v2.setText(rup+"gbp="+num1+"rupees");
                }
                else
                    Toast.makeText(MainActivity.this,"Select from spinner",Toast.LENGTH_SHORT).show();
            }
        });
    }
}