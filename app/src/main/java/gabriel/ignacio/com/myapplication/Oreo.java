package gabriel.ignacio.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Oreo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oreo);
    }
    public void back(View v){
        Intent i = new Intent(this, HomePage.class);
        startActivity(i);
    }
    public void adopt(View v){
        Intent i = new Intent(this, Adopt.class);
        startActivity(i);
    }
    public void prev(View v){
        Intent i = new Intent(this, Other.class);
        startActivity(i);
    }
}
