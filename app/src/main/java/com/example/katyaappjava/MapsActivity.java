package com.example.katyaappjava;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng point1 = new LatLng(55.66604 , 43.58825);
        mMap.addMarker(new MarkerOptions().position(point1).title(getResources().getString(R.string.nobj1)));

        LatLng point2 = new LatLng(55.66604 , 43.58825);
        mMap.addMarker(new MarkerOptions().position(point2).title(getResources().getString(R.string.nobj2)));

        LatLng point3 = new LatLng(55.66604 , 43.58825);
        mMap.addMarker(new MarkerOptions().position(point3).title(getResources().getString(R.string.nobj3)));

        LatLng point4 = new LatLng(55.66604 , 43.58825);
        mMap.addMarker(new MarkerOptions().position(point4).title(getResources().getString(R.string.nobj4)));

        LatLng point5 = new LatLng(55.66604 , 43.58825);
        mMap.addMarker(new MarkerOptions().position(point5).title(getResources().getString(R.string.nobj5)));

        LatLng point6 = new LatLng(55.66604 , 43.58825);
        mMap.addMarker(new MarkerOptions().position(point6).title(getResources().getString(R.string.nobj6)));

        LatLng point7 = new LatLng(55.66604 , 43.58825);
        mMap.addMarker(new MarkerOptions().position(point7).title(getResources().getString(R.string.nobj7)));

        LatLng point8 = new LatLng(55.66604 , 43.58825);
        mMap.addMarker(new MarkerOptions().position(point8).title(getResources().getString(R.string.nobj8)));

        LatLng point9 = new LatLng(55.66604 , 43.58825);
        mMap.addMarker(new MarkerOptions().position(point9).title(getResources().getString(R.string.nobj9)));

        LatLng point10 = new LatLng(55.66604 , 43.58825);
        mMap.addMarker(new MarkerOptions().position(point10).title(getResources().getString(R.string.nobj10)));

        LatLng point11 = new LatLng(55.66604 , 43.58825);
        mMap.addMarker(new MarkerOptions().position(point11).title(getResources().getString(R.string.nobj11)));

        LatLng point12 = new LatLng(55.66604 , 43.58825);
        mMap.addMarker(new MarkerOptions().position(point12).title(getResources().getString(R.string.nobj12)));

        mMap.moveCamera(CameraUpdateFactory.zoomTo( 16.0f ));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(point1));
//        mMap.animateCamera( CameraUpdateFactory.zoomTo( 17.0f ) );
    }
}