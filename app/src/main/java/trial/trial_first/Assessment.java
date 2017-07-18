package trial.trial_first;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Assessment extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment);
        getActionBar().setDisplayHomeAsUpEnabled(true);




// ----------------------------------------------------- Custom Font ----------------------------------------

        Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN.ttf");

        TextView week1title=(TextView) findViewById(R.id.weekOneTitle);
        week1title.setTypeface(custom_font1);

        TextView week1attempts=(TextView) findViewById(R.id.weekOneAttempts);
        week1attempts.setTypeface(custom_font1);

        TextView week2title=(TextView) findViewById(R.id.weekTwoTitle);
        week2title.setTypeface(custom_font1);

        TextView week2attempts=(TextView) findViewById(R.id.weekTwoAttempts);
        week2attempts.setTypeface(custom_font1);

        TextView week3title=(TextView) findViewById(R.id.weekThreeTitle);
        week3title.setTypeface(custom_font1);

        TextView week3attempts=(TextView) findViewById(R.id.weekThreeAttempts);
        week3attempts.setTypeface(custom_font1);

        TextView week4title=(TextView) findViewById(R.id.weekFourTitle);
        week4title.setTypeface(custom_font1);

        TextView week4attempts=(TextView) findViewById(R.id.weekFourAttempts);
        week4attempts.setTypeface(custom_font1);

        TextView showmorebtn=(TextView) findViewById(R.id.showMoreBtn);
       showmorebtn.setTypeface(custom_font1);

// -----------------------------------------------------Progress Bar Logic----------------------------------------

        ProgressBar pb1=(ProgressBar) findViewById(R.id.progressbar1);
        pb1.setProgress(45); //45 as an example

        ProgressBar pb2=(ProgressBar) findViewById(R.id.progressbar2);
        pb2.setProgress(0);

        ProgressBar pb3=(ProgressBar) findViewById(R.id.progressbar3);
        pb3.setProgress(0);

        ProgressBar pb4=(ProgressBar) findViewById(R.id.progressbar4);
        pb4.setProgress(0);


// ----------------------------------------------------- Default Colours of Text ----------------------------------------

        week1title.setTextColor(Color.parseColor("#6A0054"));
        week2title.setTextColor(Color.parseColor("#999999"));
        week3title.setTextColor(Color.parseColor("#999999"));
        week4title.setTextColor(Color.parseColor("#999999"));

    }
}
