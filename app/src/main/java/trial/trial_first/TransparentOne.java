package trial.trial_first;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.koushikdutta.ion.Ion;

public class TransparentOne extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transparent_one);


        //custom font family
        Typeface custom_fontSB = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN SemiBold.ttf");
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN.ttf");

        TextView deviceIdTitle=(TextView) findViewById(R.id.deviceIdTitle);
        deviceIdTitle.setTypeface(custom_fontSB);

        EditText deviceTextBox=(EditText) findViewById(R.id.deviceIdTextBox);
        deviceTextBox.setTypeface(custom_font);



// ---------------------------------------------------- Click Events on different choices ---------------------------

        TextView deviceIdClose=(TextView) findViewById(R.id.deviceIdClose);
        deviceIdClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        Button nextbtn=(Button) findViewById(R.id.devicIdButton);
        nextbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(TransparentOne.this, TransparentTwo.class);
                startActivity(i);

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
