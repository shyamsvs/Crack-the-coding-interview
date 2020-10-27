#include<stdio.h>
#include<vector>
#include<string>
#include<iostream>
using namespace std;

bool isUnique(){
    int i,j;
    int index;
    int hash[26] = {0};
    string s = "shyamkur";
    for(i=0;i<s.length();i++){        
        index = s[i] - 'a';
        if(hash[index] == 0){
            hash[index] = 1;
        }
        else if(hash[index] == 1){
            return false;
        }       
    }
    return true;
}

int main(){
    bool ans = isUnique();
    cout << ans << endl;
}
