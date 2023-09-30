#include<iostream>
using namespace std;

//1.main program pada c++
int main(){
    //tipe data dan variabel
    int bil1,bil2,pilih;
    float hasil;
    bool loop = true;

    //penggunaan while untuk perulangan
    while(loop){
    cout<<"\n=======PORGRAM KALKULATOR========"<<endl;
    cout<<"Masukkan bilangan pertama: ";cin>>bil1;  //input untuk c++
    cout<<"Masukkan bilangan kedua: ";cin>>bil2;
    cout<<"\n1.Penjumlahan";
    cout<<"\n2.Pengurangan";
    cout<<"\n3.Perkalian";
    cout<<"\n4.Pembagian";
    cout<<"\n\nMasukkan Pilihan Anda : ";cin>>pilih;

        //pengkondisian menggunakan if else
        if(pilih == 1){
            hasil = bil1 + bil2;
            cout<<"Hasil Penjumlahan dari "<<bil1<<" + "<<bil2<<" adalah "<<hasil<<endl; //output untuk c++
        }else if(pilih == 2){
            hasil = bil1 - bil2;
            cout<<"Hasil Penjumlahan dari "<<bil1<<" - "<<bil2<<" adalah "<<hasil<<endl;
        }else if(pilih == 3){
            hasil = bil1*bil2;
            cout<<"Hasil Penjumlahan dari "<<bil1<<" x "<<bil2<<" adalah "<<hasil<<endl;
        }else if(pilih == 4){
            hasil = bil1/bil2;
            cout<<"Hasil Penjumlahan dari "<<bil1<<" : "<<bil2<<" adalah "<<hasil<<endl;
        }else {
            cout<<"ERROR!!"<<endl;
        }
        cout<<endl;
		system("pause");
		system("cls");

    }
    return 0;
    //ini merupakan comment, dapat menggunakan double slash 
    /*atau slash dan bintang */


}