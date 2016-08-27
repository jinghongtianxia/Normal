package com.example.normal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button add;
    private Button minus;
    private Button multiply;
    private Button divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button) findViewById(R.id.add);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        add.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.add:
                System.out.println(Process.addProcess(9, 18));
                break;
            case R.id.minus:
                System.out.println(Process.minusProcess(987, 196));
                break;
            case R.id.multiply:
                System.out.println(Process.multiplyProcess(775, 97));
                break;
            case R.id.divide:
                System.out.println(Process.divideProcess(279, 9));
                break;
            default:
                System.out.println("error");
        }
    }
}
