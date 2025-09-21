# ProfilApp - Aplikasi Profil Sederhana dengan Jetpack Compose

## Deskripsi Project
Aplikasi profil sederhana yang dibuat menggunakan Jetpack Compose untuk memenuhi tugas praktikum BAB 2. Aplikasi menampilkan informasi profil mahasiswa dengan fitur tombol interaktif Follow/Unfollow.

## Informasi Mahasiswa
- **Nama:** Filzah Mufidah
- **NIM:** 235150207111074
- **Mata Kuliah:** Pemrograman Aplikasi Perangkat Bergerak (PAPB)

## Fitur Aplikasi
1. **Tampilan Profil Lengkap**
   - Foto profil dengan bentuk lingkaran
   - Nama lengkap mahasiswa
   - Nomor Induk Mahasiswa (NIM)
   - Deskripsi singkat

2. **Tombol Interaktif**
   - Tombol Follow/Unfollow dengan state management
   - Perubahan warna tombol sesuai status
   - Interaksi real-time menggunakan Compose state

3. **Layout Responsif**
   - Desain yang centered dan rapi
   - Spacing yang konsisten antar komponen
   - Background dengan rounded corners

## Penjelasan Kode

### 1. MainActivity.kt
```kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfilAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfilScreen()
                }
            }
        }
    }
}
```
Activity utama yang menggunakan `setContent` untuk menampilkan UI Compose.

### 2. ProfilScreen Composable
```kotlin
@Composable
fun ProfilScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = Color(0xFFF5F5F5))
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Komponen UI...
    }
}
```

**Penjelasan Komponen:**
- **Column:** Layout vertikal untuk menyusun komponen dari atas ke bawah
- **Modifier.fillMaxSize():** Mengisi seluruh ukuran layar
- **Modifier.padding():** Memberikan jarak/ruang kosong
- **Modifier.background():** Memberikan warna latar belakang
- **horizontalAlignment:** Mengatur alignment horizontal (center)
- **verticalArrangement:** Mengatur arrangement vertikal (center)

### 3. Komponen Image
```kotlin
Image(
    painter = painterResource(id = R.drawable.ic_launcher_foreground),
    contentDescription = "Foto Profil Filzah Mufidah",
    modifier = Modifier
        .size(120.dp)
        .clip(CircleShape)
        .background(Color(0xFF6200EE))
)
```
- **painterResource():** Mengambil gambar dari folder drawable
- **Modifier.size():** Mengatur ukuran gambar
- **Modifier.clip(CircleShape):** Membuat gambar berbentuk lingkaran

### 4. Komponen Text
```kotlin
Text(
    text = "Filzah Mufidah",
    fontSize = 24.sp,
    fontWeight = FontWeight.Bold,
    color = Color(0xFF333333)
)
```
Menampilkan teks dengan pengaturan ukuran, ketebalan, dan warna font.

### 5. FollowButton dengan State Management
```kotlin
@Composable
fun FollowButton() {
    var isFollowed by remember { mutableStateOf(false) }
    
    Button(
        onClick = { isFollowed = !isFollowed },
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isFollowed) Color(0xFFFF5722) else Color(0xFF6200EE)
        )
    ) {
        Text(text = if (isFollowed) "Unfollow" else "Follow")
    }
}
```

**State Management:**
- **remember { mutableStateOf(false) }:** Menyimpan state tombol
- **onClick:** Event handler untuk mengubah state
- **Conditional rendering:** Mengubah teks dan warna berdasarkan state

### 6. Spacer untuk Jarak
```kotlin
Spacer(modifier = Modifier.height(16.dp))
```
Memberikan jarak vertikal antar komponen.

## Analisis Keuntungan Jetpack Compose vs XML Layout

### Keuntungan Jetpack Compose:

1. **Deklaratif Programming**
   - **Compose:** Mendeskripsikan "apa" yang ingin ditampilkan, bukan "bagaimana" cara menampilkannya
   - **XML:** Imperatif, harus mendefinisikan langkah-langkah detail

2. **Penulisan Kode yang Lebih Ringkas**
   - **Compose:** Semua UI dalam satu file Kotlin, tidak perlu file XML terpisah
   - **XML:** Memerlukan file XML + kode Kotlin untuk findViewById()

3. **State Management yang Mudah**
   - **Compose:** Built-in state management dengan `remember` dan `mutableStateOf`
   - **XML:** Harus manual update UI saat data berubah

4. **Type Safety**
   - **Compose:** Compile-time checking, mengurangi runtime errors
   - **XML:** Runtime errors lebih sering terjadi (misal: ID tidak ditemukan)

5. **Reusability**
   - **Compose:** Composable function dapat dipanggil berkali-kali dan dikombinasikan
   - **XML:** Include layout kurang fleksibel

6. **Preview yang Lebih Baik**
   - **Compose:** `@Preview` annotation untuk melihat UI tanpa menjalankan aplikasi
   - **XML:** Harus run aplikasi untuk melihat perubahan kompleks

7. **Animasi yang Mudah**
   - **Compose:** Built-in animation APIs yang sederhana
   - **XML:** Memerlukan kode yang kompleks untuk animasi

### Contoh Perbandingan:

**XML Layout (Cara Lama):**
```xml
<!-- layout.xml -->
<LinearLayout android:orientation="vertical">
    <TextView android:id="@+id/textName" />
    <Button android:id="@+id/btnFollow" />
</LinearLayout>
```
```kotlin
// Activity.kt
val textName = findViewById<TextView>(R.id.textName)
val btnFollow = findViewById<Button>(R.id.btnFollow)
textName.text = "Filzah"
btnFollow.setOnClickListener { /* logic */ }
```

**Jetpack Compose (Cara Baru):**
```kotlin
@Composable
fun ProfileScreen() {
    Column {
        Text("Filzah")
        Button(onClick = { /* logic */ }) {
            Text("Follow")
        }
    }
}
```

## Kesimpulan
Jetpack Compose memberikan pengalaman development yang lebih modern, efisien, dan maintainable dibandingkan XML layout tradisional. Dengan paradigma deklaratif dan state management yang built-in, developer dapat fokus pada logic aplikasi daripada boilerplate code.

## Cara Menjalankan
1. Buka Android Studio
2. Import project `ProfilApp_235150207111074filzahmufidah`
3. Sync project dengan Gradle
4. Jalankan aplikasi di emulator atau device fisik
