package com.example.dell.speedassignment;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {


    String color1 ,color2,color3,color4,color5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button button =findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gotoactivity2(v);
//            }
//        });
}
    public void onRadioButtonClicked1(View view) {


        if (view.getId()  ==R.id.blue1)
        {
            color1="blue";
        }
        else if (view.getId()  ==R.id.blue2)
        {
            color2="blue";
        }
        else if (view.getId()  ==R.id.blue3)
        {
            color3="blue";
        }
        else if (view.getId()  ==R.id.blue4)
        {
            color4="blue";
        }
        else if (view.getId()  ==R.id.blue5)
        {
            color5="blue";
        }
        if (view.getId() ==R.id.green1)
        {
            color1="green";
        }
        else if (view.getId() ==R.id.green2)
        {
            color2="green";
        }
        else if (view.getId() ==R.id.green3)
        {
            color3="green";
        }
        else if (view.getId()  ==R.id.green4)
        {
            color4="green";
        }
        else if (view.getId()  ==R.id.green5)
        {
            color5="green";
        }
        if (view.getId() ==R.id.red1)
        {
            color1="red";
        }
        else if (view.getId() ==R.id.red2)
        {
            color2="red";
        }
        else if (view.getId() ==R.id.red3)
        {
            color3="red";
        }
        else if (view.getId()  ==R.id.red4)
        {
            color4="red";
        }
        else if (view.getId()  ==R.id.red5)
        {
            color5="red";
        }
        if (view.getId() ==R.id.yellow1)
        {
            color1="yellow";
        }
        else if (view.getId() ==R.id.yellow2)
        {
            color2="yellow";
        }
        else if (view.getId() ==R.id.yellow3)
        {
            color3="yellow";
        }
        else if (view.getId()  ==R.id.yellow4)
        {
            color4="yellow";
        }
        else if (view.getId()  ==R.id.yellow5)
        {
            color5="yellow";
        }
        if (view.getId() ==R.id.cyan1)
        {
            color1="cyan";
        }
        else if (view.getId() ==R.id.cyan2)
        {
            color2="cyan";
        }
        else if (view.getId() ==R.id.cyan3)
        {
            color3="cyan";
        }
        else if (view.getId()  ==R.id.cyan4)
        {
            color4="cyan";
        }
        else if (view.getId()  ==R.id.cyan5)
        {
            color5="cyan";
        }


    }
    public void gotoactivity2(View view) {


        Intent intent = new Intent(this, OpenGLES20Activity.class);
        intent.putExtra("col1", color1);
        intent.putExtra("col2", color2);
        intent.putExtra("col3", color3);
        intent.putExtra("col4", color4);
        intent.putExtra("col5", color5);

        startActivity(intent);
    }


}
