# ProfilApp - Filzah Mufidah
**NIM: 235150207111074**

## Penjelasan Singkat Kode

Aplikasi profil ini dibangun menggunakan Jetpack Compose dengan struktur sebagai berikut:

### MainActivity.kt
- **MainActivity**: Activity utama yang mengatur tema dan Surface container
- **ProfilScreen()**: Composable utama yang menampilkan:
  - Foto profil berbentuk lingkaran dengan `ContentScale.Crop`
  - Informasi nama, NIM, dan program studi
  - Background hijau dengan sudut rounded
  - Layout menggunakan `Column` dengan alignment center
- **FollowButton()**: Composable button interaktif dengan state management menggunakan `remember` dan `mutableStateOf`

### Fitur Utama:
- Foto profil circular yang responsive
- Button Follow/Unfollow dengan perubahan warna dinamis
- Layout yang rapi dengan spacing yang konsisten
- Tema material design yang modern

## Analisis Keuntungan Compose dibandingkan XML Layout

### Keuntungan Jetpack Compose:

1. **Declarative UI**: Kode lebih mudah dibaca dan dipahami karena mendeskripsikan "apa" yang ingin ditampilkan, bukan "bagaimana" membuatnya.

2. **State Management**: Pengelolaan state lebih sederhana dengan `remember` dan `mutableStateOf`, tidak perlu findViewById atau ViewBinding.

3. **Reusability**: Composable function dapat digunakan kembali di berbagai tempat dengan mudah.

4. **Less Boilerplate**: Kode lebih ringkas, tidak perlu banyak file XML dan binding code.

5. **Real-time Preview**: Dapat melihat hasil UI langsung di Android Studio tanpa harus run aplikasi.

6. **Type Safety**: Compile-time checking yang lebih baik dibandingkan XML.

7. **Animation**: Implementasi animasi lebih mudah dan smooth.

### Contoh Perbedaan:
- **XML**: Butuh file layout terpisah + findViewById/ViewBinding + listener setup
- **Compose**: Semua dalam satu function dengan state management terintegrasi
