package thehuman.zimvo.whoiszimvo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skrata)

        findViewById<Button>(R.id.doneButton).setOnClickListener {
            if (addAnswer(it).equals("Mandoza")) { //doesn't work yet
                addAnswer(it)
            } else {
                println("Try again")
            }
//            addAnswer(it)
        }
    }

    public fun addAnswer(view: View) {
        val editText = findViewById<EditText>(R.id.answer1)
        val answerTextView = findViewById<TextView>(R.id.answer1Reveal)

        answerTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        answerTextView.visibility = View.VISIBLE

        //hide keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}