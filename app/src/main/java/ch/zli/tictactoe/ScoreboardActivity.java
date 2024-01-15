package ch.zli.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

import android.os.Bundle;

public class ScoreboardActivity extends AppCompatActivity {

    private TextView ScoreX;
    private TextView ScoreO;

    private Button BackToGame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);
        ScoreX = findViewById(R.id.ScoreX);
        ScoreO = findViewById(R.id.ScoreO);
        BackToGame = findViewById(R.id.backToGame);
        Intent intent = getIntent();

        int xCount = intent.getIntExtra("xCount", 0);
        int oCount = intent.getIntExtra("oCount", 0);


        ScoreX.setText("Score X:" + xCount);
        ScoreO.setText("Score O:" + oCount);



        BackToGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}