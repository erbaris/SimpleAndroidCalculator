package com.erbaris.android.app.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.erbaris.android.app.calculator.databinding.ActivityMainBinding
import com.erbaris.android.app.calculator.operators.*
import com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    lateinit var calculatorInfo: CalculatorInfo


    private fun initBinding()
    {
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding.viewModel = MainActivityViewModel(this, CalculatorInfo())
        calculatorInfo = mBinding.viewModel!!.calculatorInfo
        mBinding.screenView = ""
    }


    private fun initialize()
    {
        initBinding()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialize()
    }

    fun setOperand(number: String)
    {
        if(!calculatorInfo.result.isEmpty())
            clearScreen()


        if(calculatorInfo.operator == null)
            calculatorInfo.operand1 += number
        else
            calculatorInfo.operand2 += number

        setMessage()

    }
    fun setMessage()
    {
        mBinding.screenView = msgOperands()

    }
    fun msgOperands() : String
    {
        return calculatorInfo.operand1 + " " + (if(calculatorInfo.operator != null) calculatorInfo.operator.toString() else "") + " " +
                calculatorInfo.operand2
    }
    fun setMessageResult()
    {
        mBinding.screenView = msgOperands() + " = " + calculatorInfo.result

    }
    fun clearScreen()
    {
        calculatorInfo.operand1 = ""
        calculatorInfo.operand2 = ""
        calculatorInfo.operator = null
        calculatorInfo.result = ""
        mBinding.screenView = ""
    }
    fun setOperator(operator: ICalculatorOperator)
    {
        if (calculatorInfo.operand1.isEmpty())
            return

        if (calculatorInfo.operator == null)
            calculatorInfo.operator = operator
        else if (calculatorInfo.operand2.isEmpty())
            calculatorInfo.operator = operator
        else {
            calculateResult()
            calculatorInfo.operand1 = calculatorInfo.result
            calculatorInfo.result = ""
            calculatorInfo.operand2 = ""
            calculatorInfo.operator = operator
        }
        setMessage()
    }

    fun CbuttonCallback()
    {
        clearScreen()
        Toast.makeText(this, "temizz", Toast.LENGTH_SHORT).show()
    }

    fun percantageButtonCallback() = setOperator(PercentageOperator())

    fun CEButtonCallback()
    {
        if(calculatorInfo.result.isEmpty() && !calculatorInfo.operand2.isEmpty()) {
            calculatorInfo.operand2 = ""
            setMessage()
        }
        else
            CbuttonCallback()
    }

    fun divideButtonCallback() = setOperator(DivideOperator())

    fun sevenButtonCallback() = setOperand("7")

    fun eigthButtonCallback() = setOperand("8")

    fun nineButtonCallback() = setOperand("9")

    fun multiplyButtonCallback() = setOperator(MultiplyOperator())

    fun fourButtonCallback() = setOperand("4")

    fun fiveButtonCallback() = setOperand("5")

    fun sixButtonCallback() = setOperand("6")

    fun plusButtonCallback() = setOperator(PlusOperator())

    fun oneButtonCallback() = setOperand("1")

    fun twoButtonCallback() = setOperand("2")

    fun threeButtonCallback() = setOperand("3")

    fun minusButtonCallback() = setOperator(MinusOperator())

    fun dotButtonCallback() = setOperand(".")

    fun zeroButtonCallback() = setOperand("0")

    fun signButtonCallback()
    {
        if(calculatorInfo.result.isEmpty() && calculatorInfo.operator != null)
            changeSignOperand2()

        if (calculatorInfo.operator == null)
            changeSignOperand1()

        if (!calculatorInfo.result.isEmpty()){
            calculatorInfo.operand1 = calculatorInfo.result
            changeSignOperand1()
            calculatorInfo.result = ""
            calculatorInfo.operand2 = ""
            calculatorInfo.operator = null


        }

        setMessage()
    }

    fun changeSignOperand1()
    {
        if (!calculatorInfo.operand1.isEmpty())
            calculatorInfo.operand1 = BigDecimal(calculatorInfo.operand1).multiply(BigDecimal(-1)).toString()
    }
    fun changeSignOperand2()
    {
        if (!calculatorInfo.operand2.isEmpty())
            calculatorInfo.operand2 = BigDecimal(calculatorInfo.operand2).multiply(BigDecimal(-1)).toString()
    }

    fun equalButtonCallback()
    {
        if(calculatorInfo.operator != null && !calculatorInfo.operand1.isEmpty() && !calculatorInfo.operand2.isEmpty()) {
            calculateResult()
            setMessageResult()
        }

    }
    fun calculateResult()
    {
        calculatorInfo.result = calculatorInfo.operator!!.apply(calculatorInfo.operand1, calculatorInfo.operand2)
    }



}