package com.example.korimagigs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class IntroActivity extends AppCompatActivity {

    Intent intent;
    Thread tHilo;
    MediaPlayer mp;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf("Intro App", "Culminada");
        tHilo.interrupt();
        //Toast.makeText(this, );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Hide actionbar

        //Desactivamos la barra de estado para introducir nuestra app de una manera peculiar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro);
        intent = new Intent(this, StartActivity.class);
        tHilo = new Thread() {
            @Override
            public void run() {
                super.run();
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.intro);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

                while (true) {
                    // some code
                    try {

                        Thread.sleep(3000);
                        startActivity(intent);
                        tHilo.interrupt();

                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); // restore the thread's interrupted flag
                        Log.wtf("Hilo", "Terminado");
                        finish();
                        break;

                    }
                }

            }
        };
        tHilo.start();


    }


}
