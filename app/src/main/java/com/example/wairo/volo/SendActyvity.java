package com.example.wairo.volo;
//�ŏI�m�F���
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class SendActyvity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_actyvity);
        // �E�B�W�F�b�g�ƌ��ѕt���镶
        Button btnNext=(Button) findViewById(R.id.sendButton);
        btnNext.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "send completely", Toast.LENGTH_LONG).show();
                // �X����΂��C���e���g�̐���
                Intent intent=new Intent(SendActyvity.this,MainActivity.class);//���M��iVoloListView01�j
                // ���s
                startActivity(intent);
            }
        });
    }
}
