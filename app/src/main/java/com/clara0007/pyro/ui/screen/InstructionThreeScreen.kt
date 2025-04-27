package com.clara0007.pyro.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.clara0007.pyro.R

@Composable
fun InstructionThreeScreen() {
    Card(
        modifier = Modifier
            .width(200.dp)
            .padding(8.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 4.dp)
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Gambar
            Image(
                painter = painterResource(id = R.drawable.fire_extinguisher3),
                contentDescription = "Fire Shield",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .padding(bottom = 8.dp)
            )
            // Deskripsi atas
            Text(
                text = "Fire & Safety Guide",
                fontSize = 12.sp,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Blue,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            // Judul
            Text(
                text = "Mengenal & Mencegah Bencana Kebakaran",
                fontSize = 16.sp,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            //Deskripsi bawah
            Text(
                text = "Kenali Cara Pencegahan",
                fontSize = 16.sp,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Blue,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            // Deskripsi
            Text(
                text = "Sebagian besar kebakaran terjadi akibat kelalaian, seperti korsleting listrik, kebocoran gas, atau kelupaan mematikan api. Untuk mencegahnya, selalu periksa instalasi listrik secara berkala dan jangan membebani stop kontak dengan terlalu banyak perangkat. Pastikan kompor, lilin, atau alat pemanas selalu dalam pengawasan saat digunakan. Simpan bahan mudah terbakar jauh dari sumber panas dan sediakan alat pemadam api ringan (APAR) di tempat strategis.Kesadaran, kewaspadaan, dan kesiapan adalah kunci utama dalam mencegah serta menghadapi kebakaran. Jangan biarkan kelalaian mengancam keselamatan!",
                fontSize = 12.sp,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Tombol navigasi
            Button (
                onClick = { /* Handle action here */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("SELANJUTNYA")
            }
        }
    }
}