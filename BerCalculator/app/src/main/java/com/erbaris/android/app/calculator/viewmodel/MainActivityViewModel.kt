package com.erbaris.android.app.calculator.viewmodel

import com.erbaris.android.app.calculator.CalculatorInfo
import com.erbaris.android.app.calculator.MainActivity

data class MainActivityViewModel(private val activity: MainActivity, var calculatorInfo: CalculatorInfo ) : java.io.Serializable{


    fun handleCbuttonClicked() = activity.CbuttonCallback()
    fun handlepercantageButtonClicked() = activity.percantageButtonCallback()
    fun handleCEButtonClicked() = activity.CEButtonCallback()
    fun handleDivideButtonClicked() = activity.divideButtonCallback()
    fun handleSevenButtonClicked() = activity.sevenButtonCallback()
    fun handleEigthButtonClicked() = activity.eigthButtonCallback()
    fun handleNineButtonClicked() = activity.nineButtonCallback()
    fun handleMultiplyButtonClicked() = activity.multiplyButtonCallback()
    fun handleFourButtonClicked() = activity.fourButtonCallback()
    fun handleFiveButtonClicked() = activity.fiveButtonCallback()
    fun handleSixButtonClicked() = activity.sixButtonCallback()
    fun handlePlusButtonClicked() = activity.plusButtonCallback()
    fun handleOneButtonClicked() = activity.oneButtonCallback()
    fun handleTwoButtonClicked() = activity.twoButtonCallback()
    fun handleThreeButtonClicked() = activity.threeButtonCallback()
    fun handleMinusButtonClicked() = activity.minusButtonCallback()
    fun handleDotButtonClicked() = activity.dotButtonCallback()
    fun handleZeroButtonClicked() = activity.zeroButtonCallback()
    fun handleSignButtonClicked() = activity.signButtonCallback()
    fun handleEqualButtonClicked() = activity.equalButtonCallback()



}