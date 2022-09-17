package com.example.zz;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button submit ,discountButton ;
    EditText edit1,edit2,edit3 , discount;
    TextView text1 , text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button)findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1=(EditText) findViewById(R.id.edit1);
                edit2 =(EditText)findViewById(R.id.edit2);
                edit3 =(EditText)findViewById(R.id.edit3);
                int width = Integer.parseInt(edit2.getText().toString());
                int height = Integer.parseInt(edit3.getText().toString());
                String doorType = edit1.getText().toString();
                text1 = (TextView) findViewById(R.id.price);
                text1.setText(String.format("%.2f",Calculator.calculatePrice(width,height,doorType)));



            }
        });
        discountButton = (Button)findViewById(R.id.discountButton);
        discountButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                discount = (EditText) findViewById(R.id.discount);

                    int disc = Integer.parseInt(discount.getText().toString());



                text2 = (TextView) findViewById(R.id.price2);
                double pr = Double.parseDouble(text1.getText().toString());
                text2.setText(String.format("%.2f",pr*(100-disc)/100 ));
            }

        });
    }
}