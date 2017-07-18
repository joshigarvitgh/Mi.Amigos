package trial.trial_first;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class TemporaryPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temporary_page);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        TextView btn_gf=(TextView) findViewById(R.id.btn_geofencing);
        btn_gf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TemporaryPage.this, GeoFencing.class);
                startActivity(i);
            }
        });

        TextView btn_ass=(TextView) findViewById(R.id.btn_assessment);
        btn_ass.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(TemporaryPage.this, Assessment.class);
                startActivity(i);
            }
        });

        TextView btn_cong=(TextView) findViewById(R.id.btn_congratulations);
        btn_cong.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(TemporaryPage.this, Congratulations.class);
                startActivity(i);
            }
        });

        TextView btn_transparentOne=(TextView) findViewById(R.id.btn_transparentOne);
        btn_transparentOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TemporaryPage.this, TransparentOne.class);
                startActivity(i);
            }
        });

        TextView btn_transparentTwo=(TextView) findViewById(R.id.btn_transparentTwo);
        btn_transparentTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TemporaryPage.this, TransparentTwo.class);
                startActivity(i);
            }
        });

        TextView btn_transparentThree=(TextView) findViewById(R.id.btn_transparentThree);
        btn_transparentThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TemporaryPage.this, TransparentThree.class);
                startActivity(i);
            }
        });

        TextView btn_settings=(TextView) findViewById(R.id.btn_settings);
        btn_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TemporaryPage.this, Settings.class);
                startActivity(i);
            }
        });

        TextView btn_qanda=(TextView) findViewById(R.id.btn_questionAndAnswer);
        btn_qanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TemporaryPage.this, QuestionAnswer.class);
                startActivity(i);
            }
        });

        TextView btn_fnav=(TextView) findViewById(R.id.btn_fnavigation);
        btn_fnav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TemporaryPage.this, FNavigation.class);
                startActivity(i);
            }
        });

        TextView btn_msg=(TextView) findViewById(R.id.btn_msg);
        btn_msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TemporaryPage.this, Message.class);
                startActivity(i);
            }
        });
    }
}
