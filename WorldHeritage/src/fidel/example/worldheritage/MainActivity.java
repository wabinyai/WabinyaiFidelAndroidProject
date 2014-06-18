package fidel.example.worldheritage;

import android.support.v7.app.ActionBarActivity;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends ActionBarActivity {
	
	private GoogleMap mMap;
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
        		.getMap();
        if (mMap != null){
        	
        	
        	// Latitude and longitudes of the world heritage sites
        	mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(29,88), 0));
        	
        	mMap.addMarker(new MarkerOptions().position(
					new LatLng(-37.48, 144.10)).title(
					getString(R.string.Royal_Exhibition_Building_and_Carlton_Gardens)));
        	mMap.addMarker(new MarkerOptions().position(
					new LatLng(34.7667, 32.4167)).title(
					getString(R.string.Paphos )));
        	
        	mMap.addMarker(new MarkerOptions().position(
        			new LatLng(-28.32,-54.1557)).title(
        			getString(R.string.MJesuit_Missions_of_the_Guaranis)));
        	
        	// Head smashed 
        	mMap.addMarker(new MarkerOptions().position(
        			new LatLng(49.4400,-113.37)).title(
        			getString(R.string.Head_Smashed_In_Buffalo_Jump)));
        	//Tsodilo in Botswana
        	
        	mMap.addMarker(new MarkerOptions().position(
        			new LatLng(-18.450,21.4360)).title(
        			getString(R.string.Tsodilo)));
        	
        	//Cidade_Velha in Cape Verde
        	
        	mMap.addMarker(new MarkerOptions().position(
        			new LatLng(14.54543,-23.3618)).title(
        			getString(R.string.Cidade_Velha)));
                	
        }
        

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
