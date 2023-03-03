package com.test.anativewindowdisplayimagedemo

import android.graphics.Bitmap
import android.view.Surface

object NativeRender {
    external fun readerImage(surface: Surface, bitmap: Bitmap)

    init {
        System.loadLibrary("native-lib")
    }
}