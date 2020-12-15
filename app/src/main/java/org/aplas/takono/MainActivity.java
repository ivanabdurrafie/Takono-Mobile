package org.aplas.takono;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView uname;
    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.preferences = this.getSharedPreferences(Constant.SP, 0);
        uname = findViewById(R.id.uname);
        String name = preferences.getString(Constant.USERNAME, "Data Kosong");
        uname.setText(name);
    }
}