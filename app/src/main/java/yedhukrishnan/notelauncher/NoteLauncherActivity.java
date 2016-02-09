package yedhukrishnan.notelauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class NoteLauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_launcher);
    }

    public void showApps(View v) {
        Intent i = new Intent(this, AppsListActivity.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        // Do Here what ever you want do on back press;
    }
}
