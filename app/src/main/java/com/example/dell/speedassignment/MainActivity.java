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


    String color1 ,color2,color3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =findViewById(R.id.button);
        ConstraintLayout viewssss=findViewById(R.id.myconstarint);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoactivity2(v);
            }
        });


        viewssss.setOnTouchListener(handleTouch);

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
        else if (view.getId() ==R.id.green1)
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
        else if (view.getId() ==R.id.red1)
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

    }
    public void gotoactivity2(View view) {


        Intent intent = new Intent(this, OpenGLES20Activity.class);
        intent.putExtra("col1", color1);
        intent.putExtra("col2", color2);
        intent.putExtra("col3", color3);
        startActivity(intent);
    }
    private View.OnTouchListener handleTouch = new View.OnTouchListener() {

        @Override
        public boolean onTouch(View v, MotionEvent event) {

            int x = (int) event.getX();
            int y = (int) event.getY();

            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    Log.i("TAG", "touched down");
                    break;
                case MotionEvent.ACTION_MOVE:
                    Log.i("TAG", "moving: (" + x + ", " + y + ")");
                    break;
                case MotionEvent.ACTION_UP:
                    Log.i("TAG", "touched up");
                    break;
            }

            return true;
        }
    };

}
