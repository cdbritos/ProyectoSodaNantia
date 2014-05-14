package org.uy.soda.nantia;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapLongClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.MapFragment;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Mapa extends Activity {

	static final LatLng FABRICA = new LatLng(-34.455744, -56.387013);
	  
	private GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mapa);
		
		 // seteos de mapa
	    
	    map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
	    Marker fabrica = map.addMarker(new MarkerOptions().position(FABRICA)
	        .title("Fabrica").snippet("Fabrica").
	        icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
	    
	    map.moveCamera(CameraUpdateFactory.newLatLngZoom(FABRICA, 15));
	    
	    map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	    
	    map.setOnMarkerClickListener(new OnMarkerClickListener()
	    {

	        @Override
	        public boolean onMarkerClick(Marker arg0) {
	            arg0.showInfoWindow();
	            return true;
	        }

	    });       
	    
	    
	    map.setOnMapLongClickListener(new OnMapLongClickListener() {
			
			@Override
			public void onMapLongClick(LatLng arg0) {
				map.addMarker(new MarkerOptions().position(arg0)
				        .title(arg0.toString()).
				        icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
				
			}
		});
	    
	    
	    
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mapa, menu);
		return true;
	}
}
