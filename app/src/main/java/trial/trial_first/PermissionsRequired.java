package trial.trial_first;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.koushikdutta.ion.Ion;

public class PermissionsRequired extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permissions_required);


        //custom font family
        TextView permissionsRequiredTitle=(TextView) findViewById(R.id.permissionsRequiredTitle);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN SemiBold.ttf");
        permissionsRequiredTitle.setTypeface(custom_font);


        TextView permissionsRequiredClose=(TextView) findViewById(R.id.permissionsRequiredClose);
        permissionsRequiredClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button permissionsRequiredOK=(Button) findViewById(R.id.permissionsRequiredButton);
        permissionsRequiredOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        TextView permissionsRequiredTextBox=(TextView) findViewById(R.id.permissionsRequiredTextBox);
        permissionsRequiredTextBox.setText("1. slkdjf alsdjf asldjf asdkf ljfdlfkj" +
                "\n\n2. ls l sl sl ls lafskjd lfjals d lssd " +
                "\n\n3. lf slhfla sdlfkjal sddfl alsdjfljxzlkfj" +
                "\n\n4. slkddjfjs ldffljlsjdf slls dfjkslkdjf" +
                "\n\n5. so on.. ..");

    }

    @Override
    public void onBackPressed()
    {
        finish();
    }

}
