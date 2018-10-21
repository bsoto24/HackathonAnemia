package pe.openlab.hackatonanemia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nomina.*

class NominaActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nomina)

        img_mapa.setOnClickListener {
            startActivity(Intent(this, MapsActivity::class.java))
            finish()
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        }

        cv_beneficiario.setOnClickListener {
            startActivity(Intent(this, DetalleActivity::class.java))
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }

        btn_agregar.setOnClickListener {
            startActivity(Intent(this, RegistroActivity::class.java))
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

}
