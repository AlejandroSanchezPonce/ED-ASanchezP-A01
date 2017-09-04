#include <iostream>
#include "SecClass.h"

SecClass::SecClass() {
}
int SecClass::secuencialFetch(int srch) {
	return secuencialFetch(myArray, srch);
}
int SecClass::secuencialFetch(int v[], int srch) {
	for (int i = 0; i < sizeof(v); i++) { 
		if (v[i] == srch) {
			cout << "inicia" << endl;
			return i;
		}
	}
	cout << "inicia" << endl;
	return -1;
}