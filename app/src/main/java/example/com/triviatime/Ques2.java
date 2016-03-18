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

public class Ques2 extends AppCompatActivity {

    private RadioGroup ansGroup2;
    private Button next2;
    private RadioButton ans2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques2);
        ansGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        next2 = (Button) findViewById(R.id.next2);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = ansGroup2.getCheckedRadioButtonId();
                if (ansGroup2.getCheckedRadioButtonId() == 0) {
                    Toast.makeText(Ques2.this, "Choose an answer", Toast.LENGTH_SHORT).show();
                } else {
                    ans2 = (RadioButton) findViewById(selectedId);
                    if (ans2.getText().equals("Barcelona")) {
                        PlayerDetails.score++;
                    }
                    Intent intent = new Intent(Ques2.this, Ques3.class);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ques2, menu);
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
