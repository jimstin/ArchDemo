package com.jim.lib_common.utl;

import android.util.Log;

import com.jim.lib_common.BuildConfig;

public class LogUtil {

    public static boolean isDebuggable() {
        return BuildConfig.DEBUG;
    }

    private static String createLog(String log, LogInfo logInfo) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(logInfo.methodName);
        stringBuffer.append("(").append(logInfo.className).append(":").append(logInfo.lineNumber).append(")").append(" ");
        stringBuffer.append(log);
        return stringBuffer.toString();
    }

    private static LogInfo getMethodNames(StackTraceElement[] sElements) {
        String className = sElements[1].getFileName();
        String methodName = sElements[1].getMethodName();
        int lineNumber = sElements[1].getLineNumber();
        return new LogInfo(className, methodName, lineNumber);
    }

    public static void i(String tag, String message) {
        LogInfo logInfo = getMethodNames(new Throwable().getStackTrace());
        String log = createLog(message, logInfo);
        Log.i(tag, log);
    }

    public static void i(String message) {
        LogInfo logInfo = getMethodNames(new Throwable().getStackTrace());
        String log = createLog(message, logInfo);
        Log.i(logInfo.className, log);
    }

    public static void w(String tag, String message) {
        LogInfo logInfo = getMethodNames(new Throwable().getStackTrace());
        String log = createLog(message, logInfo);
        Log.w(tag, log);
    }

    public static void w(String message) {
        LogInfo logInfo = getMethodNames(new Throwable().getStackTrace());
        String log = createLog(message, logInfo);
        Log.w(logInfo.className, log);
    }

    public static void d(String tag, String message) {
        LogInfo logInfo = getMethodNames(new Throwable().getStackTrace());
        String log = createLog(message, logInfo);
        Log.d(tag, log);
    }

    public static void d(String message) {
        LogInfo logInfo = getMethodNames(new Throwable().getStackTrace());
        String log = createLog(message, logInfo);
        Log.d(logInfo.className, log);
    }

    public static void e(String tag, String message) {
        LogInfo logInfo = getMethodNames(new Throwable().getStackTrace());
        String log = createLog(message, logInfo);
        Log.e(tag, log);
    }


    public static void e(String message) {
        LogInfo logInfo = getMethodNames(new Throwable().getStackTrace());
        String log = createLog(message, logInfo);
        Log.e(logInfo.className, log);
    }

    static class LogInfo {
        String className;
        String methodName;
        int lineNumber;

        public LogInfo(String className, String methodName, int lineNumber) {
            this.className = className;
            this.methodName = methodName;
            this.lineNumber = lineNumber;
        }
    }

}
