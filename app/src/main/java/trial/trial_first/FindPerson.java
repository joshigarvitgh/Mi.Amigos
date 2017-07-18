package trial.trial_first;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

public class FindPerson extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_person);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
