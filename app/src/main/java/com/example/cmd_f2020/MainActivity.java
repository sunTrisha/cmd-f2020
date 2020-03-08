package com.example.cmd_f2020;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //@Override
    private static final String FILE_NAME = "example.txt";

    EditText mEditText;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //starting my stuff.

        ProgressBar moodProgressBar = (ProgressBar) findViewById(R.id.moodProgressBar);
        ProgressBar sleepProgressBar = (ProgressBar) findViewById(R.id.sleepProgressBar);
        ProgressBar waterProgressBar = (ProgressBar) findViewById(R.id.waterProgressBar);
        TextView notesTextView = (TextView) findViewById(R.id.notesTextView);


        moodProgressBar.setMax(255);

        Drawable progressDrawable = moodProgressBar.getProgressDrawable().mutate();
        progressDrawable.setColorFilter(Color.RED, android.graphics.PorterDuff.Mode.SRC_IN);
        moodProgressBar.setProgressDrawable(progressDrawable);

        sleepProgressBar.setMax(255);
        progressDrawable=sleepProgressBar.getProgressDrawable().mutate();
        progressDrawable.setColorFilter(Color.GREEN, android.graphics.PorterDuff.Mode.SRC_IN);
        sleepProgressBar.setProgressDrawable(progressDrawable);

        waterProgressBar.setMax(255);
        progressDrawable=waterProgressBar.getProgressDrawable().mutate();
        progressDrawable.setColorFilter(Color.BLUE, android.graphics.PorterDuff.Mode.SRC_IN);
        waterProgressBar.setProgressDrawable(progressDrawable);
    }
    /*
    //Saving data in internal memory
    public void save(View V) {
        String text = mEditText.getText().toString();
        FileOutputStream fos = null;

        try {
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(text.getBytes());

            mEditText.getText().clear();
            Toast.makeText(this, "Saved to " + getFilesDir() + "/" + FILE_NAME,
                    Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //Retrieving data from internal memory function... needs to be edited... information related to text box printing
    public void load(View v) {
        FileInputStream fis = null;

        try {
            fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text;

            while ((text = br.readLine()) != null) {
                sb.append(text).append("\n");
            }

            mEditText.setText(sb.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/
}
