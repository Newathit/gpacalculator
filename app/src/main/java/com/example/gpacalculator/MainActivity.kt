package com.example.gpacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Context
import android.widget.Toast
import java.text.DecimalFormat
import kotlin.math.round
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Ok.setOnClickListener{
            var sub1 = s1.text.toString()
            var cre1 = c1.text.toString()
            var poi1 = po1.text.toString()

            var sub2 = s2.text.toString()
            var cre2 = c2.text.toString()
            var poi2 = po2.text.toString()

            var sub3 = s3.text.toString()
            var cre3 = c3.text.toString()
            var poi3 = po3.text.toString()

            var sub4 = s4.text.toString()
            var cre4 = c4.text.toString()
            var poi4 = po4.text.toString()

            var sub5 = s5.text.toString()
            var cre5 = c5.text.toString()
            var poi5 = po5.text.toString()
            if (sub1 == "" || cre1 == ""|| poi1 == ""|| sub2 == "" || cre2 == ""|| poi2 == ""|| sub3 == "" || cre3 == ""|| poi3 == ""
                || sub4 == "" || cre4 == ""|| poi4 == ""|| sub5 == "" || cre5 == ""|| poi5 == "") {
                toast {
                    "Please Input All Text Box Before Press OK !!!"
                }
            } else if (cre1.toInt() > 3 || cre2.toInt() > 3 || cre3.toInt() > 3 || cre4.toInt() >3 || cre5.toInt() > 3){
                toast {
                    "Please Input Credit < 3 !!!"
                }
            } else{
                var sumcredit = cre1.toInt() + cre2.toInt() + cre3.toInt() + cre4.toInt() + cre5.toInt()
                totalpo.setText("$sumcredit")
                var cxd1 = cre1.toDouble() * poi1.toDouble()
                var cxd2 = cre2.toDouble() * poi2.toDouble()
                var cxd3 = cre3.toDouble() * poi3.toDouble()
                var cxd4 = cre4.toDouble() * poi4.toDouble()
                var cxd5 = cre5.toDouble() * poi5.toDouble()
                var sumcxd = cxd1 + cxd2 + cxd3 + cxd4 + cxd5
                var grade = sumcxd / sumcredit
                val ss = "%.2f".format(grade)
                Gade.setText("$ss")

            }
        }
        Clear.setOnClickListener {
            s1.setText("")
            c1.setText("")
            po1.setText("")

            s2.setText("")
            c2.setText("")
            po2.setText("")

            s3.setText("")
            c3.setText("")
            po3.setText("")

            s4.setText("")
            c4.setText("")
            po4.setText("")

            s5.setText("")
            c5.setText("")
            po5.setText("")

            totalpo.setText("")
            Gade.setText("")
        }

    }
}
inline fun Context.toast(message:()->String){
    Toast.makeText(this, message() , Toast.LENGTH_LONG).show()
}