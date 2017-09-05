package com.young.dynamictoggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DynamicToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = (DynamicToggleButton) findViewById(R.id.dytoggle_button);
        toggleButton.setChecked(true);
        toggleButton.setOnStateChangedListener(new DynamicToggleButton.OnStateChangedListener() {
            @Override
            public void onStateChanged(boolean isOn) {
                if ( isOn )
                    Toast.makeText(MainActivity.this, "开着", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "关着", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
