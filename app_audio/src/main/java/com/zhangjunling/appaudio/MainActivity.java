package com.zhangjunling.appaudio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mAudioRecordRecorderView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_audio);
        mAudioRecordRecorderView = this.findViewById(R.id.bt_audiorecord_recorder);

        mAudioRecordRecorderView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_audiorecord_recorder:
                Intent audioRecordRecorderIntent = new Intent(MainActivity.this, AudioRecorderActivity.class);
                startActivity(audioRecordRecorderIntent);
                break;
        }
    }
}