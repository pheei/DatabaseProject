package pheei.databaseproject.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.Bind;
import pheei.databaseproject.R;

public class CreateOneActivity extends AppCompatActivity {

    @Bind(R.id.title)
    TextView title;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_one);
    }
}
