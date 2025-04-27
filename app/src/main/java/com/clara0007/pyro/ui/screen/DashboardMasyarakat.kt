package com.clara0007.pyro.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Article
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Report
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.clara0007.pyro.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardMasyarakat() {
    var selectedItem by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { /* Bisa dikosongkan atau diisi teks jika perlu */ },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Menu, contentDescription = "Menu")
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Notifications, contentDescription = "Notifikasi")
                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color.Black,
                    navigationIconContentColor = Color.Black,
                    actionIconContentColor = Color.Black
                )
            )
        },
        bottomBar = {
            NavigationBar (
                containerColor = Color.White,
                contentColor = Color(0xFF2C2C2C)
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Dashboard, contentDescription = "Dashboard") },
                    selected = selectedItem == 1,
                    onClick = { selectedItem = 1 },
                    label = { Text("Dashboard") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color(0xFFE95502), // Orange pas selected
                        unselectedIconColor = Color(0xFF2C2C2C), // Abu pas unselected
                        selectedTextColor = Color(0xFFE95502),
                        unselectedTextColor = Color(0xFF2C2C2C),
                        indicatorColor = Color.Transparent
                    )
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Report, contentDescription = "SOS") },
                    selected = selectedItem == 0,
                    onClick = { selectedItem = 0 },
                    label = { Text("SOS") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color(0xFFE95502), // Orange pas selected
                        unselectedIconColor = Color(0xFF2C2C2C), // Abu pas unselected
                        selectedTextColor = Color(0xFFE95502),
                        unselectedTextColor = Color(0xFF2C2C2C),
                        indicatorColor = Color.Transparent
                    )
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Article, contentDescription = "Berita") },
                    selected = selectedItem == 2,
                    onClick = { selectedItem = 2 },
                    label = { Text("Berita") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color(0xFFE95502), // Orange pas selected
                        unselectedIconColor = Color(0xFF2C2C2C), // Abu pas unselected
                        selectedTextColor = Color(0xFFE95502),
                        unselectedTextColor = Color(0xFF2C2C2C),
                        indicatorColor = Color.Transparent
                    )
                )
            }

        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .background(Color.White)
                    .padding(horizontal = 16.dp)
            ) {
                if (selectedItem == 1) {
                    // Konten untuk Dashboard
                } else if (selectedItem == 0) {
                    // Konten untuk SOS
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("Anda yakin untuk menggunakan sos?", style = MaterialTheme.typography.titleMedium)
                        Spacer(modifier = Modifier.height(16.dp))
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            label = { Text("Jenis Kejadian:") },
                            modifier = Modifier.fillMaxWidth()
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            label = { Text("Input Lokasi Kejadian:") },
                            modifier = Modifier.fillMaxWidth()
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            Button(onClick = {}, colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                                border = BorderStroke(1.dp, Color(0xFFE95502))) {
                                Text("Tidak", color = Color(0xFFE95502),
                                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp))
                            }
                            Button(onClick = {}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE95502))) {
                                Text("Ya", color = Color.White,
                                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp))
                            }
                        }
                    }
                } else if (selectedItem == 2) {
                    // Konten untuk Berita
                }

                // Spasi dan mungkin teks indikator
                Spacer(modifier = Modifier.height(32.dp))

                Box(
                    modifier = Modifier.fillMaxSize(), // Membuat Box mengisi seluruh layar
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painterResource(id = R.drawable.logo_pyro_transparan),
                            contentDescription = "Logo Pyro",
                            modifier = Modifier.alpha(0.5f)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                    }
                }
            }
        }
    )
}
