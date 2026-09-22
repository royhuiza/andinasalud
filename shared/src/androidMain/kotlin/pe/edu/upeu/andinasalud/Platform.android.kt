package pe.edu.upeu.andinasalud

import android.os.Build
import pe.upeu.andinasalud.Platform

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()