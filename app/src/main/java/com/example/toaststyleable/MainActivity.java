package com.example.toaststyleable;


import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.muddzdev.styleabletoast.StyleableToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void button(View view)
    {
        StyleableToast.makeText(this, "Hello World!", Toast.LENGTH_LONG, R.style.mytoast).show();
    }
}
