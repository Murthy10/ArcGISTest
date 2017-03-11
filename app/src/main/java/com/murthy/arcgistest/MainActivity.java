package com.murthy.arcgistest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.esri.android.map.MapView;
import com.esri.android.map.ogc.WMSLayer;


public class MainActivity extends AppCompatActivity {


    private MapView mMapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMapView = (MapView) findViewById(R.id.mapView);

        String wmsURL = "http://wms.geo.admin.ch/?REQUEST=GetCapabilities&SERVICE=WMS&VERSION=1.0.0";
        WMSLayer wmsLayer = new WMSLayer(wmsURL);
        wmsLayer.setImageFormat("image/png");
        wmsLayer.setVisibleLayer(new String[]{"ch.swisstopo.pixelkarte-farbe-pk1000.noscale"});

        mMapView.addLayer(wmsLayer);
    }

}
