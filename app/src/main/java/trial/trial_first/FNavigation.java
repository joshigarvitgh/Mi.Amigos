package trial.trial_first;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class FNavigation extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fnavigation);

//        --------------------------------------------- Customizing Font -------------------------------

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN SemiBold.ttf");

        TextView heyUserText=(TextView) findViewById(R.id.heyUserText);
        heyUserText.setTypeface(custom_font);

        Typeface custom_fontNSB = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN.ttf");

        TextView emailUserText=(TextView) findViewById(R.id.emailUserText);
        emailUserText.setTypeface(custom_fontNSB);

//        --------------------------------------------

        TextView fisrtOption=(TextView) findViewById(R.id.navFirstOption);
        fisrtOption.setTypeface(custom_font);

        TextView secondOption=(TextView) findViewById(R.id.navSecondOption);
        secondOption.setTypeface(custom_font);

        TextView thirdOption=(TextView) findViewById(R.id.navThirdOption);
        thirdOption.setTypeface(custom_font);

        TextView fourthOption=(TextView) findViewById(R.id.navFourthOption);
        fourthOption.setTypeface(custom_font);

        TextView fifthOption=(TextView) findViewById(R.id.navFifthOption);
        fifthOption.setTypeface(custom_font);

        TextView sixthOption=(TextView) findViewById(R.id.navSixthOption);
        sixthOption.setTypeface(custom_font);

        TextView seventhOption=(TextView) findViewById(R.id.navSeventhOption);
        seventhOption.setTypeface(custom_font);

        TextView eightOption=(TextView) findViewById(R.id.navEightOption);
        eightOption.setTypeface(custom_font);


//        --------------------------------------------- Click Events Nav Options -------------------------------

        fisrtOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FNavigation.this, testing.class);
                startActivity(i);

                finish();
            }
        });
        secondOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FNavigation.this, GeoFencing.class);
                startActivity(i);

                finish();
            }
        });
        thirdOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FNavigation.this, QuestionAnswer.class);
                startActivity(i);

                finish();
            }
        });
        fourthOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FNavigation.this, Settings.class);
                startActivity(i);

                finish();
            }
        });
        fifthOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FNavigation.this, bot.class);
                startActivity(i);

                finish();
            }
        });
        sixthOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FNavigation.this, Assessment.class);
                startActivity(i);

                finish();
            }
        });
        seventhOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FNavigation.this, music.class);
                startActivity(i);

                finish();
            }
        });
        eightOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FNavigation.this, bot.class);
                startActivity(i);

                finish();
            }
        });

    }
}