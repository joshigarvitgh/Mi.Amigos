package trial.trial_first;

import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class GeoFencing extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_fencing);

        Button btn=(Button) findViewById(R.id.setRadiusBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(GeoFencing.this, FindPerson.class);
                startActivity(i);
            }
        });


//        --------------------------------------- Customizing Fonts --------------------------------

        //custom font family
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN.ttf");

        EditText enteredRadius=(EditText) findViewById(R.id.radiusEditText);
        enteredRadius.setTypeface(custom_font);

    }
}
