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

public class Ques4 extends AppCompatActivity {
    RadioGroup ansGroup4;
    RadioButton ans4;
    Button next4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques4);
        ansGroup4 = (RadioGroup) findViewById(R.id.radioGroup4);
        next4 = (Button) findViewById(R.id.next4);
        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = ansGroup4.getCheckedRadioButtonId();
                if (ansGroup4.getCheckedRadioButtonId() == 0) {
                    Toast.makeText(Ques4.this, "Choose an answer", Toast.LENGTH_SHORT).show();
                } else {
                    ans4 = (RadioButton) findViewById(selectedId);
                    if (ans4.getText().equals("Lionel Messi")) {
                        PlayerDetails.score++;
                    }
                    Intent intent = new Intent(Ques4.this, Ques5.class);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ques4, menu);
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
