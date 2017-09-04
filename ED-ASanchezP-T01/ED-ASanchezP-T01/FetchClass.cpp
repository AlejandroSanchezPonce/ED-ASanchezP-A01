#include <iostream>
#include <stdio.h>
#include "FetchClass.h"
#include <string>
using namespace std;

FetchClass::FetchClass() {
}
void FetchClass::setArray(int v[]) {
	myArray = v;
}
int* FetchClass::getArray() {
	return myArray;
}
int* FetchClass::RandArray(int s) {
	int *temp = new int[s];
	for (int i = 0; i < sizeof(temp); i++) {
		temp[i] = (int)(rand() % 100 + 1);
	}
	return temp;
}
void FetchClass::showArray() {
	showArray(myArray);
}
void FetchClass::showFetch(int p) {
	if (p >= 0) {
		std::cout << "posicion" << p << endl;
	}else {
		std::cout << "Error 404 " << endl;
	}
}
void FetchClass::showArray(int v[]) {
	for (int i = 0; i < sizeof(v); i++) {
		cout << "arreglo[" << i << "] = " << v[i];
	}
}