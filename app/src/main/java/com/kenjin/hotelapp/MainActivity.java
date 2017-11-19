package com.kenjin.hotelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bbook,breview,bmaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bbook=(Button) findViewById(R.id.btnBook);
        breview=(Button) findViewById(R.id.btnReview);
        bmaps=(Button) findViewById(R.id.btnMaps);

        bbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Booking Now",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), BookActivity.class);
                startActivity(intent);
            }
        });
        breview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), PreviewActivity.class);
                startActivity(intent);
            }
        });
        bmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), HistoryActivity.class);
                startActivity(intent);
            }
        });
    }
}
