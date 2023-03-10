package com.erbaris.android.app.calculator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u00c6\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\b\u0010$\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r\u00a8\u0006%"}, d2 = {"Lcom/erbaris/android/app/calculator/CalculatorInfo;", "Ljava/io/Serializable;", "operand1", "", "operand2", "result", "msg", "operator", "Lcom/erbaris/android/app/calculator/operators/ICalculatorOperator;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/erbaris/android/app/calculator/operators/ICalculatorOperator;)V", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "getOperand1", "setOperand1", "getOperand2", "setOperand2", "getOperator", "()Lcom/erbaris/android/app/calculator/operators/ICalculatorOperator;", "setOperator", "(Lcom/erbaris/android/app/calculator/operators/ICalculatorOperator;)V", "getResult", "setResult", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
public final class CalculatorInfo implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private java.lang.String operand1;
    @org.jetbrains.annotations.NotNull
    private java.lang.String operand2;
    @org.jetbrains.annotations.NotNull
    private java.lang.String result;
    @org.jetbrains.annotations.NotNull
    private java.lang.String msg;
    @org.jetbrains.annotations.Nullable
    private com.erbaris.android.app.calculator.operators.ICalculatorOperator operator;
    
    @org.jetbrains.annotations.NotNull
    public final com.erbaris.android.app.calculator.CalculatorInfo copy(@org.jetbrains.annotations.NotNull
    java.lang.String operand1, @org.jetbrains.annotations.NotNull
    java.lang.String operand2, @org.jetbrains.annotations.NotNull
    java.lang.String result, @org.jetbrains.annotations.NotNull
    java.lang.String msg, @org.jetbrains.annotations.Nullable
    com.erbaris.android.app.calculator.operators.ICalculatorOperator operator) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    public CalculatorInfo() {
        super();
    }
    
    public CalculatorInfo(@org.jetbrains.annotations.NotNull
    java.lang.String operand1, @org.jetbrains.annotations.NotNull
    java.lang.String operand2, @org.jetbrains.annotations.NotNull
    java.lang.String result, @org.jetbrains.annotations.NotNull
    java.lang.String msg, @org.jetbrains.annotations.Nullable
    com.erbaris.android.app.calculator.operators.ICalculatorOperator operator) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOperand1() {
        return null;
    }
    
    public final void setOperand1(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOperand2() {
        return null;
    }
    
    public final void setOperand2(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getResult() {
        return null;
    }
    
    public final void setResult(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMsg() {
        return null;
    }
    
    public final void setMsg(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.erbaris.android.app.calculator.operators.ICalculatorOperator component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.erbaris.android.app.calculator.operators.ICalculatorOperator getOperator() {
        return null;
    }
    
    public final void setOperator(@org.jetbrains.annotations.Nullable
    com.erbaris.android.app.calculator.operators.ICalculatorOperator p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
}