#include <bits/stdc++.h>

vector<vector<long long int>> printPascal(int n) 
{
  if(n==1)
    return {{1}};
  else if(n==2)
    return {{1}, {1,1}};
  vector<vector<long long int>> triangle;
  triangle.push_back({1});
  triangle.push_back({1,1});
  for(int i=2; i<n; ++i) {
    vector<long long int> row = {1};
    for(int j=0; j<=i-2; ++j) {
      row.push_back(triangle[i-1][j]+triangle[i-1][j+1]);
    }
    row.push_back(1);
    triangle.push_back(row);
  }
  return triangle;
}
