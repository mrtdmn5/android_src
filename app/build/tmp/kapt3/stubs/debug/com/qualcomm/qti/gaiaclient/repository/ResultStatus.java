package com.qualcomm.qti.gaiaclient.repository;

import java.lang.System;

/**
 * Denotes the status of a Result as still in progress, a success or a failure.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/ResultStatus;", "", "(Ljava/lang/String;I)V", "SUCCESS", "FAIL", "IN_PROGRESS", "app_debug"})
public enum ResultStatus {
    /*public static final*/ SUCCESS /* = new SUCCESS() */,
    /*public static final*/ FAIL /* = new FAIL() */,
    /*public static final*/ IN_PROGRESS /* = new IN_PROGRESS() */;
    
    ResultStatus() {
    }
}