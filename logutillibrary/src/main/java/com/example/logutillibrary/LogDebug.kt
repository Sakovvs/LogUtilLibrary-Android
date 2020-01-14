package com.example.logutillibrary

import android.util.Log


class LogDebug {
    companion object {
        private val TAG: String? = "MY_APP"
        fun d(message: String) {
            Log.d(TAG, message)
        }
    }

}