package sg.edu.rp.c346.id22012027.demosimplesavel9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences prefs= getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor preEdit= prefs.edit();
        preEdit.putString("greetings", "hello!");
        preEdit.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences prefs= getPreferences(MODE_PRIVATE);
        String msg= prefs.getString("greetings", "no greetings name");
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG);
    }
}