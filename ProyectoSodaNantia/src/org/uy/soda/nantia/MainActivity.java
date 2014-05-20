package org.uy.soda.nantia;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	//flaco putoooooooooooooo
	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.activity_main);
	    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
	 
	 }
	  
	  public void irAClientes(View v){
			Intent intent = new Intent(this,Mapa.class);
			startActivity(intent);
		}


}
