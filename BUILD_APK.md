# Generar BrayanEmu.apk automáticamente

Este proyecto incluye un workflow de GitHub Actions en `.github/workflows/build-apk.yml`.

El workflow configura Java 17, Android SDK y Gradle 8.9 en un runner de GitHub y ejecuta:

`gradle --no-daemon :app:assembleDebug`

El APK generado se publica como artefacto con el nombre **BrayanEmu-APK**.

## Desde el móvil

1. Crea un repositorio en GitHub.
2. Sube todos los archivos de este proyecto al repositorio.
3. En GitHub abre **Actions**.
4. Ejecuta **Build BrayanEmu APK** con **Run workflow**.
5. Cuando termine correctamente, abre la ejecución y descarga el artefacto **BrayanEmu-APK**.
6. Dentro encontrarás `app-debug.apk`.

El workflow está pensado para compilar sin instalar Android SDK ni Gradle en tu teléfono. GitHub ejecuta la compilación en una máquina hospedada y permite descargar los artefactos producidos por el workflow.
