package com.example.errorutil

import android.util.Log

class ErrorDebug {
    companion object {
        private val TAG: String? = "MY_APP"
        fun e(message: String) {
            Log.e(TAG, message)
        }
    }

}