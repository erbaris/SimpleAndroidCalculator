package com.erbaris.android.app.calculator.operators;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/erbaris/android/app/calculator/operators/ICalculatorOperator;", "", "apply", "", "operand1", "operand2", "app_debug"})
public abstract interface ICalculatorOperator {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String apply(@org.jetbrains.annotations.NotNull
    java.lang.String operand1, @org.jetbrains.annotations.NotNull
    java.lang.String operand2);
}