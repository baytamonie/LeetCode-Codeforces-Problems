#include<iostream>
#include<vector>

using namespace std;

vector <int> v;

int solution(int n, int h,vector<int> input){
    int width = 0;
    for(int i =0;i<v.size();i++){
        if(v[i]>h)
        width+=2;
        else width+=1;
    }
    return width;
}


int main(){
    int n, h;
    cin>>n>>h;
    for(int i=0;i<h;i++){
        int y;
        cin>>y;
        v.push_back(y);
    }
 cout<<solution(n,h,v);
 while(1){}
 
}