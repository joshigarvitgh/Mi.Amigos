package trial.trial_first;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.koushikdutta.ion.Ion;

public class TransparentTwo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transparent_two);


        //custom font family
        Typeface custom_fontSB = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN SemiBold.ttf");
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN.ttf");

        TextView loginPasswordTitle=(TextView) findViewById(R.id.loginPasswordTitle);
        loginPasswordTitle.setTypeface(custom_fontSB);

        EditText deviceTextBox=(EditText) findViewById(R.id.loginPasswordTextBox);
        deviceTextBox.setTypeface(custom_font);


//        ------------------------------------- Click Events -----------------------------


        TextView loginPasswordClose=(TextView) findViewById(R.id.loginPasswordClose);
        loginPasswordClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    public void onBackPressed()
    {
        finish();
    }

}
