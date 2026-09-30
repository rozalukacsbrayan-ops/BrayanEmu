package com.brayanemu.core.libretro

import com.brayanemu.core.EmulatorCore

/**
 * Puente preparado para cores libretro compilados como bibliotecas nativas.
 *
 * La implementación JNI real se añadirá cuando se incorporen los .so del core.
 */
class LibretroCore(
    override val id: String,
    override val displayName: String,
    override val systems: List<String>,
    override val supportedExtensions: List<String>,
    private val libraryName: String
) : EmulatorCore {

    private var nativeLoaded = false

    override fun initialize(systemDirectory: String) {
        // En la integración real:
        // System.loadLibrary(libraryName)
        nativeLoaded = false
    }

    override fun loadGame(path: String): Boolean = nativeLoaded
    override fun reset() {}
    override fun pause() {}
    override fun resume() {}
    override fun saveState(path: String): Boolean = false
    override fun loadState(path: String): Boolean = false
    override fun shutdown() { nativeLoaded = false }
}
