package com.example.myyy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;

    EditText salary,work;
    TextView result;
    String resultS;
    Double salaryD,workD,resultD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        salary = findViewById(R.id.editTextNumber);
        work = findViewById(R.id.editTextNumber2);
        result = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (salary.getText().toString().isEmpty() || work.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "You have to enter salary and year", Toast.LENGTH_SHORT).show();
                    return;
                }

                Double salaryD = Double.parseDouble(salary.getText().toString());
                Double workD = Double.parseDouble(work.getText().toString());

                if(workD<5){
                    resultD = salaryD+((salaryD*1)/100);
                    result.setText("Result: "+resultD);
                }else{
                    resultD = salaryD+((salaryD*2)/100);
                    result.setText("Result: "+resultD);
                }
            }
        });

    }

}
