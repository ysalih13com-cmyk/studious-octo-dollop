package com.salih.bos;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView t = new TextView(this);
        t.setText("Merhaba! Boş uygulama çalışıyor.");
        t.setTextSize(22);
        t.setGravity(Gravity.CENTER);
        setContentView(t);
    }
}
