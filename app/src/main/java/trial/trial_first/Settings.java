package trial.trial_first;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class Settings extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


// ---------------------------------------------------- Customized Fonts ---------------------------

        //custom font family
        TextView titles=(TextView) findViewById(R.id.settingsTitles);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN SemiBold.ttf");
        titles.setTypeface(custom_font);

        //custom font family
        TextView subTitles=(TextView) findViewById(R.id.settingsSubTitles);
        Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN.ttf");
        subTitles.setTypeface(custom_font1);

// ---------------------------------------------------- Toggle Switch Customization ---------------------------

        final Switch permissionSwitch=(Switch) findViewById(R.id.permissionSwitch);

        LinearLayout settingsPermissions=(LinearLayout) findViewById(R.id.settingsPermissions);
        settingsPermissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                permissionSwitch.toggle();
            }
        });


// ---------------------------------------------------- Click Events on different choices ---------------------------

        LinearLayout settingsRegisterDevices=(LinearLayout) findViewById(R.id.settingsRegisterDevice);
        settingsRegisterDevices.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(Settings.this, TransparentOne.class);
                startActivity(i);
            }
        });

        LinearLayout settingsResetPassword=(LinearLayout) findViewById(R.id.settingsResetPassword);
        settingsResetPassword.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(Settings.this, Reset.class);
                startActivity(i);
            }
        });


// ---------------------------------------------------- Long Press Click Events ---------------------------


        LinearLayout settingsPermissionsRequired=(LinearLayout) findViewById(R.id.settingsPermissions);
        settingsPermissionsRequired.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i=new Intent(Settings.this, PermissionsRequired.class);
                startActivity(i);

                return false;
            }
        });
    }
}
