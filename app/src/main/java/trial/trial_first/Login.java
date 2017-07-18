package trial.trial_first;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //custom font family
        TextView tid=(TextView) findViewById(R.id.titleLogin);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Enviro D.ttf");
        tid.setTypeface(custom_font);

        //custom font family
        TextView tid1=(TextView) findViewById(R.id.lowTitleLogin);
        Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN.ttf");
        tid1.setTypeface(custom_font1);

        final EditText enteredUID=(EditText) findViewById(R.id.enteredUID);
        enteredUID.setTypeface(custom_font1);

        final EditText enteredPassword=(EditText) findViewById(R.id.enteredPassword);
        enteredPassword.setTypeface(custom_font1);

//        ------------------------------------ Click Events ----------------------------


        TextView resetbutton=(TextView) findViewById(R.id.resetbtn);
        TextView signupbutton=(TextView) findViewById(R.id.signupbtn);
        Button loginbutton=(Button) findViewById(R.id.loginButton);

        resetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toreset = new Intent(Login.this, Reset.class);
                startActivity(toreset);
            }
        });

        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tosignup = new Intent(Login.this, SignUp.class);
                startActivity(tosignup);
            }
        });

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent tosignup = new Intent(Login.this, TemporaryPage.class);
                startActivity(tosignup);
            }
        });
    }

    public int count=0;
    @Override
    public void onBackPressed()
    {
        count++;
        if(count==1)
        {
            Toast.makeText(Login.this, "Press BACK once more to Exit", Toast.LENGTH_SHORT).show();
        }
        else if(count==2)
        {
            count=0;
            finish();
        }
    }

}
