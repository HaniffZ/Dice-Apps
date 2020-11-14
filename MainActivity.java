package com.firstapp.rolldicesimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private ImageView imageViewDice2;
    private Button button;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.diceroll);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                rollDice();
                rollDice2();
            }
        });

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice2 = findViewById(R.id.image_view_dice2);
    }

    private void rollDice(){
        int randomNumber = rng.nextInt(6) + 1;

        switch (randomNumber){
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                break;
        }
    }

    private void rollDice2(){
        int randomNumber = rng.nextInt(6) + 1;

        switch (randomNumber){
            case 1:
                imageViewDice2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice2.setImageResource(R.drawable.dice6);
                break;
        }
    }
}