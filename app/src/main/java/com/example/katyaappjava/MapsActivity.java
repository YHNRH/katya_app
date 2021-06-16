package com.example.katyaappjava;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private int obj = 1;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        obj = getIntent().getIntExtra("point", 1);
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
        LatLng point1 = new LatLng(55.66558 ,43.59014);
        mMap.addMarker(new MarkerOptions().position(point1).title(getResources().getString(R.string.nobj1)));

        LatLng point2 = new LatLng(55.66604 ,43.58825);
        mMap.addMarker(new MarkerOptions().position(point2).title(getResources().getString(R.string.nobj2)));

        LatLng point3 = new LatLng(55.66831 ,43.58379);
        mMap.addMarker(new MarkerOptions().position(point3).title(getResources().getString(R.string.nobj3)));

        LatLng point4 = new LatLng(55.67097 ,43.57933);
        mMap.addMarker(new MarkerOptions().position(point4).title(getResources().getString(R.string.nobj4)));

        LatLng point5 = new LatLng(55.67419 ,43.57744);
        mMap.addMarker(new MarkerOptions().position(point5).title(getResources().getString(R.string.nobj5)));

        LatLng point6 = new LatLng(55.67608 ,43.57512);
        mMap.addMarker(new MarkerOptions().position(point6).title(getResources().getString(R.string.nobj6)));

        LatLng point7 = new LatLng(55.67477 ,43.58096);
        mMap.addMarker(new MarkerOptions().position(point7).title(getResources().getString(R.string.nobj7)));

        LatLng point8 = new LatLng(55.67661 ,43.59211);
        mMap.addMarker(new MarkerOptions().position(point8).title(getResources().getString(R.string.nobj8)));

        LatLng point9 = new LatLng(55.67514 ,43.59130);
        mMap.addMarker(new MarkerOptions().position(point9).title(getResources().getString(R.string.nobj9)));

        LatLng point10 = new LatLng(55.67337 ,43.59362);
        mMap.addMarker(new MarkerOptions().position(point10).title(getResources().getString(R.string.nobj10)));

        LatLng point11 = new LatLng(55.67158 ,43.58881);
        mMap.addMarker(new MarkerOptions().position(point11).title(getResources().getString(R.string.nobj11)));
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                String id = marker.getId().substring(1);
                Intent intent = new Intent(getApplicationContext(), PointScreen.class);
                intent.putExtra("point", Integer.parseInt(id)+1);
                startActivity(intent);
                return false;
            }});
        LatLng point12 = new LatLng(55.66729 ,43.59623);
        mMap.addMarker(new MarkerOptions().position(point12).title(getResources().getString(R.string.nobj12)));
        mMap.moveCamera(CameraUpdateFactory.zoomTo( 16.0f ));
        switch (obj) {
            case(1):
            mMap.moveCamera(CameraUpdateFactory.newLatLng(point1));
            break;
            case(2):
                mMap.moveCamera(CameraUpdateFactory.newLatLng(point2));
                break;
            case(3):
                mMap.moveCamera(CameraUpdateFactory.newLatLng(point3));
                break;
            case(4):
                mMap.moveCamera(CameraUpdateFactory.newLatLng(point4));
                break;
            case(5):
                mMap.moveCamera(CameraUpdateFactory.newLatLng(point5));
                break;
            case(6):
                mMap.moveCamera(CameraUpdateFactory.newLatLng(point6));
                break;
            case(7):
                mMap.moveCamera(CameraUpdateFactory.newLatLng(point7));
                break;
            case(8):
                mMap.moveCamera(CameraUpdateFactory.newLatLng(point8));
                break;
            case(9):
                mMap.moveCamera(CameraUpdateFactory.newLatLng(point9));
                break;
            case(10):
                mMap.moveCamera(CameraUpdateFactory.newLatLng(point10));
                break;
            case(11):
                mMap.moveCamera(CameraUpdateFactory.newLatLng(point11));
                break;
            case(12):
                mMap.moveCamera(CameraUpdateFactory.newLatLng(point12));
                break;
        }
//        mMap.animateCamera( CameraUpdateFactory.zoomTo( 17.0f ) );
    }
}