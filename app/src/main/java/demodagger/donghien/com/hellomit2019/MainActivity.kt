package demodagger.donghien.com.hellomit2019

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messageView = findViewById<TextView>(R.id.text_message)
        showMessage(messageView)
    }

    fun showMessage(messageView: TextView) {
        messageView.setText(R.string.message_hello)
    }
}
