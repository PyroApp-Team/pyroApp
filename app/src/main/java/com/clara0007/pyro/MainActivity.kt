package com.clara0007.pyro

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.clara0007.pyro.ui.navigation.AppNavHost
import com.clara0007.pyro.ui.screen.RegistrasiMasyarakatScreen
import com.clara0007.pyro.ui.theme.PyroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PyroTheme {
                RegistrasiMasyarakatScreen(
                    onRegister = { username, email, phoneNumber, password ->
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun MainScreenPreview(){
    PyroTheme {
        RegistrasiMasyarakatScreen(onRegister = { username, email, phoneNumber, password ->})
    }
}