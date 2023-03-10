package com.erbaris.android.app.calculator

import com.erbaris.android.app.calculator.operators.ICalculatorOperator
import java.io.Serializable

data class CalculatorInfo(var operand1 : String = "",
                          var operand2 : String = "",
                          var result : String = "",
                          var msg: String = "",
                          var operator: ICalculatorOperator? = null) : Serializable {
    override fun toString(): String {
        return "$operand1 $operator $operand2 = $result"
    }
}
