package com.febrian.flog

import android.util.Log

object Flog : ILogger {

    private fun getTag(): String {
        val method = Exception().stackTrace[3].methodName
        val tag = "Flog "
        val result = tag + method
        return result.replace(" Flog", "")
    }

    private fun formatMessage(message: String, vararg args: Any): String? {
        return if (args.isEmpty()) message else String.format(message, *args)
    }

    override fun v(message: String?, vararg args: Any?) {
        Log.v(getTag(), formatMessage(message!!, args)!!)
    }

    override fun v(t: Throwable?, message: String?, vararg args: Any?) {
        Log.v(getTag(), formatMessage(message!!, args), t)
    }

    override fun d(message: String?, vararg args: Any?) {
        Log.d(getTag(), formatMessage(message!!, args)!!)
    }

    override fun d(t: Throwable?, message: String?, vararg args: Any?) {
        Log.d(getTag(), formatMessage(message!!, args), t)
    }

    override fun i(message: String?, vararg args: Any?) {
        Log.i(getTag(), formatMessage(message!!, args)!!)
    }

    override fun i(t: Throwable?, message: String?, vararg args: Any?) {
        Log.i(getTag(), formatMessage(message!!, args), t)
    }

    override fun w(message: String?, vararg args: Any?) {
        Log.w(getTag(), formatMessage(message!!, args)!!)
    }

    override fun w(t: Throwable?, message: String?, vararg args: Any?) {
        Log.w(getTag(), formatMessage(message!!, args), t)
    }

    override fun e(message: String?, vararg args: Any?) {
        Log.e(getTag(), formatMessage(message!!, args)!!)
    }

    override fun e(t: Throwable?, message: String?, vararg args: Any?) {
        Log.e(getTag(), formatMessage(message!!, args), t)
    }
}