package gabriel.ignacio.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class cats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cats);
    }
    public void home(View v){
        Intent i = null;
        if(v.getId() == R.id.textView2){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }


    }
}

