package trial.trial_first;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.content.Intent;

public class SignUp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        TextView tnc=(TextView) findViewById(R.id.tnc);

        tnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent totnc = new Intent(SignUp.this, TNCC.class);
                startActivity(totnc);
            }
        });


        //custom font family
        TextView tsu=(TextView) findViewById(R.id.titleSU);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Enviro D.ttf");
        tsu.setTypeface(custom_font);

        //custom font family
        TextView tsu1=(TextView) findViewById(R.id.lowTitleSU);
        Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN.ttf");
        tsu1.setTypeface(custom_font1);



    }

    public void onBackPressed()
    {
        Intent i=new Intent(SignUp.this, Login.class);
        startActivity(i);

        finish();
    }

}
