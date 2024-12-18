package com.geeks.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);

        EditText playerOne = findViewById(R.id.playerOne);
        EditText playerTwo = findViewById(R.id.playerTwo);
        Button btnStartGame = findViewById(R.id.btn_startGame);

        btnStartGame.setOnClickListener(v -> {
            String getPlayerOneName = playerOne.getText().toString();
            String getPlayerTwoName = playerTwo.getText().toString();

            if (getPlayerOneName.isEmpty()|| getPlayerTwoName.isEmpty()){
                Toast.makeText(AddPlayer.this,"please enter player name", Toast.LENGTH_SHORT).show();
            }else {
                Intent intent = new Intent(AddPlayer.this, MainActivity.class);
                intent.putExtra("playerOne",getPlayerOneName);
                intent.putExtra("playerTwo", getPlayerTwoName);
                startActivity(intent);
            }

        });
    }
}