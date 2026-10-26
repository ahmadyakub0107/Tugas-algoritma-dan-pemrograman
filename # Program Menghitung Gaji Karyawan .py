# Program Menghitung Gaji Karyawan Berdasarkan Golongan dan Lembur

print("=== PROGRAM GAJI KARYAWAN ===")
print("Golongan yang tersedia: A, B, C")

# Input data karyawan
golongan = input("Masukkan golongan karyawan (A/B/C): ").upper()
jam_lembur = int(input("Masukkan jumlah jam lembur: "))

# Menentukan gaji pokok berdasarkan golongan
if golongan == "A":
    gaji_pokok = 5000000
elif golongan == "B":
    gaji_pokok = 6500000
elif golongan == "C":
    gaji_pokok = 9500000
else:
    print("Golongan tidak valid!")
    gaji_pokok = 0

# Menghitung gaji lembur jika golongan valid
if gaji_pokok > 0:
    if jam_lembur == 1:
        persen_lembur = 30
    elif jam_lembur == 2:
        persen_lembur = 32
    elif jam_lembur == 3:
        persen_lembur = 34
    elif jam_lembur == 4:
        persen_lembur = 36
    elif jam_lembur >= 5:
        persen_lembur = 38
    else:
        persen_lembur = 0

    # Operator aritmetika untuk menghitung gaji lembur dan total gaji
    gaji_lembur = gaji_pokok * persen_lembur / 100
    total_gaji = gaji_pokok + gaji_lembur

    # Menampilkan hasil
    print("\n=== HASIL PERHITUNGAN ===")
    print("Golongan Karyawan   :", golongan)
    print("Gaji Pokok          : Rp", f"{gaji_pokok:,.0f}")
    print("Jam Lembur          :", jam_lembur, "jam")
    print("Persentase Lembur   :", persen_lembur, "%")
    print("Gaji Lembur         : Rp", f"{gaji_lembur:,.0f}")
    print("Total Gaji          : Rp", f"{total_gaji:,.0f}")
