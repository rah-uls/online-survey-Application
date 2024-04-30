package com.example.registration_form;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoComplete,auto;
    Spinner spinner,spin,spine;
    CardView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoComplete = findViewById(R.id.autoComplete);
        auto = findViewById(R.id.auto);
        spinner = findViewById(R.id.spinner);
        spin = findViewById(R.id.spin);
        button=findViewById(R.id.button);
        spine = findViewById(R.id.spine);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("INDIA");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrayList);
        autoComplete.setAdapter(arrayAdapter);
        autoComplete.setThreshold(1);
        ArrayList<String> city=new ArrayList<>();
        city.add("BIHAR");
        city.add("REWA");
        city.add("AAGRA");
        city.add("MATHURA");
        city.add("KANPUR");
        city.add("JHARKHAND");
        city.add("PRAYAGRAJ");
        city.add("ODISA");
        city.add("GREATER NOIDA");
        city.add("FATEHPUR");
        ArrayAdapter<String> citty=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,city);
        auto.setAdapter(citty);
        auto.setThreshold(2);
        ArrayList<String> mle=new ArrayList<>();
        mle.add("MALE");
        mle.add("FEMALE");
        ArrayAdapter<String> mlle=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,mle);
        spinner.setAdapter(mlle);
        ArrayList<String> course=new ArrayList<>();
        course.add("B-TECH");
        course.add("B-COM");
        course.add("D-PHARMA");
        course.add("MBA");
        course.add("BSC");
        course.add("B-PHARMA");
        course.add("BBA");
        course.add("LLB");
        ArrayAdapter<String> cour=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,course);
        spin.setAdapter(cour);
        ArrayList<String> grade=new ArrayList<>();
        grade.add("A GRADE");
        grade.add("B GRADE");
        grade.add("C GRADE");
        grade.add("A+ GRADE");
        grade.add("A++ GRADE");
        grade.add("E GRADE");
        ArrayAdapter<String> grde=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,grade);
        spine.setAdapter(grde);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(), thank.class);
                startActivity(intent);
                finish();
            }
        });
    }
}