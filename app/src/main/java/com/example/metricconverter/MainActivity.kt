package com.example.metricconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun tempConvert(inputNumber: Int){
            idAnswer.text = ((inputNumber - 32)/ 1.8).toString() + " C"
        }

        fun inchConvert(inputNumber: Int){
            idAnswer.text = (inputNumber * 25.4).toString() + " mm"
        }

        fun weightConvert(inputNumber:Int){
            idAnswer.text = (inputNumber * 0.454).toString() + " kg"
        }

        fun ounceConvert(inputNumber:Int){
            idAnswer.text = (inputNumber * 28.35).toString() + " g"
        }

        idButton.setOnClickListener {
            var inputNumber = idInputNumber.text.toString().toInt()
            when (idInputNumber.text.toString().toInt() != 0){
                idFtoC.isChecked -> tempConvert(inputNumber)
                idInchtoMM.isChecked -> inchConvert(inputNumber)
                idLbtoKg.isChecked  -> weightConvert(inputNumber)
                idOztoG.isChecked -> ounceConvert(inputNumber)
            }

        }
    }
}
