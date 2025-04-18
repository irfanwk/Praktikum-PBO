// // #include <iostream>
// // using namespace std;

// // int main(){
// //     int n, x[100];
// //     int total=0, min, max, lulus=0;
    
// //     cout<<"Masukkan banyak mahasiswa: ";
// //     cin>>n;

// //     cout<<"Masukkan nilai: ";
// //     for (int i=0; i<n; i++) cin>>x[i];
// //     cout<<"ga dilooping";
// //     for (int i=0; i<n; i++){
// //         total=total+x[i];
// //     }
// //     total=total/n;

// //     max=x[0];
// //     min=x[0];
// //     for (int i=0; i<n; i++){
// //         if (max<x[i]) max=x[i];
        
// //         if (min>x[i]) min=x[i];

// //         if (x[i]>=60) lulus++;
// //     }

// //     cout<<"Rata-rata nilai: "<<total<<endl<<"Nilai tertinggi: "<<max<<endl<<"Nilai terendah: "<<min<<endl<<"Jumlah yang lulus: "<<lulus;
// // }

// #include <iostream>
// #include <string>
// using namespace std;

// int main(){
//     int matriks[10][10]={
//         {1,2,3},
//         {2,3,4},
//         {5,6,7}
//     };

//     cout<<matriks[0][1]<<endl<<matriks[2][2]<<endl;

//     string set;
//     getline(cin,set);
//     cout<<set;

//     #include <iostream>
// #include <string>

// int main() {
//     std::string str = "Hello, World!";
//     std::string sub = str.substr(7, 5);  // Start at index 7, length 5
//     std::cout << sub << std::endl;  // Outputs: World
//     return 0;
// }
    
// }


#include <iostream>
// #include <sstream>
using namespace std;

int main(){
    string noan="123.4";
    double no;

    // stringstream(noan)>>no;
    // ss>>no;
    no = stod(noan);
    cout<<no<<endl;
    // cout<<stod(noan)<<endl;

}