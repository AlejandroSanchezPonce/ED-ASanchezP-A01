#pragma once
#include <iostream>
using namespace std;

class FetchClass {
protected:
	int *myArray;
public:
	FetchClass();
	virtual void setArray(int v[]);
	virtual int* getArray();
	virtual int* RandArray(int s);
	virtual void showArray();
	virtual void showFetch(int p);
	virtual void showArray(int v[]);
};