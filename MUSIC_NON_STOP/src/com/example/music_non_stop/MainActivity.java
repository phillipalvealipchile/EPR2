package com.example.music_non_stop;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
	MediaPlayer mp;
	Button b1;
	int posicion = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1 = (Button) findViewById(R.id.button4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void destruir() {
		if (mp != null)
			mp.release();
	}

	public void iniciar(View v) {
		destruir();
		mp = MediaPlayer.create(this, R.raw.epr2);
		mp.start();
		mp.seekTo(posicion);
	

	
		if(posicion==1){
            mp.pause();
			Intent i = new Intent (this , pregunta_1.class);
			startActivity(i);
		}

			if(posicion==40){
			Intent i = new Intent (this , pregunta_2.class);
			startActivity(i);
			}

			if (posicion==50){
			Intent i = new Intent (this , pregunta_3.class);
			startActivity(i);
			}
			if (posicion==60){
			Intent i = new Intent (this , pregunta_4.class);
			startActivity(i);
			}
			if (posicion==70){
			Intent i = new Intent (this , pregunta_5.class);
			startActivity(i);
			}
			if (posicion==80){
			Intent i = new Intent (this , pregunta_6.class);
			startActivity(i);
			}
			if (posicion==90){
			Intent i = new Intent (this , pregunta_7.class);
			startActivity(i);
			}
			}

	public void pausar(View v) {
		if (mp != null && mp.isPlaying()) {
			posicion = mp.getCurrentPosition();
			mp.pause();
			}
	}
			
		

	public void continuar(View v) {
		if (mp != null && mp.isPlaying() == false) {
			mp.seekTo(posicion);
			mp.start();
		}
	}

	public void detener(View v) {
		if (mp != null) {
			mp.stop();
			posicion = 0;
		}
	}

	
	



}

