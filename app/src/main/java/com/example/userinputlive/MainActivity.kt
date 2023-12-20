package com.example.userinputlive

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.example.userinputlive.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private lateinit var constrain: ConstraintLayout

    private lateinit var firstRadio: RadioButton
    private lateinit var sndRadio: RadioButton
    private lateinit var thirdRadio: RadioButton
    private lateinit var button: Button
    private lateinit var fab: FloatingActionButton
    private lateinit var input: String
    private lateinit var outputTextView: TextView
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialisierung des EditText und TextView
        editText = findViewById(R.id.editText)
        outputTextView = findViewById(R.id.outputText)

        // Logik FAB
        fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            Snackbar.make(it, "FAB getappt!", Snackbar.LENGTH_LONG).show()
        }

        // Logik Button
        button = findViewById(R.id.button)
        button.setOnClickListener {
            // Aktualisieren des TextViews mit dem Text aus EditText
            outputTextView.text = editText.text.toString()
            editText.text.clear()
        }

        // Initialisierung des RadioButtons
        firstRadio = findViewById(R.id.firstRadioBtn)
        // Initialisierung Constraintlayout
        var constraintLayout = findViewById<ConstraintLayout>(R.id.constraintLayout)
        // Logik RadioButton
        firstRadio.setOnClickListener {
           Snackbar.make(it,"1. RadioButton geklickt",Snackbar.LENGTH_SHORT).show()
            constraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.pink))
        }
    }
}