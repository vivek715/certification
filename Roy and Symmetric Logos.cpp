#include<iostream>
using namespace std;
int main()
{
 int t;
 
cin >> t;
 
while(t--)
{
 
int n;
 
cin >>n;
 
// please use char[][] instead of int[][] becouse of non seperated inputs
 
char a[n][n];
 
for(int i=0;i<n;i++) 
{
for(int j=0;j<n;j++)
{
 
cin >> a[i][j];
 
}
 
}
 
bool flag = 1;
 
for(int i=0;i<n;i++)
{
 
if(flag == 0)
 break;
 
for(int j=0;j<n;j++)
{
 
if((a[i][j] != a[i][n-1-j]) || (a[i][j] != a[n-1-i][j]))
{
 
flag = 0;
 
break;
 
}
 
}
 
}
if(flag==1)
 
cout <<"YES" <<endl;
 
else
 
cout <<"NO" <<endl;
 
}
 
}
 
