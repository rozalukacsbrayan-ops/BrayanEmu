# BrayanEmu v0.5 — UI

La interfaz se ha cambiado a:

- Fondo rojo oscuro.
- Barra superior roja.
- Menú de selección de sistemas con estética de consola retro compacta / game stick.
- Tarjetas de sistemas con indicadores de estado.
- Pantalla preparada para controles, vídeo, audio, guardados y shaders.

## Gráficos y shaders

BrayanEmu tendrá una capa de vídeo separada para poder incorporar:

- escalado integer
- filtros bilineales/nearest
- CRT
- scanlines
- curvature
- LCD-style shaders
- overlays

No se copian assets propietarios de RetroArch. La idea es ofrecer controles y efectos
equivalentes mediante código/recursos propios o shaders con licencias compatibles.
