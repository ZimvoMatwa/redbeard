package thehuman.zimvo.unomomento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val unoCard: TextView = findViewById(R.id.unoCard)
        unoCard.text = "Uno momento mi amigo"
    }
}