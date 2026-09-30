# Cores de BrayanEmu — v0.2

BrayanEmu ahora tiene una capa `EmulatorCore` y un `CoreRegistry`.

## Cores elegidos para la primera integración

- **blueMSX** → ColecoVision. El core libretro de blueMSX soporta ColecoVision y usa archivos de sistema `Machines/` y `Databases/`.
- **O2EM** → Magnavox Odyssey² / Philips Videopac+.
- **Nestopia** → NES/Famicom.
- **Snes9x** → SNES.
- **mGBA** → Game Boy / Game Boy Color / Game Boy Advance.
- **PCSX ReARMed** → PlayStation.
- **PPSSPP** → PSP.
- **Play!** → PlayStation 2 (experimental).

La documentación de Libretro confirma que blueMSX soporta ColecoVision y que O2EM cubre
Odyssey²/Videopac+. Los cores de Libretro se pueden compilar para Android mediante NDK,
aunque no todos usan exactamente el mismo sistema de build.

## Siguiente paso técnico

1. Compilar cada core para las ABI Android necesarias (`arm64-v8a`, etc.).
2. Colocar las bibliotecas `.so` bajo `app/src/main/jniLibs/<ABI>/`.
3. Implementar JNI para el ciclo:
   initialize → load → run → video/audio → input → save/load state.
4. Crear un renderer de vídeo y salida de audio de baja latencia.
5. Añadir detección de ROM por extensión y selección automática del core.
6. Añadir directorio `system/` para BIOS y archivos de sistema cuando sean necesarios.

No se incluyen ROMs ni BIOS propietarios.


## v0.3 — Nuevos sistemas planificados

- **PlayStation Vita** → Vita3K, experimental. La integración requerirá un backend específico; no se asume compatibilidad automática con Libretro.
- **Xbox original** → xemu, experimental. Se tratará como backend específico y no como un simple core genérico.
- **Nintendo Color TV-Game** → backend específico por modelo. Color TV-Game engloba varias máquinas diferentes, por lo que no se puede tratar como una única consola compatible.

Estos registros son preparatorios: todavía no incluyen los binarios de los emuladores ni ROMs/firmware.


## v0.4 — Catálogo ampliado

Añadidos de golpe:
- Nintendo: Virtual Boy, Pokémon mini, Wii U, Switch.
- Sega: SG-1000, Master System, Mega Drive/Genesis, Sega CD, 32X, Game Gear, Saturn, Dreamcast.
- Sony: PlayStation 3.
- Microsoft: Xbox 360.
- SNK: Neo Geo, Neo Geo CD, Neo Geo Pocket, Neo Geo Pocket Color.
- Atari: 5200, 7800, Lynx, Jaguar.
- NEC: PC Engine/TurboGrafx-16, PC Engine CD.
- Bandai: WonderSwan, WonderSwan Color.
- Mattel: Intellivision.
- Vectrex, Fairchild Channel F, Bally Astrocade y Nokia N-Gage.

Los sistemas marcados `EXPERIMENTAL` requieren backends específicos y no deben considerarse
funcionales hasta completar la integración nativa.
