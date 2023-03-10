package com.erbaris.android.app.calculator.operators

import java.math.BigDecimal

class PercentageOperator :ICalculatorOperator {
    override fun apply(operand1: String, operand2: String): String {
        return BigDecimal(operand1).multiply(BigDecimal(operand2)).divide(BigDecimal("100")).toString()
    }

    override fun toString(): String {
        return "%"
    }
}