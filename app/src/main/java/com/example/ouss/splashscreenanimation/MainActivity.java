package com.example.ouss.splashscreenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Animation animation=AnimationUtils.loadAnimation(this,R.anim.logoanimation);
        final Animation anim=AnimationUtils.loadAnimation(this,R.anim.buttonanimation);
        anim.setDuration(2000);

        final Button btn=findViewById(R.id.button);
        animation.setDuration(1000);
        animation.setFillAfter(true);
        final ImageView view =findViewById(R.id.imageView);
         animation.setStartOffset(2000);
         anim.setStartOffset(500);
        btn.setAnimation(anim);

        view.setAnimation(animation);

        /* btn.post(new Runnable() {
             @Override
             public void run() {
                 try{
                // btn.wait(800);
                 btn.startAnimation(anim);
             }catch (Exception e){e.printStackTrace();}}
         });
       view.post(new Runnable() {
           @Override
           public void run() {
               try{
                   //wait(800);
                   view.startAnimation(animation);
               }catch (Exception e){e.printStackTrace();}
           }
       });*/




    }
}
