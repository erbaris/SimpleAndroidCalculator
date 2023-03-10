package com.erbaris.android.app.calculator.operators

import java.math.BigDecimal

class MinusOperator : ICalculatorOperator {
    override fun apply(operand1: String, operand2: String): String {
        return BigDecimal(operand1).subtract(BigDecimal(operand2)).toString()
    }

    override fun toString(): String {
        return "-"
    }
}