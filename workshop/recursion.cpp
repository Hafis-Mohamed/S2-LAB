#include<iostream>
using namespace std;

void shownum(int n){
    if(n==0)
    return ;
    else{
        shownum(n-1);
    }
    cout<<n<<"\n";
}

int main(){
    shownum(5);
    return 0;
}
