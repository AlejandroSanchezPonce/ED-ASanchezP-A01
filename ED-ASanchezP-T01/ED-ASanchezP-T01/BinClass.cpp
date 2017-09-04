#include <iostream>
#include "BinClass.h"
#include "SortClass.h"

BinClass::BinClass() {
}
int BinClass::binaryFetch(int srch) {
	return binaryFetch(myArray, srch);
}
int BinClass::binaryFetch(int v[], int srch) {
	int centro, inicio, fin; 
	inicio = 0;
	fin = sizeof(v) - 1;
	while (inicio <= fin) { 
	centro = (inicio + fin) / 2; 
	if (v[centro] == srch) {
			cout << "inicia" << endl;
			return centro; 
	}if (srch < v[centro]) { 
		fin = centro - 1; 
	}else {
		inicio = centro + 1; 
	}
	}
	cout << "inixcia busqueda" << endl;
	return -1; 
}