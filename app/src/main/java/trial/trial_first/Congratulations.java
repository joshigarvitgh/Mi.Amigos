package trial.trial_first;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import junit.framework.Test;

public class Congratulations extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulations);
        getActionBar().setDisplayHomeAsUpEnabled(true);






// ----------------------------------------------------- Custom Font ----------------------------------------

        TextView congTitle=(TextView) findViewById(R.id.congratulationsTxt);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Enviro D.ttf");
        congTitle.setTypeface(custom_font);

        TextView congMsg=(TextView) findViewById(R.id.congratulationsMsg);
        Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN.ttf");
        congMsg.setTypeface(custom_font1);



    }
}
