package com.example.cmd_f2020;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;

public class InsertActivity extends AppCompatActivity {

    Button button;

    SeekBar seekBar_red, seekBar_green, seekBar_blue;

    int red, green, blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        red=255;
        green=255;
        blue=255;
        button = (Button) findViewById(R.id.button);
        seekBar_red = (SeekBar) findViewById(R.id.seekBar_red);
        seekBar_green = (SeekBar) findViewById(R.id.seekBar_green);
        seekBar_blue = (SeekBar) findViewById(R.id.seekBar_blue);

        seekBar_red.setMax(red);
        seekBar_red.setProgress(red);

        seekBar_green.setMax(green);
        seekBar_green.setProgress(green);

        seekBar_blue.setMax(blue);
        seekBar_blue.setProgress(blue);

        button.setBackgroundColor(Color.argb(255, red, green, blue));

        seekBar_red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                red = progress;
                button.setBackgroundColor(Color.argb(255, red, green, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });
        seekBar_green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                green = progress;
                button.setBackgroundColor(Color.argb(255, red, green, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar_blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                blue = progress;
                button.setBackgroundColor(Color.argb(255, red, green, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
