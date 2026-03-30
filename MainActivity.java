package com.example.soccerapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.soccerapp.data.DataProvider;
import com.example.soccerapp.model.Team;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResult = findViewById(R.id.textResult);

        List<Team> teams = DataProvider.getTeams();

        StringBuilder sb = new StringBuilder();
        for (Team t : teams) {
            sb.append(t.getName())
                    .append(" - ")
                    .append(t.getCountry())
                    .append("\n");
        }

        textResult.setText(sb.toString());
    }
}