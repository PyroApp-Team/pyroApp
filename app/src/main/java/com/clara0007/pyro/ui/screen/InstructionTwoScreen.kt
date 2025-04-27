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
fun InstructionTwoScreen() {
    Card(
        modifier = Modifier
            .width(200.dp)
            .padding(8.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Gambar
            Image(
                painter = painterResource(id = R.drawable.fire_extinguisher2),
                contentDescription = "Firefighters",
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
                text = "Cara Menyelamatkan Diri Saat Kebakaran",
                fontSize = 16.sp,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            //Deskripsi bawah
            Text(
                text = "Metode Penyelamatan Diri",
                fontSize = 16.sp,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Blue,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            // Deskripsi
            Text(
                text = "Ketika terjadi kebakaran, setiap detik sangat berharga. Jika berada di dalam ruangan, segera cari jalan keluar terdekat, tetapi pastikan pintu tidak panas sebelum membukanya. Jika terdapat asap tebal, merangkaklah di lantai untuk menghindari asap beracun. Gunakan kain basah untuk menutup hidung dan mulut agar pernapasan tetap aman. Jika terjebak di dalam ruangan, tutup celah pintu dengan kain basah dan segera hubungi pemadam kebakaran. Jika pakaian terbakar, segera berhenti, jatuhkan diri, dan berguling hingga api padam. Hindari penggunaan lift saat evakuasi dan tetap tenang agar bisa mengambil keputusan yang tepat.",
                fontSize = 12.sp,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Tombol navigasi
            Button(
                onClick = { /* Handle action here */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("SELANJUTNYA")
            }
        }
    }
}