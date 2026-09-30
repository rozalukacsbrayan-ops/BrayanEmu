package com.brayanemu.core

/**
 * Catálogo de cores que BrayanEmu puede presentar al frontend.
 *
 * Los binarios nativos no se incluyen automáticamente: cada core debe
 * integrarse respetando su licencia y sus requisitos de BIOS/system files.
 */
object CoreRegistry {
    val cores = listOf(

        CoreDescriptor("virtual-boy", "Virtual Boy", listOf("Nintendo Virtual Boy"), listOf("vb"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("pokemon-mini", "Pokémon mini", listOf("Pokémon mini"), listOf("min"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("wiiu", "Wii U", listOf("Nintendo Wii U"), listOf("wud", "wux", "rpx"), "Open source backend", CoreStatus.EXPERIMENTAL),
        CoreDescriptor("switch", "Nintendo Switch", listOf("Nintendo Switch"), listOf("nsp", "xci", "nro"), "Open source backend", CoreStatus.EXPERIMENTAL),
        CoreDescriptor("sg-1000", "SG-1000", listOf("Sega SG-1000"), listOf("sg"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("master-system", "Master System", listOf("Sega Master System"), listOf("sms"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("genesis", "Mega Drive / Genesis", listOf("Sega Mega Drive", "Genesis"), listOf("md", "gen", "smd"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("sega-cd", "Sega CD / Mega-CD", listOf("Sega CD", "Mega-CD"), listOf("cue", "bin", "chd"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("sega-32x", "Sega 32X", listOf("Sega 32X"), listOf("32x", "bin"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("game-gear", "Game Gear", listOf("Sega Game Gear"), listOf("gg"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("saturn", "Sega Saturn", listOf("Sega Saturn"), listOf("cue", "bin", "chd"), "Open source backend", CoreStatus.EXPERIMENTAL),
        CoreDescriptor("dreamcast", "Dreamcast", listOf("Sega Dreamcast"), listOf("cdi", "gdi", "chd"), "Open source backend", CoreStatus.EXPERIMENTAL),
        CoreDescriptor("ps3", "PlayStation 3", listOf("PlayStation 3"), listOf("iso", "pkg"), "Open source backend", CoreStatus.EXPERIMENTAL),
        CoreDescriptor("xbox360", "Xbox 360", listOf("Xbox 360"), listOf("iso", "xex"), "Open source backend", CoreStatus.EXPERIMENTAL),
        CoreDescriptor("neo-geo", "Neo Geo", listOf("Neo Geo"), listOf("zip"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("neo-geo-cd", "Neo Geo CD", listOf("Neo Geo CD"), listOf("cue", "bin", "chd"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("neo-geo-pocket", "Neo Geo Pocket", listOf("Neo Geo Pocket"), listOf("ngp"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("neo-geo-pocket-color", "Neo Geo Pocket Color", listOf("Neo Geo Pocket Color"), listOf("ngc"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("atari-5200", "Atari 5200", listOf("Atari 5200"), listOf("a52"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("atari-7800", "Atari 7800", listOf("Atari 7800"), listOf("a78"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("atari-lynx", "Atari Lynx", listOf("Atari Lynx"), listOf("lnx"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("atari-jaguar", "Atari Jaguar", listOf("Atari Jaguar"), listOf("j64", "jag"), "Open source backend", CoreStatus.EXPERIMENTAL),
        CoreDescriptor("pc-engine", "PC Engine / TurboGrafx-16", listOf("PC Engine", "TurboGrafx-16"), listOf("pce"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("pc-engine-cd", "PC Engine CD", listOf("PC Engine CD"), listOf("cue", "bin", "chd"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("wonderswan", "WonderSwan", listOf("WonderSwan"), listOf("ws"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("wonderswan-color", "WonderSwan Color", listOf("WonderSwan Color"), listOf("wsc"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("intellivision", "Intellivision", listOf("Mattel Intellivision"), listOf("int"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("vectrex", "Vectrex", listOf("Vectrex"), listOf("vec"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("channel-f", "Fairchild Channel F", listOf("Fairchild Channel F"), listOf("bin"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("bally-astrocade", "Bally Astrocade", listOf("Bally Astrocade"), listOf("bin"), "Open source backend", CoreStatus.READY_FOR_INTEGRATION),
        CoreDescriptor("n-gage", "Nokia N-Gage", listOf("N-Gage"), listOf("ngage", "jar"), "Device-specific backend", CoreStatus.EXPERIMENTAL),

        CoreDescriptor(
            "bluemsx", "blueMSX",
            listOf("ColecoVision", "MSX", "SG-1000"),
            listOf("rom", "col", "sg", "sc", "cas", "dsk", "m3u"),
            "GPLv2", CoreStatus.READY_FOR_INTEGRATION
        ),
        CoreDescriptor(
            "o2em", "O2EM",
            listOf("Magnavox Odyssey²", "Philips Videopac+"),
            listOf("bin", "rom"),
            "Open source", CoreStatus.READY_FOR_INTEGRATION
        ),
        CoreDescriptor(
            "nestopia", "Nestopia",
            listOf("NES / Famicom"),
            listOf("nes", "fds"),
            "Open source", CoreStatus.READY_FOR_INTEGRATION
        ),
        CoreDescriptor(
            "snes9x", "Snes9x",
            listOf("Super Nintendo / SNES"),
            listOf("sfc", "smc"),
            "Open source", CoreStatus.READY_FOR_INTEGRATION
        ),
        CoreDescriptor(
            "mgba", "mGBA",
            listOf("Game Boy", "Game Boy Color", "Game Boy Advance"),
            listOf("gb", "gbc", "gba"),
            "MPL-2.0", CoreStatus.READY_FOR_INTEGRATION
        ),
        CoreDescriptor(
            "pcsx-rearmed", "PCSX ReARMed",
            listOf("PlayStation"),
            listOf("bin", "cue", "iso", "pbp", "chd"),
            "GPL", CoreStatus.READY_FOR_INTEGRATION
        ),
        CoreDescriptor(
            "ppsspp", "PPSSPP",
            listOf("PlayStation Portable"),
            listOf("iso", "cso", "chd"),
            "GPL", CoreStatus.READY_FOR_INTEGRATION
        ),

        CoreDescriptor(
            "vita3k", "Vita3K",
            listOf("PlayStation Vita"),
            listOf("pkg", "zip", "vpk"),
            "Open source", CoreStatus.EXPERIMENTAL
        ),
        CoreDescriptor(
            "xbox", "xemu / Xbox",
            listOf("Xbox (original)"),
            listOf("iso", "xiso"),
            "Open source project", CoreStatus.EXPERIMENTAL
        ),
        CoreDescriptor(
            "nintendo-color-tv-game", "Nintendo Color TV-Game",
            listOf("Color TV-Game"),
            listOf("rom"),
            "System-specific emulator required", CoreStatus.EXPERIMENTAL
        ),
        CoreDescriptor(
            "play", "Play!",
            listOf("PlayStation 2"),
            listOf("iso", "chd"),
            "GPL-compatible project license", CoreStatus.EXPERIMENTAL
        )
    )
}
