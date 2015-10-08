package activity.ctec.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class AboutMeActivity extends AppCompatActivity
{
    private Button AboutMeButton;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);


        AboutMeButton = (Button) findViewById(R.id.AboutMeView);
        nextButton = (Button) findViewById(R.id.swapScreenButton);
        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupListeners()
    {
        AboutMeButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent changeScreen = new Intent(buttonView.getContext(), SportsActivity.class);
                startActivityForResult(changeScreen, 0);
            }
        }
    }
}
