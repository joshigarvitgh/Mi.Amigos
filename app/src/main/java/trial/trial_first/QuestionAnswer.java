package trial.trial_first;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.Timer;
import java.util.TimerTask;

public class QuestionAnswer extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_answer);

//        ----------------------------------------------- Customized Fonts ---------------------------------------

        //custom font family
        final TextView ques=(TextView) findViewById(R.id.question);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Segoe UIN SemiBold.ttf");

        ProgressBar pQuesAndAns=(ProgressBar) findViewById(R.id.progressbarqanda);
        pQuesAndAns.setProgress(2);

        getWindow().setFormat(PixelFormat.UNKNOWN);


//        ----------------------------------------------- Initializations ---------------------------------------

        final VideoView vvBrain=(VideoView) findViewById(R.id.videoViewBrain);
        final VideoView vvThreeDots=(VideoView) findViewById(R.id.videoViewThreeDots);

        final LinearLayout ansTray=(LinearLayout) findViewById(R.id.answerTray);

        final Animation aniOutTop= AnimationUtils.loadAnimation(this, R.anim.slide_out_top);
        final Animation aniInRight= AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
        final Animation aniInLeft= AnimationUtils.loadAnimation(this, R.anim.slide_in_left);

        final Button ans1=(Button) findViewById(R.id.answer1);
        final Button ans2=(Button) findViewById(R.id.answer2);

//        ----------------------------------------------- Animation on question text and answer buttons ---------------------------------------

        ques.startAnimation(aniInLeft);

        ans1.startAnimation(aniInRight);
        ans2.startAnimation(aniInRight);

//        ----------------------------------------------- Answering Questions ---------------------------------------

        ans1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ques.startAnimation(aniOutTop);
                ansTray.startAnimation(aniOutTop);

                String uriPath3="android.resource://trial.trial_first/"+R.raw.threedotsvdo;
                Uri uri3= Uri.parse(uriPath3);
                vvThreeDots.setVideoURI(uri3);
                vvThreeDots.requestFocus();
                vvThreeDots.start();
            }
        });

//        ----------------------------------------------- Looping Brain Video ---------------------------------------

        String uriPath="android.resource://trial.trial_first/"+R.raw.brainvdo;
        Uri uri= Uri.parse(uriPath);
        vvBrain.setVideoURI(uri);
        vvBrain.requestFocus();
        vvBrain.start();

        vvBrain.setOnPreparedListener(new OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
    }
}
