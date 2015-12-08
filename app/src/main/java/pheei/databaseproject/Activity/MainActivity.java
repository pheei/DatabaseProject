package pheei.databaseproject.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import pheei.databaseproject.R;

public class MainActivity extends AppCompatActivity {

    private Button mCreateEventButton;
    private Button mExistingEventButton;
    private Button mCheckTableButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCreateEventButton = (Button)findViewById(R.id.button_create_event);
        mExistingEventButton = (Button)findViewById(R.id.button_existing_event);
        mCheckTableButton = (Button)findViewById(R.id.button_check_table);

        mCreateEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CreateTwoActivity.class);
                startActivity(i);
            }
        });

        mExistingEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ExistingEventActivity.class);
                startActivity(i);
            }
        });

        mCheckTableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CheckTableActivity.class);
                startActivity(i);
            }
        });
    }


}
