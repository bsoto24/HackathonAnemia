package pe.openlab.hackatonanemia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Thread{

            Thread.sleep(1000)
            startActivity(Intent(this, MapsActivity::class.java))
            finish()
            overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);

        }.start()

    }
}
