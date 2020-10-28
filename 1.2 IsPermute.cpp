//Sort

include<stdio.h>
#include<vector>
#include<string>
#include<iostream>
#include<algorithm>
#include<string.h>

using namespace std;

bool isPermut(){
    int i,j;
    string s1 = "shyamkur";
    string s2 = "rumkshya";
    if(s1.length() != s2.length())return false;    
    sort(s1.begin(),s1.end());
    sort(s2.begin(),s2.end());
    bool yes = s1 == s2 ? true : false;
    return yes;
}

int main(){
    bool ans = isPermut();
    cout << ans << endl;
}


//Hash

#include<stdio.h>
#include<vector>
#include<string>
#include<iostream>
#include<algorithm>
#include<string.h>

using namespace std;

bool isPermut(){
    int i,j;
    string s1 = "shyamkumay";
    string s2 = "shyamkumay";
    if(s1.length() != s2.length())return false;    
    int hash1[26] = {0};
    int hash2[26] = {0};
    int index;
    for(int i=0;i<s1.size();i++){
        index = s1[i] - 'a';
        cout << index << " ";
        hash1[index] = ++hash1[index];
    } 
    cout << endl;
    for(int i=0;i<s1.size();i++){
        index = s2[i] - 'a';
        cout << index << " ";
        hash2[index] = ++hash2[index];
    }   
    cout << endl;
    for(int i=0;i<26;i++){
        cout << hash1[i] << " ";
    }
    cout << endl;
    for(int i=0;i<26;i++){
        cout << hash2[i] << " ";
    }
    cout << endl;
    for(int i=0;i<=25;i++){
        if(hash1[i] != hash2[i]){
            return false;
        }
    }       
    return true;
}

int main(){
    bool ans = isPermut();
    cout << ans << endl;
}
