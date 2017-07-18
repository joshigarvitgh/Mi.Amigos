package trial.trial_first;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class Message extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

//        ----------------------------------------------- Customized Fonts ---------------------------------------

        //custom font family
        Typeface custom_fontSB = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN SemiBold.ttf");
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN.ttf");


        TextView messageClose=(TextView) findViewById(R.id.messageClose);
        TextView messageTitle=(TextView) findViewById(R.id.messageTitle);
        TextView messageContent=(TextView) findViewById(R.id.messageContent);

        messageContent.setTypeface(custom_font);
        messageTitle.setTypeface(custom_fontSB);

//        ----------------------------------------------- Click Events ---------------------------------------

        messageClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
