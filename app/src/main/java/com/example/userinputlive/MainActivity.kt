package com.example.userinputlive

import android.os.Bundle
import android.text.Editable
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import com.example.userinputlive.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    private lateinit var firstRadio: RadioButton
    private lateinit var sndRadio: RadioButton
    private lateinit var thirdRadio: RadioButton
    private lateinit var button: Button
    private lateinit var fab: FloatingActionButton
    private lateinit var input: String
    private lateinit var outputTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Input aus TextEdit rausschälen
        var input = findViewById<EditText>(R.id.editText).text


        // Logik FAB
        fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            Snackbar.make(it, "FAB getappt!",Snackbar.LENGTH_LONG)
                .show()
        }

        // Logik Button
        button = findViewById(R.id.button)
        button.setOnClickListener{
            input.clear()
        }

        // Logik TextView, die den in TextEdit eingegebenen






    }

}