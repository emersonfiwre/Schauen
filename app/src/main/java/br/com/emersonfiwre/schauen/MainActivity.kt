package br.com.emersonfiwre.schauen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.emersonfiwre.tikplayer.TikPlayerInitialize

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        TikPlayerInitialize
            .withFragment(supportFragmentManager, R.id.id_main_container)
            .build()
    }
}