package com.it.fyp.runforlife;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MyMapFragment extends SupportMapFragment implements LocationListener {

    private GoogleMap googleMap = null;
    private GoogleMapOptions options;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = null;
        rootView = inflater.inflate(R.layout.map, container, false);

        LocationManager locationManager = (LocationManager) getActivity()
                .getSystemService(Context.LOCATION_SERVICE);
        boolean enabledGPS = locationManager
                .isProviderEnabled(LocationManager.GPS_PROVIDER);
        boolean enabledWiFi = locationManager
                .isProviderEnabled(LocationManager.NETWORK_PROVIDER);
//        MarkerOptions markerOpt = null;
//        if (enabledWiFi) {
//            String p = locationManager.NETWORK_PROVIDER;
//            Location location = locationManager.getLastKnownLocation(p);
//            GoogleMapOptions options = new GoogleMapOptions();
//            markerOpt = new MarkerOptions()
//                    .position(new LatLng(location.getLatitude(),location.getLongitude()))
//                    .title("Here");
//        }

        if (googleMap == null) {
            googleMap = ((SupportMapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
            Log.d("map", "wegwegweg");
            if (googleMap != null) {
                Toast.makeText(getActivity(), "google map is not null.", Toast.LENGTH_SHORT).show();
                googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                googleMap.setMyLocationEnabled(true);
                googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
                    @Override
                    public void onMapClick(LatLng latLng) {
                        googleMap.addMarker(new MarkerOptions()
                                .position(latLng)
                                .title("here"));
                    }
                });
            } else {
                Toast.makeText(getActivity(), "google map is null", Toast.LENGTH_SHORT).show();
            }

        }
        return rootView;
    }



    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {


    }

    @Override
    public void onProviderDisabled(String provider) {

    }

    @Override
    public void onLocationChanged(Location location) {
        double lat = location.getLatitude();
        double lng = location.getLongitude();
        LatLng latlng = new LatLng(lat, lng);

        googleMap.addMarker(new MarkerOptions()
                .position(latlng)
                .title("Start")
                .snippet("Inizio del percorso"));

    }
}
