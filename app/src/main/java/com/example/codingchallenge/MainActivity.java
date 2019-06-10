package com.example.codingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_MESSAGE = "com.example.codingchallenge.extra.MESSAGE";


    String message1 = "Though air pollution is the most common type of pollution evident today, it is not the only one." +
            "Besides air pollution,there are a number of human induced activities those pollute or natural resources like water bodies and soil. " +
            "Inadvertent industrialization has led to air as well as water pollution, having adverse affects on environmental health. " +
            "Industries require a good amount of water to operate and so are mainly set up in proximity to a naturally occurring stream, " +
            "river or water body.";
    String message2 = "Also, the industrial waste which includes toxic chemicals like asbestos etc is carried away into our water bodies by using fresh water." +
            "It not only pollutes our natural water resources but also renders them harmful to use and results in decline of species, plants and algae.";
    String message3 = "Another most common factor threatening the health of water resources and soil is – littering. " +
            "Inadequate mechanism of waste disposal and ignorance results in littering at various places. " +
            "The most common type of pollutant through littering is plastic. Thin plastic bags of varied dimensions, when not disposed properly; get into our water bodies and soil." +
            " Being non degradable they stay there for centuries, polluting them and threatening lives. " +
            "Species like turtles and fishes are known to have eaten plastic and died.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,SecondActivity.class);
        int id = v.getId();
        if(id == R.id.button1){
            intent.putExtra(EXTRA_MESSAGE, message1);
        }
        else if(id == R.id.button2){
            intent.putExtra(EXTRA_MESSAGE, message2);
        }
        else
            intent.putExtra(EXTRA_MESSAGE, message3);

        startActivity(intent);
    }
}
