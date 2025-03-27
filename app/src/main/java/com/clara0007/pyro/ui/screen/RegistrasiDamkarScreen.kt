package com.clara0007.pyro.ui.screen

import android.util.Patterns
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.clara0007.pyro.R

@Composable
fun RegistasiDamkarScreen(onRegister: (String, String, String, String, String) -> Unit) {
    var nip by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    var errorMessage by remember { mutableStateOf("") }

    var selectedTab by remember { mutableIntStateOf(0) }

    var selectedRole by remember { mutableStateOf("Damkar") }

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp).verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_pyro_transparan),
            contentDescription = "Logo PYRO",
            modifier = Modifier
                .width(130.dp)
                .height(130.dp)
        )

        Spacer(modifier = Modifier.height(5.dp))

        TabRow(
            selectedTabIndex = selectedTab,
            modifier = Modifier.fillMaxWidth(),
            containerColor = Color.Transparent, // Buat background transparan
            contentColor = MaterialTheme.colorScheme.primary // Warna teks/tab
        ) {
            Tab(
                selected = selectedTab == 0,
                onClick = { selectedTab = 0 },
                text = { Text("Buat Akun") }
            )
            Tab(
                selected = selectedTab == 1,
                onClick = { selectedTab = 1 },
                text = { Text("Login") }
            )
        }

        Spacer(modifier = Modifier.height(35.dp))

        // Continue with Google
        OutlinedButton(
            onClick = { /* Handle Google Sign In */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            border = BorderStroke(1.dp, Color.Blue),
            shape = RoundedCornerShape(24.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "Google Icon",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Continue with Google")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Or dengan Garis Pembatas
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            HorizontalDivider(
                color = Color.Gray,
                modifier = Modifier
                    .weight(1f)
                    .height(1.dp)
            )
            Text(
                text = "Or",
                modifier = Modifier.padding(horizontal = 8.dp),
                color = Color.Gray
            )
            HorizontalDivider(
                color = Color.Gray,
                modifier = Modifier
                    .weight(1f)
                    .height(1.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Pilihan Damkar & Masyarakat
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    width = 1.dp,
                    color = Color.LightGray,
                    shape = RoundedCornerShape(24.dp)
                )
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly, // Sejajar dan rata tengah
            verticalAlignment = Alignment.CenterVertically
        ) {
            // RadioButton Damkar
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.clickable { selectedRole = "Damkar" }
            ) {
                RadioButton(
                    selected = selectedRole == "Damkar",
                    onClick = { selectedRole = "Damkar" }
                )
                Text(text = "Damkar")
            }

            // RadioButton Masyarakat
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.clickable { selectedRole = "Masyarakat" }
            ) {
                RadioButton(
                    selected = selectedRole == "Masyarakat",
                    onClick = { selectedRole = "Masyarakat" }
                )
                Text(text = "Masyarakat")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

            // Input NIP
            OutlinedTextField(
                value = nip,
                onValueChange = { nip = it },
                label = { Text("NIP") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Input Username
            OutlinedTextField(
                value = username,
                onValueChange = { username = it },
                label = { Text("Username") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            //Input Email
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                leadingIcon = { Icon(Icons.Default.Email, contentDescription = null) },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Email
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Input Nomor Telepon
            OutlinedTextField(
                value = phoneNumber,
                onValueChange = { phoneNumber = it },
                label = { Text("Nomor Telepon") },
                leadingIcon = { Icon(Icons.Default.Phone, contentDescription = null) },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Phone
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Input Password
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Password
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Input Konfirmasi Password
            OutlinedTextField(
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                label = { Text("Konfirmasi Password") },
                leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Password
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(45.dp))

            // Menampilkan error kalau ada
            if (errorMessage.isNotEmpty()) {
                Text(
                    text = errorMessage,
                    color = MaterialTheme.colorScheme.error,
                    style = MaterialTheme.typography.bodySmall
                )
                Spacer(modifier = Modifier.height(8.dp))
            }

            // Tombol Register
            Button(
                onClick = {
                    errorMessage =
                        validateForm(nip, username, email, phoneNumber, password, confirmPassword)
                    if (errorMessage.isEmpty()) {
                        onRegister(nip, username, email, phoneNumber, password)
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE95502), // Warna Background
                    contentColor = Color.White, // Warna Teks
                ),
                modifier = Modifier.fillMaxWidth().height(48.dp)
            ) {
                Text("Register")
            }
        }
    }

    // Fungsi validasi
    private fun validateForm(
        nip: String,
        username: String,
        email: String,
        phoneNumber: String,
        password: String,
        confirmPassword: String
    ): String {
        if (nip.isBlank()) return "NIP tidak boleh kosong"
        if (username.isBlank()) return "Username tidak boleh kosong"
        if (email.isBlank() || !Patterns.EMAIL_ADDRESS.matcher(email)
                .matches()
        ) return "Format email tidak valid"
        if (phoneNumber.isBlank() || phoneNumber.length < 10) return "Nomor telepon tidak valid"
        if (password.isBlank()) return "Password tidak boleh kosong"
        if (confirmPassword.isBlank()) return "Konfirmasi password tidak boleh kosong"
        if (password != confirmPassword) return "Password dan konfirmasi password tidak cocok"
        return ""
    }
