# BrayanEmu

Primer prototipo de un frontend de emulación Android modular.

## Qué incluye esta versión

- Biblioteca de sistemas.
- Interfaz oscura optimizada para paisaje.
- Pantalla de "juego" preparada para integrar un motor.
- Arquitectura inicial basada en sistemas/cores.
- Sistemas planificados:
  NES, SNES, GB/GBC, GBA, N64, NDS, 3DS, GameCube, Wii,
  PS1, PS2, PSP, Atari, ColecoVision, Odyssey² y Arcade.

## Importante

Esta versión NO contiene todavía los motores de emulación ni ROMs/BIOS.
La siguiente etapa consiste en conectar cores/emuladores compatibles
con sus respectivas licencias y APIs.

## Abrir

Abre la carpeta en Android Studio y sincroniza Gradle.
## v0.2 — Capa de cores

Se ha añadido `EmulatorCore`, `CoreDescriptor`, `CoreRegistry` y un puente JNI
preparado para cores libretro. El proyecto ya tiene definida la ruta para integrar
motores nativos reales sin acoplarlos a la interfaz de BrayanEmu.


### v0.3

Añadidos al catálogo de arquitectura:
- PlayStation Vita (Vita3K, experimental)
- Xbox original (xemu, experimental)
- Nintendo Color TV-Game (backend específico, experimental)


### v0.4 — Catálogo ampliado

Se añadieron todos los sistemas pendientes solicitados. El catálogo es modular:
cada entrada identifica su backend, extensiones y estado de integración.
