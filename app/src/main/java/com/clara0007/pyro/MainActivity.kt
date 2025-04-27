package com.clara0007.pyro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clara0007.pyro.ui.screen.InstructionOneScreen
import com.clara0007.pyro.ui.screen.InstructionThreeScreen
import com.clara0007.pyro.ui.screen.InstructionTwoScreen
import com.clara0007.pyro.ui.theme.PyroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PyroTheme  {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Menampilkan tiga instruksi dalam Row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            InstructionOneScreen()
            InstructionTwoScreen()
            InstructionThreeScreen()
        }
    }
}

// Misalnya, Anda sudah memiliki fungsi untuk tampilan Instruksi:
// InstructionOneScreen(), InstructionTwoScreen(), InstructionThreeScreen()

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    PyroTheme {
        MainScreen() // Preview tampilan utama
    }
}