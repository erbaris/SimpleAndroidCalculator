package com.erbaris.android.app.calculator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\fJ\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\fJ\u0006\u0010\u0017\u001a\u00020\fJ\b\u0010\u0018\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\fH\u0002J\u0006\u0010\u001a\u001a\u00020\fJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\fJ\u0006\u0010\u001e\u001a\u00020\fJ\u0012\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0006\u0010\"\u001a\u00020\fJ\u0006\u0010#\u001a\u00020\fJ\u0006\u0010$\u001a\u00020\fJ\u0006\u0010%\u001a\u00020\fJ\u0006\u0010&\u001a\u00020\fJ\u000e\u0010\'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u001cJ\u000e\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020\fJ\u0006\u0010-\u001a\u00020\fJ\u0006\u0010.\u001a\u00020\fJ\u0006\u0010/\u001a\u00020\fJ\u0006\u00100\u001a\u00020\fJ\u0006\u00101\u001a\u00020\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/erbaris/android/app/calculator/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "calculatorInfo", "Lcom/erbaris/android/app/calculator/CalculatorInfo;", "getCalculatorInfo", "()Lcom/erbaris/android/app/calculator/CalculatorInfo;", "setCalculatorInfo", "(Lcom/erbaris/android/app/calculator/CalculatorInfo;)V", "mBinding", "Lcom/erbaris/android/app/calculator/databinding/ActivityMainBinding;", "CEButtonCallback", "", "CbuttonCallback", "calculateResult", "changeSignOperand1", "changeSignOperand2", "clearScreen", "divideButtonCallback", "dotButtonCallback", "eigthButtonCallback", "equalButtonCallback", "fiveButtonCallback", "fourButtonCallback", "initBinding", "initialize", "minusButtonCallback", "msgOperands", "", "multiplyButtonCallback", "nineButtonCallback", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "oneButtonCallback", "percantageButtonCallback", "plusButtonCallback", "setMessage", "setMessageResult", "setOperand", "number", "setOperator", "operator", "Lcom/erbaris/android/app/calculator/operators/ICalculatorOperator;", "sevenButtonCallback", "signButtonCallback", "sixButtonCallback", "threeButtonCallback", "twoButtonCallback", "zeroButtonCallback", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.erbaris.android.app.calculator.databinding.ActivityMainBinding mBinding;
    public com.erbaris.android.app.calculator.CalculatorInfo calculatorInfo;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.erbaris.android.app.calculator.CalculatorInfo getCalculatorInfo() {
        return null;
    }
    
    public final void setCalculatorInfo(@org.jetbrains.annotations.NotNull
    com.erbaris.android.app.calculator.CalculatorInfo p0) {
    }
    
    private final void initBinding() {
    }
    
    private final void initialize() {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setOperand(@org.jetbrains.annotations.NotNull
    java.lang.String number) {
    }
    
    public final void setMessage() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String msgOperands() {
        return null;
    }
    
    public final void setMessageResult() {
    }
    
    public final void clearScreen() {
    }
    
    public final void setOperator(@org.jetbrains.annotations.NotNull
    com.erbaris.android.app.calculator.operators.ICalculatorOperator operator) {
    }
    
    public final void CbuttonCallback() {
    }
    
    public final void percantageButtonCallback() {
    }
    
    public final void CEButtonCallback() {
    }
    
    public final void divideButtonCallback() {
    }
    
    public final void sevenButtonCallback() {
    }
    
    public final void eigthButtonCallback() {
    }
    
    public final void nineButtonCallback() {
    }
    
    public final void multiplyButtonCallback() {
    }
    
    public final void fourButtonCallback() {
    }
    
    public final void fiveButtonCallback() {
    }
    
    public final void sixButtonCallback() {
    }
    
    public final void plusButtonCallback() {
    }
    
    public final void oneButtonCallback() {
    }
    
    public final void twoButtonCallback() {
    }
    
    public final void threeButtonCallback() {
    }
    
    public final void minusButtonCallback() {
    }
    
    public final void dotButtonCallback() {
    }
    
    public final void zeroButtonCallback() {
    }
    
    public final void signButtonCallback() {
    }
    
    public final void changeSignOperand1() {
    }
    
    public final void changeSignOperand2() {
    }
    
    public final void equalButtonCallback() {
    }
    
    public final void calculateResult() {
    }
}