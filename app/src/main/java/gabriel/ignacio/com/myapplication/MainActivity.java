package gabriel.ignacio.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View v) {
        Intent i = null;
        if (v.getId() == R.id.textView) {
            i = new Intent(this, dogs.class);
            startActivity(i);
        }
    }


    public void viewcat (View v) {
        Intent i = null;
        if (v.getId() == R.id.textView) {
            i = new Intent(this, cats.class );
            startActivity(i);
        }
    }
}
