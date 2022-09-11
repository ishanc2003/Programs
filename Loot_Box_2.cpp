#include<iostream>
#include<algorithm>
#include<vector>
#include<iomanip>

using namespace std;

double get_value(int c,vector<int> v,vector<int> w) {
	int i = w.size();
	double optimal_value = 0.0; 
	vector <pair<double, int> > ratio(i, make_pair(0.0, 0)); 
	for(size_t k = 0; k<i; k++){
	ratio[k] = make_pair(static_cast<double>(v[k]) / w[k], k);
	}
	sort(ratio.begin(), ratio.end());
	reverse(ratio.begin(), ratio.end());
	for(size_t k = 0; k < i; k++)
    {
        if(c == 0) {
            break;
    	}
    	
        int x = ratio[k].second;
 
        if(w[x] <= c) {
        	c -= w[x];
            optimal_value += static_cast<double>(v[x]);
        }
        else {
            double val = static_cast<double>(v[x])* ((static_cast<double>(c)/(w[x])));
            optimal_value += static_cast<double>(val);
            break;
        }
    }
    return static_cast<double>(optimal_value);
}

int main(){
	int n, c;
	cin>>n>>c;
	vector<int> v(n);
	vector<int> w(n);
	for(int i = 0; i<n; i++){
		cin>>v[i]>>w[i];
	}
	
	double value = get_value(c,v,w);
	std::cout << std::fixed;
    std::cout << std::setprecision(4);
	cout<<value;
}
