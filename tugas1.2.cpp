#include <iostream>
using namespace std;

int main() {
    int array1D[20], array2D[50][50];
    int pilih, banyak, baris, kolom;
    char lanjut;

    do {
        cout << "======PROGRAM ARRAY=====" << endl;
        cout << "1.Array 1 Dimensi" << endl;
        cout << "2.Array 2 Dimensi" << endl;
        cout << "Masukkan Pilihan Anda: ";
        cin >> pilih;

        if (pilih == 1) {
            cout << "Masukkan Banyak Bilangan : ";
            cin >> banyak;
            for (int i = 0; i < banyak; i++) {
                cout << "Bilangan ke - " << i + 1 << " : ";
                cin >> array1D[i];
            }
            
            for (int i = 0; i < banyak; i++) {
                cout << "Elemen ke-" << i << ": " << array1D[i] << endl;
            }
        } else if (pilih == 2) {
            cout << "Masukkan Banyak Baris : ";
            cin >> baris;
            cout << "Masukkan Banyak Kolom : ";
            cin >> kolom;
            
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    cout << "Masukkan elemen ke [" << i << "][" << j << "] : ";
                    cin >> array2D[i][j];
                }
            }
        } else {
            cout << "ERROR" << endl;
        }
        
        cout << "Apakah Anda ingin melanjutkan (y/n)? ";
        cin >> lanjut;
    } while (lanjut == 'y' || lanjut == 'Y');

    return 0;
}
