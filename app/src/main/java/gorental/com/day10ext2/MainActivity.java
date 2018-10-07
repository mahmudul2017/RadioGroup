package gorental.com.day10ext2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2;
    RadioGroup radioGroup;
    RadioButton button1, button2, button3;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.show);
        textView2 = findViewById(R.id.gender);
        radioGroup = findViewById(R.id.radioGroup);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        click = findViewById(R.id.btlclick);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.button1){
                    Toast.makeText(getApplicationContext(), "Select : Male", Toast.LENGTH_LONG).show();
                }
                else if (checkedId == R.id.button2){
                    Toast.makeText(getApplicationContext(), "Select : Female", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Select : Others", Toast.LENGTH_LONG).show();
                    }
            }
        });

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int id = radioGroup.getCheckedRadioButtonId();

                if (id == button1.getId()) {
                    textView1.setText("You Selected Male");
                }
               else if (id == button2.getId()) {
                    textView1.setText("You Selected Female");
                }
                else {
                    textView1.setText("You Selected Others");
                }
            }
        });
    }
}
