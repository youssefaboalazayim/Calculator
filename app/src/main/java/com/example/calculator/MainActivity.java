package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView image;
    TextView result ;
    EditText number1;
    EditText number2;
    Button sum;
    Button sub;
    Button multi;
    Button div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imageView);
        result = findViewById(R.id.myresult);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        sum = findViewById(R.id.mysum);
        sub = findViewById(R.id.mysub);
        multi = findViewById(R.id.mymulti);
        div = findViewById(R.id.mydiv);

        sum.setOnClickListener(this);
        sub.setOnClickListener(this);
        multi.setOnClickListener(this);
        div.setOnClickListener(this);
    }


    private Double sumValues(Double num1, Double num2){
        Double sum = num1 + num2;
        return sum;
    }

    private Double multiplyValues(Double num1, Double num2){
        Double multiply = num1 * num2;
        return multiply;
    }

    private Double subtractionValues(Double num1, Double num2){
        Double subtraction = num1 - num2;
        return subtraction;

//        if (num1> num2){
//            Double subtraction = num1 - num2;
//        }
//
//        else if (num2 < num1){
//            Double subtraction = num2 - num1;
//
//        }

    }

    public void clickSum(){

        if(!TextUtils.isEmpty(number1.getText().toString()) && !TextUtils.isEmpty(number2.getText().toString())){
            String value1 = number1.getText().toString();
            String value2 = number2.getText().toString();
            double myNumber1 = Double.parseDouble(value1);
            double myNumber2 = Double.parseDouble(value2);
            //result.setText(" " + (myNumber1 + myNumber2));

            String finalResult = String.valueOf(sumValues(myNumber1, myNumber2));
            result.setText(finalResult);
        }
        else {
            Toast.makeText(MainActivity.this, "Please enter numbers", Toast.LENGTH_SHORT).show();
//            result.setText("Please enter a numbers");
        }
    }






//
//            buttonSum.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {

//            String value1 = number1.getText().toString();
//            String value2 = number2.getText().toString();

//            if(value1.isEmpty() || value2.isEmpty()){
//                Toast.makeText(MainActivity.this, "Please enter numbers", Toast.LENGTH_SHORT).show();
//            }
//            else {
//                double myNmber1 = Double.parseDouble(value1);
//                double myNumber2 = Double.parseDouble(value2);

//                sumValuws(myNmber1, myNumber2);

//
//            }
























    public void clickMinus(){

        if(!TextUtils.isEmpty(number1.getText().toString()) && !TextUtils.isEmpty(number2.getText().toString())){
            double myNumber1 = Double.parseDouble(number1.getText().toString());
            double myNumber2 = Double.parseDouble(number2.getText().toString());
            result.setText(  " "+  (myNumber1 - myNumber2) );
        }
        else {
            result.setText("Please enter a numbers");
        }
    }

    public void clickMultiply(){

        if(!TextUtils.isEmpty(number1.getText().toString()) &&
                !TextUtils.isEmpty(number2.getText().toString())){
            double myNumber1 = Double.parseDouble(number1.getText().toString());
            double myNumber2 = Double.parseDouble(number2.getText().toString());
            result.setText(  " "+  (myNumber1 * myNumber2) );
        }

        else{
            result.setText("Please enter a numbers");
        }
    }

    public void clickDiving(){

        if(!TextUtils.isEmpty(number1.getText().toString()) && !TextUtils.isEmpty(number2.getText().toString())){
            double myNumber1 = Double.parseDouble(number1.getText().toString());
            double myNumber2 = Double.parseDouble(number2.getText().toString());
            result.setText(  " "+  (myNumber1 / myNumber2) );
        }
        else {
            result.setText("Please enter a numbers");
        }
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.mysum){
            clickSum();
        }

        else if (view.getId() == R.id.mysub){
            clickMinus();
        }

        else if (view.getId() == R.id.mymulti){
            clickMultiply();
        }

        else if (view.getId() == R.id.mydiv){
            clickDiving();
        }
    }
}



