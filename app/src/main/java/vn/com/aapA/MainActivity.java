package vn.com.aapA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btn_send = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapComp();
        setOnClickListener();
    }
    private void mapComp(){
        if (btn_send==null)
            btn_send = findViewById(R.id.btn_send);
    }
    private void setOnClickListener(){
        if(btn_send==null)
            mapComp();
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("ok_please");
                intent.setType("text/plain");
                intent.putExtra("text","HELLO");
                startActivity(intent);

            }
        });
    }
}
