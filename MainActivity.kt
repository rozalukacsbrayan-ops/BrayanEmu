package com.brayanemu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

data class Console(
    val name: String,
    val description: String,
    val available: Boolean = false
)

class BrayanEmuViewModel : ViewModel() {
    val consoles = listOf(
        Console("Nintendo Entertainment System", "NES", false),
        Console("Super Nintendo", "SNES", false),
        Console("Game Boy / Color", "GB / GBC", false),
        Console("Game Boy Advance", "GBA", false),
        Console("Nintendo 64", "N64", false),
        Console("Nintendo DS", "NDS", false),
        Console("Nintendo 3DS", "3DS", false),
        Console("GameCube", "GameCube", false),
        Console("Wii", "Wii", false),
        Console("PlayStation", "PS1", false),
        Console("PlayStation 2", "PS2", false),
        Console("PSP", "PSP", false),
        Console("Atari", "Atari", false),
        Console("ColecoVision", "ColecoVision", false),
        Console("Magnavox Odyssey²", "Odyssey²", false),
        Console("Arcade", "Arcade", false)
    )
}

@Composable
fun BrayanTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkColorScheme(
            primary = Color(0xFFFF3B30),
            onPrimary = Color.White,
            secondary = Color(0xFFFF6B61),
            background = Color(0xFF120000),
            surface = Color(0xFF240000),
            surfaceVariant = Color(0xFF3A0505),
            onSurface = Color.White
        ),
        content = content
    )
}

@Composable
fun App(vm: BrayanEmuViewModel = viewModel()) {
    var selected by remember { mutableStateOf<Console?>(null) }

    if (selected != null) {
        EmulatorScreen(selected!!, onBack = { selected = null })
    } else {
        LibraryScreen(vm.consoles) { selected = it }
    }
}

@Composable
fun LibraryScreen(consoles: List<Console>, onConsole: (Console) -> Unit) {
    Scaffold(
        containerColor = Color(0xFF120000),
        topBar = {
            Column(
                Modifier.fillMaxWidth().background(Color(0xFF8B0000)).padding(18.dp)
            ) {
                Text(
                    "BRAYANEMU",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Black
                )
                Text(
                    "4K RETRO CONSOLE",
                    color = Color(0xFFFFB3AE),
                    style = MaterialTheme.typography.labelMedium
                )
            }
        }
    ) { padding ->
        LazyColumn(
            Modifier.padding(padding).padding(horizontal = 14.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item {
                Text(
                    "SYSTEM SELECT",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Black,
                    color = Color(0xFFFF6B61),
                    modifier = Modifier.padding(vertical = 14.dp)
                )
            }
            items(consoles) { console ->
                ConsoleCard(console, onConsole)
            }
            item {
                Spacer(Modifier.height(20.dp))
                Text(
                    "VIDEO  •  AUDIO  •  INPUT  •  SAVES  •  SHADERS",
                    color = Color(0xFFFFB3AE),
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
    }
}

@Composable
fun ConsoleCard(console: Console, onClick: (Console) -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth().clickable { onClick(console) },
        colors = CardDefaults.cardColors(containerColor = Color(0xFF240000)),
        border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFF5C1111))
    ) {
        Row(
            Modifier.padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                Modifier.size(46.dp).background(
                    Color(0xFFD71920),
                    MaterialTheme.shapes.small
                ),
                contentAlignment = Alignment.Center
            ) {
                Text("▶", color = Color.White, fontWeight = FontWeight.Black)
            }
            Spacer(Modifier.width(14.dp))
            Column(Modifier.weight(1f)) {
                Text(console.name, fontWeight = FontWeight.Bold)
                Text(console.description, color = Color(0xFFFFB3AE))
            }
            Text(
                if (console.available) "READY" else "CORE",
                color = if (console.available) Color(0xFF62E6A8) else Color(0xFFFF6B61),
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun EmulatorScreen(console: Console, onBack: () -> Unit) {
    Box(
        Modifier.fillMaxSize().background(Color.Black)
    ) {
        Column(Modifier.fillMaxSize()) {
            Row(
                Modifier.fillMaxWidth().padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("‹", fontSize = MaterialTheme.typography.headlineLarge.fontSize,
                    modifier = Modifier.clickable { onBack }.padding(horizontal = 12.dp))
                Text(console.description, fontWeight = FontWeight.Bold)
            }

            Box(
                Modifier.weight(1f).fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "MOTOR DE EMULACIÓN\nPREPARADO PARA ESTE CORE",
                    color = Color.White,
                    style = MaterialTheme.typography.titleLarge
                )
            }

            Row(
                Modifier.fillMaxWidth().padding(24.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text("◀", color = Color.White)
                Text("●", color = Color.White)
                Text("▲", color = Color.White)
                Text("A", color = Color.White, fontWeight = FontWeight.Bold)
                Text("B", color = Color.White, fontWeight = FontWeight.Bold)
                Text("START", color = Color.White)
            }
        }
    }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BrayanTheme {
                App()
            }
        }
    }
}
