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
fun InstructionOneScreen() {
    Card (
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
                painter = painterResource(id = R.drawable.fire_extinguisher1),
                contentDescription = "Fire Extinguisher",
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
                text = "Bagaimana Cara Menggunakan Alat Pemadam Api Ringan?",
                fontSize = 16.sp,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            //Deskripsi bawah
            Text(
                text = "Pahami Tipe APAR",
                fontSize = 16.sp,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Blue,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Deskripsi
            Text(
                text = "APAR (Alat Pemadam Api Ringan) adalah alat penting untuk mengatasi kebakaran kecil sebelum menyebar. Terdapat beberapa jenis APAR dengan fungsi berbeda. APAR air efektif untuk kebakaran bahan padat seperti kayu dan kertas, tetapi tidak untuk listrik atau minyak. APAR CO₂ cocok untuk kebakaran listrik dan cairan mudah terbakar karena gasnya menghilangkan oksigen. APAR bahan kimia kering serbaguna untuk kebakaran minyak, gas, dan listrik, meski meninggalkan residu. APAR busa ideal untuk kebakaran cairan mudah terbakar karena mampu menutup permukaan api. Memahami jenis APAR dan penggunaannya dapat menyelamatkan nyawa dalam situasi darurat.",
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