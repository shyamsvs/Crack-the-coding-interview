#include<stdio.h>
#include<vector>
#include<string>
#include<iostream>
#include<algorithm>
#include<string.h>

using namespace std;

void url(){
    string url = "My name is John         ";
    cout << url.size() << endl;
    int toMove = 0;
    int toMoveCopy; 
    int i;
    for(i=url.size() - 1;i>0;--i){
        if(url[i] == 32){
            continue;
        }
        else{
            break;
        }
    }
    cout << i << endl;
    for(int j=i;j>=0;--j){
        if(url[j] != 32){
            toMove++;
        }
        else{
            cout << toMove << endl;
            toMoveCopy = toMove;
            while(toMove--){
                url[j+toMove+2] = url[j+toMove];   
            }
            url[j] = '%';
            url[j+1] = '2';
            url[j+2] = '0';
            toMove = toMoveCopy + 3;
        }
    }    
    for(int i=0;i<url.size();i++){
        cout << url[i] ;
    }
    cout << endl;
}

int main(){
    url();
    return 0;
}
