package com.erbaris.android.app.calculator.viewmodel.converter

import androidx.databinding.InverseMethod

object IntStringConverter {
    @InverseMethod(value = "toStr")
    fun toInt(str: String) : Int
    {
        var result = 0

        try {
            result = str.toInt()
        }
        catch (ignore: NumberFormatException) {

        }
        return result
    }

    fun toStr(value: Int) = value.toString()
}