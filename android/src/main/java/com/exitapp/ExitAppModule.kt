package com.exitapp

import android.app.Activity
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class ExitAppModule(reactContext: ReactApplicationContext) :
  ReactContextBaseJavaModule(reactContext) {

  override fun getName(): String {
    return NAME
  }

  @ReactMethod
  fun exitApp() {
    val activity: Activity? = reactApplicationContext.currentActivity
    activity?.finishAffinity()
    Runtime.getRuntime().exit(0)
  }

  companion object {
    const val NAME = "ExitApp"
  }
}
