package trial.trial_first;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.koushikdutta.ion.Ion;

public class TransparentThree extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transparent_three);


        //custom font family
        TextView suggestionsTitle=(TextView) findViewById(R.id.suggestionsTitle);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN SemiBold.ttf");
        suggestionsTitle.setTypeface(custom_font);


        TextView suggestionsClose=(TextView) findViewById(R.id.suggestionsClose);
        suggestionsClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView suggestionsTextBox=(TextView) findViewById(R.id.suggestionsTextBox);
        suggestionsTextBox.setText("slkdjf alsdjf asldjf asdkf ljfdlfkj  ls l sl sl ls lafskjd lfjals d lssd lf slhfla sdlfkjal sddfl alsdjfljxzlkfj slkddjfjs ldffljlsjdf slls dfjkslkdjf lskdfj  slkdjf alsdjf asldjf asdkf ljfdlfkj  ls l sl sl ls lafskjd lfjals d lssd lf slhfla sdlfkjal sddfl alsdjfljxzlkfj slkddjfjs ldffljlsjdf slls dfjkslkdjf lskdfj  slkdjf alsdjf asldjf asdkf ljfdlfkj  ls l sl sl ls lafskjd lfjals d lssd lf slhfla sdlfkjal sddfl alsdjfljxzlkfj slkddjfjs ldffljlsjdf slls dfjkslkdjf lskdfj  slkdjf alsdjf asldjf asdkf ljfdlfkj  ls l sl sl ls lafskjd lfjals d lssd lf slhfla sdlfkjal sddfl alsdjfljxzlkfj slkddjfjs ldffljlsjdf slls dfjkslkdjf lskdfj  ");

        TextView suggestionsButton=(TextView) findViewById(R.id.suggestionsButton);
        suggestionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
