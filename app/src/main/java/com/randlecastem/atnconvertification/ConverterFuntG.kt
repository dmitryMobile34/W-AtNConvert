package com.randlecastem.atnconvertification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_converter_funt_g.*

class ConverterFuntG : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter_funt_g)

        mainEditbox.addTextChangedListener(object : TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                try {
                    val enterValue = mainEditbox.text.toString().replace(",", ".").toDouble()
                    val currencyPar = 454

                    mainTextbox.text = String.format("%.3f",(enterValue * currencyPar))
                }
                catch (e: Exception) {
                    Toast.makeText(applicationContext, "Неверный формат", Toast.LENGTH_SHORT).show()
                }
            }

            override fun afterTextChanged(s: Editable?) {

            }

        })

        returnButton.setOnClickListener {
            finish()
        }

    }
}