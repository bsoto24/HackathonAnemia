package pe.openlab.hackatonanemia

import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.activity_maps.*

class MapsActivity : AppCompatActivity(), OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)


        img_lista.setOnClickListener {

            startActivity(Intent(this, NominaActivity::class.java))
            finish()
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

        }
    }

    override fun onMapReady(googleMap: GoogleMap) {

        mMap = googleMap

        val defaultPosition = LatLng(-11.8498223,-77.1218863)

        mMap.clear()

        if (Build.VERSION.SDK_INT >= 23) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(defaultPosition))
            mMap.animateCamera(CameraUpdateFactory.zoomTo(16f))
        }

        mMap.addMarker(MarkerOptions().position(LatLng(-11.850208, -77.116924)).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_normal)).zIndex(1.0f))
        mMap.addMarker(MarkerOptions().position(LatLng(-11.8498223,-77.1218863)).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_normal)).zIndex(1.0f))

        mMap.addMarker(MarkerOptions().position(LatLng(-11.8498323, -77.1230184)).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_anemia)).zIndex(1.0f))
        mMap.addMarker(MarkerOptions().position(LatLng(-11.847993, -77.118304)).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_anemia)).zIndex(1.0f))
        mMap.addMarker(MarkerOptions().position(LatLng(-11.846751, -77.121314)).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_anemia)).zIndex(1.0f))
        mMap.addMarker(MarkerOptions().position(LatLng(-11.848502, -77.123025)).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_anemia)).zIndex(1.0f))
        mMap.addMarker(MarkerOptions().position(LatLng(-11.848502, -77.123025)).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_anemia)).zIndex(1.0f))

        mMap.addMarker(MarkerOptions().position(LatLng(-11.8495861,-77.1220111)).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_riesgo)).zIndex(1.0f))
        mMap.addMarker(MarkerOptions().position(LatLng(-11.8498323, -77.1230184)).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_riesgo)).zIndex(1.0f))
        mMap.addMarker(MarkerOptions().position(LatLng(-11.8495861,-77.1220111)).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_riesgo)).zIndex(1.0f))


        mMap.setOnMarkerClickListener(this)


    }

    override fun onMarkerClick(marker: Marker?): Boolean {
        val bsdFragment = BottomSheetBeneficiario.newInstance()
        bsdFragment.show(this.supportFragmentManager, "BSDialog")
        return false
    }
}
