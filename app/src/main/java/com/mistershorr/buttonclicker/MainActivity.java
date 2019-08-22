package com.mistershorr.buttonclicker;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    private int timesClicked;
    private Button buttonClickerButton;
    private TextView textViewScore;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // generally set up initial values here
        timesClicked = 0;

        // wiring widgets links the xml to the java
        buttonClickerButton = findViewById(R.id.button_main_clicker);
        textViewScore = findViewById(R.id.textview_main_score);
        constraintLayout = findViewById(R.id.constraint_layout_main);
    }

    public void onClickerClicked(View view) {
        Toast.makeText(this, "YOU DID IT!", Toast.LENGTH_LONG).show();
        // increase the timesClicked
        timesClicked++;
        // show the value
        textViewScore.setText("Score: " + timesClicked);

        changeBackgroundColor();
    }

    private void changeBackgroundColor() {
        int r = (int)(Math.random() * 256);
        int g = (int)(Math.random() * 256);
        int b = (int)(Math.random() * 256);
        int color = Color.rgb(r, g, b);
        constraintLayout.setBackgroundColor(color);
        // set the text color to be the opposite color of your background color
        // remember that negative of a color is 255 - color
        int inverseColor = Color.rgb(255-r, 255-g, 255-b);
        textViewScore.setTextColor(inverseColor);
    }
}
