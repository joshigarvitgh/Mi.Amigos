package trial.trial_first;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;


public class TNCC extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tncc);



        //custom font family
        TextView tid=(TextView) findViewById(R.id.titleTNCC);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Enviro D.ttf");
        tid.setTypeface(custom_font);

        //custom font family
        TextView tid1=(TextView) findViewById(R.id.lowTitleTNCC);
        Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN.ttf");
        tid1.setTypeface(custom_font1);


        TextView tnctext=(TextView) findViewById(R.id.tnctext);
        tnctext.setText("The terms and conditions of the application shall be seen here.. ..edit it. ;) The terms and conditions of the application shall be seen here.. ..edit it. ;) The terms and conditions of the application shall be seen here.. ..edit it. ;) The terms and conditions of the application shall be seen here.. ..edit it. ;) The terms and conditions of the application shall be seen here.. ..edit it. ;) The terms and conditions of the application shall be seen here.. ..edit it. ;) The terms and conditions of the application shall be seen here.. ..edit it. ;) The terms and conditions of the application shall be seen here.. ..edit it. ;) The terms and conditions of the application shall be seen here.. ..edit it. ;) The terms and conditions of the application shall be seen here.. ..edit it. ;) The terms and conditions of the application shall be seen here.. ..edit it. ;) The terms and conditions of the application shall be seen here.. ..edit it. ;) The terms and conditions of the application shall be seen here.. ..edit it. ;) The terms and conditions of the application shall be seen here.. ..edit it. ;) The terms and conditions of the application shall be seen here.. ..edit it. ;) ");

    }

    @Override
    public void onBackPressed()
    {
        Intent bck=new Intent(TNCC.this, SignUp.class);
        startActivity(bck);

        finish();
    }
}
