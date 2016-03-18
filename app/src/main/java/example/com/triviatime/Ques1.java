package example.com.triviatime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Ques1 extends AppCompatActivity {
    RadioGroup ansGroup1;
    RadioButton ans1;
    Button next1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques1);
        ansGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        next1 = (Button) findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = ansGroup1.getCheckedRadioButtonId();
                if(ansGroup1.getCheckedRadioButtonId()==0) {
                    Toast.makeText(Ques1.this,"Choose an answer",Toast.LENGTH_SHORT).show();
                }
                else {
                    ans1 = (RadioButton) findViewById(selectedId);
                     if(ans1.getText().equals("Germany")) {
                         PlayerDetails.score++;
                     }
                    Intent intent = new Intent(Ques1.this,Ques2.class);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ques1, menu);
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
