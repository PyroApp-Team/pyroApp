package com.clara0007.pyro

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.clara0007.pyro.ui.screen.RegistrasiDamkarScreen
import com.clara0007.pyro.ui.theme.PyroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PyroTheme {
                RegistrasiDamkarScreen { nip, username, email, phoneNumber, password ->
                    Log.d("REGISTER", "NIP: $nip, Username: $username, Email: $email, Phone: $phoneNumber, Password: $password")
                    Toast.makeText(this, "Registrasi Berhasil!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun MainScreenPreview(){
    PyroTheme {
        RegistrasiDamkarScreen (
            onRegister = {nip, username, email, phoneNumber, password -> }
        )
    }
}