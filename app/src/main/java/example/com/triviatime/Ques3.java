package example.com.triviatime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Ques3 extends AppCompatActivity {
    RadioGroup ansGroup3;
    RadioButton ans3;
    Button next3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques3);
        ansGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);
        next3 = (Button) findViewById(R.id.next3);
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = ansGroup3.getCheckedRadioButtonId();
                if (ansGroup3.getCheckedRadioButtonId() == 0) {
                    Toast.makeText(Ques3.this, "Choose an answer", Toast.LENGTH_SHORT).show();
                } else {
                    ans3 = (RadioButton) findViewById(selectedId);
                    if (ans3.getText().equals("Chelsea")) {
                        PlayerDetails.score++;
                    }
                    Intent intent = new Intent(Ques3.this, Ques4.class);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ques3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
