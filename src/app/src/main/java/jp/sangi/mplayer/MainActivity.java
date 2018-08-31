package jp.sangi.mplayer;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {
    private MainCtrl m_cMainCtrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_cMainCtrl = new MainCtrl(this);
        RadioGroup cRadioGroup = findViewById(R.id.RadioPeriod);
        cRadioGroup.setOnCheckedChangeListener(m_cMainCtrl);

        Button cButton = findViewById(R.id.StopButton);
        cButton.setOnClickListener(m_cMainCtrl);
    }
}

