package nanodegree.iandouglas.com.iansudacitynanodegree;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast mAppToast;

    public void makeToast(String appName) {
        if(mAppToast != null){
            mAppToast.cancel();
        }

        Context context = getApplicationContext();
        CharSequence text = "This button will launch " + appName;
        int duration = Toast.LENGTH_SHORT;
        mAppToast = Toast.makeText(context, text, duration);
        mAppToast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button_project1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                makeToast(getString(R.string.media_streamer));
            }
        });
        Button button2 = (Button) findViewById(R.id.button_project2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                makeToast(getString(R.string.scores_app));
            }
        });
        Button button3 = (Button) findViewById(R.id.button_project3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                makeToast(getString(R.string.library_app));
            }
        });
        Button button4 = (Button) findViewById(R.id.button_project4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                makeToast(getString(R.string.build_it_bigger));
            }
        });
        Button button5 = (Button) findViewById(R.id.button_project5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                makeToast(getString(R.string.bacon_reader));
            }
        });
        Button button6 = (Button) findViewById(R.id.button_project6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                makeToast(getString(R.string.capstone));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
