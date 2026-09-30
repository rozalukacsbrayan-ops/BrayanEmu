package com.brayanemu.core

data class CoreDescriptor(
    val id: String,
    val name: String,
    val systems: List<String>,
    val extensions: List<String>,
    val license: String,
    val status: CoreStatus
)

enum class CoreStatus {
    READY_FOR_INTEGRATION,
    NATIVE_CORE_REQUIRED,
    EXPERIMENTAL
}
