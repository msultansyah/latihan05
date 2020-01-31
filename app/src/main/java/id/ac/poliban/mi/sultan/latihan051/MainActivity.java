package id.ac.poliban.mi.sultan.latihan051;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btPSG = findViewById(R.id.btPSG);
        Button btDortmund = findViewById(R.id.btDortmund);
        Button btMunchen = findViewById(R.id.btMunchen);

        btPSG.setOnClickListener(v -> Toast.makeText(this, "Hi P S G!!!", Toast.LENGTH_SHORT).show());
        btMunchen.setOnClickListener(v -> Toast.makeText(this, "Hi Muncheeen!!!", Toast.LENGTH_SHORT).show());
        btDortmund.setOnClickListener(v -> Toast.makeText(this, "Hi DortMundd!!!", Toast.LENGTH_SHORT).show());
    }
}
