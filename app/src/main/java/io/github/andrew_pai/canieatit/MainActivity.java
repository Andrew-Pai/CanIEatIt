package io.github.andrew_pai.canieatit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView output;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = findViewById(R.id.mainLayout);
        output = findViewById(R.id.output);
        input = findViewById(R.id.FoodInput);

        Button search = findViewById(R.id.search_button);
        search.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        String food = input.getText().toString();
        output.setText(food);
    }

}
