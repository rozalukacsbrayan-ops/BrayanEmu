package com.brayanemu.core

/**
 * Contrato común que BrayanEmu usa para todos los motores de emulación.
 * Los cores nativos (por ejemplo, Libretro) se conectarán mediante esta capa.
 */
interface EmulatorCore {
    val id: String
    val displayName: String
    val systems: List<String>
    val supportedExtensions: List<String>

    fun initialize(systemDirectory: String)
    fun loadGame(path: String): Boolean
    fun reset()
    fun pause()
    fun resume()
    fun saveState(path: String): Boolean
    fun loadState(path: String): Boolean
    fun shutdown()
}
