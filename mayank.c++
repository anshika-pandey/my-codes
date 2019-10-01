#include <iostream>
using namespace mayank
int digit(int n){
	if (n==0)
	{
		return 1;
	}else {
		int res =digit(n=n/10);
		return res+1;
	}
}
int main()
{
	int n;
	cin>> n;
	int ans =digit(n);
	cout<< ans;
	return 0;
}