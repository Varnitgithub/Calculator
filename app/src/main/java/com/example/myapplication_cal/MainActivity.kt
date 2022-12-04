package com.example.myapplication_cal

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

var OneTime = true
var ForDot = true
var afterminus = true
var Onedot = true

@SuppressLint("StaticFieldLeak")
private var Display: TextView? = null

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Display = findViewById(R.id.display)
    }

    @SuppressLint("SetTextI18n")
    @RequiresApi(Build.VERSION_CODES.R)
    fun Addition(View: View) {

        try {

            val DisplayString: String = Display?.text.toString()
            if (DisplayString.contains("+")) {
                if (DisplayString.startsWith("-")) {
                    DisplayString.substring(1)


                    val DisplayStringSplit = DisplayString.split("+")
                    val value0 = DisplayStringSplit[0]
                    val value1 = DisplayStringSplit[1]
                    val Additional = (value0.toDouble() + value1.toDouble()).toString()
                    val SplitAnswer = Additional.split(".")
                    val Ans0 = SplitAnswer[0]
                    val Ans1 = SplitAnswer[1]
                    if (Ans1 == "0") {
                        Display?.text = "-$Ans0"
                    } else {
                        Display?.text = "-$Additional"
                    }

                } else {
                    val DisplayStringSplit = DisplayString.split("+")
                    val value0 = DisplayStringSplit[0]
                    val value1 = DisplayStringSplit[1]
                    val Additional = (value0.toDouble() + value1.toDouble()).toString()
                    val SplitAnswer = Additional.split(".")
                    val Ans0 = SplitAnswer[0]
                    val Ans1 = SplitAnswer[1]
                    if (Ans1 == "0") {
                        Display?.text = Ans0
                    } else {
                        Display?.text = Additional
                    }

                }


            }
        } catch (E: java.lang.ArithmeticException) {
            E.printStackTrace()
        }
        try {

            val DisplayString: String = Display?.text.toString()
            if (DisplayString.contains("*")) {
                if (DisplayString.startsWith("-")) {
                    DisplayString.substring(1)
                    val prefix = "-"

                    val DisplayStringSplit = DisplayString.split("*")
                    val value0 = DisplayStringSplit[0]
                    val value1 = DisplayStringSplit[1]
                    val Additional = (value0.toDouble() * value1.toDouble()).toString()
                    val SplitAnswer = Additional.split(".")
                    val Ans0 = SplitAnswer[0]
                    val Ans1 = SplitAnswer[1]
                    if (Ans1 == "0") {
                        Display?.text = "-$Ans0"
                    } else {
                        Display?.text = "-$Additional"
                    }

                } else {
                    val DisplayStringSplit = DisplayString.split("*")
                    val value0 = DisplayStringSplit[0]
                    val value1 = DisplayStringSplit[1]
                    val Additional = (value0.toDouble() * value1.toDouble()).toString()
                    val SplitAnswer = Additional.split(".")
                    val Ans0 = SplitAnswer[0]
                    val Ans1 = SplitAnswer[1]
                    if (Ans1 == "0") {
                        Display?.text = Ans0
                    } else {
                        Display?.text = Additional
                    }

                }


            }
        } catch (E: java.lang.ArithmeticException) {
            E.printStackTrace()
        }
        try {

            val DisplayString: String = Display?.text.toString()
            if (DisplayString.contains("/")) {
                if (DisplayString.startsWith("-")) {
                    DisplayString.substring(1)
                    val prefix = "-"

                    val DisplayStringSplit = DisplayString.split("/")
                    val value0 = DisplayStringSplit[0]
                    val value1 = DisplayStringSplit[1]
                    val Additional = (value0.toDouble() / value1.toDouble()).toString()
                    val SplitAnswer = Additional.split(".")
                    val Ans0 = SplitAnswer[0]
                    val Ans1 = SplitAnswer[1]
                    if (Ans1 == "0") {
                        Display?.text = "-$Ans0"
                    } else {
                        Display?.text = "-$Additional"
                    }

                } else {
                    val DisplayStringSplit = DisplayString.split("/")
                    val value0 = DisplayStringSplit[0]
                    val value1 = DisplayStringSplit[1]
                    val Additional = (value0.toDouble() / value1.toDouble()).toString()
                    val SplitAnswer = Additional.split(".")
                    val Ans0 = SplitAnswer[0]
                    val Ans1 = SplitAnswer[1]
                    if (Ans1 == "0") {
                        Display?.text = Ans0
                    } else {
                        Display?.text = Additional
                    }

                }


            }
        } catch (E: java.lang.ArithmeticException) {
            E.printStackTrace()
        }
        try {

            val DisplayString: String = Display?.text.toString()
            if (DisplayString.contains("-")) {
                if (DisplayString.startsWith("-")) {
                    DisplayString.substring(1)
                    val prefix = "-"

                    val DisplayStringSplit = DisplayString.split("-")
                    val value0 = DisplayStringSplit[0]
                    val value1 = DisplayStringSplit[1]
                    val Additional = (value0.toDouble() - value1.toDouble()).toString()
                    val SplitAnswer = Additional.split(".")
                    val Ans0 = SplitAnswer[0]
                    val Ans1 = SplitAnswer[1]
                    if (Ans1 == "0") {
                        Display?.text = "-$Ans0"
                    } else {
                        Display?.text = "-$Additional"
                    }

                } else {
                    val DisplayStringSplit = DisplayString.split("-")
                    val value0 = DisplayStringSplit[0]
                    val value1 = DisplayStringSplit[1]
                    val Additional = (value0.toDouble() - value1.toDouble()).toString()
                    val SplitAnswer = Additional.split(".")
                    val Ans0 = SplitAnswer[0]
                    val Ans1 = SplitAnswer[1]
                    if (Ans1 == "0") {
                        Display?.text = Ans0
                    } else {
                        Display?.text = Additional
                    }
                }
            }
        } catch (E: java.lang.ArithmeticException) {
            E.printStackTrace()
        }
    }

    fun clearAll(view: View) {
        Display?.text = ""
        OneTime = true
        ForDot = true
        Onedot = true
        afterminus = true
    }

    fun click(View: View) {
        Display?.append((View as TextView).text)
        OneTime = true
        ForDot = true
        Onedot = true
        afterminus = true
    }

    fun OneTimeclick(View: View) {

        if (OneTime && ForDot && afterminus) {
            Display?.append((View as TextView).text)
            OneTime = false
            ForDot = false
            afterminus = true
            Onedot = true
        }
    }

    fun subtract(View: View) {
        if (ForDot && afterminus)
            Display?.append(("-"))
        OneTime = false
        ForDot = false
    }

    fun dot(View: View) {
        if (Onedot) {
            Display?.append(("."))
        }
    }
}