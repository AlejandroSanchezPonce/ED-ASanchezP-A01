#include <iostream>
#include "SortClass.h"

void SortClass::selection(int v[]) {
	for (int i = 0; i < sizeof(v) - 1; i++){
		int less = i;
		for (int j = i + 1; j < sizeof(v); j++){
			if (v[j] < v[less]){
				less = j;
			}
		}if (i != less) {
			int temp = v[i];
			v[i] = v[less];
			v[less] = temp;
		}
	}
}
void SortClass::insertion(int v[]) {
	for (int i = 1; i < sizeof(v); i++) {
		int temp = v[i];
		int j = i - 1;
		while ((j >= 0) && (v[j] > temp)) {							   
			v[j + 1] = v[j];
			j--;
		}v[j + 1] = temp;
	}
}
void SortClass::bubble(int v[]) {
	for (int i = 1; i < sizeof(v); i++) {
		for (int j = 0; j < sizeof(v) - 1; j++) {
			if (v[j] > v[j + 1]) {
				int temp = v[j];
				v[j] = v[j + 1];
				v[j + 1] = temp;
			}
		}
	}
}
void SortClass::quickSort(int v[], int i, int u) {
	int ib, jb, medio;
	ib = i;
	jb = u;
	medio = v[(i + u) / 2];
	do {
		while (v[ib] < medio) {
			ib++;
		}
		while (v[jb] > medio) {
			jb--;
		}
		if (ib <= jb) {
			int temp = v[ib];
			v[ib] = v[jb];
			v[jb] = temp;
			ib++;
			jb--;
		}
	} while (ib <= jb);
	if (i < jb) {
		quickSort(v, i, jb); 
	}if (u > ib) {
		quickSort(v, u, ib);
	}
}
void SortClass::mergeSort(int v[], int i, int u) {
	if (i < u) {
		int mid = (i + u) / 2;
		mergeSort(v, i, mid);
		mergeSort(v, mid + 1, u);
		merge(v, i, u, mid);
	}
}
void SortClass::merge(int v[], int i, int u, int mid) {
	int aux[sizeof(v)];
	for (int i = i; i <= u; i++) {
		aux[i] = v[i];
	}
	int i = i;
	int j = mid + 1;
	int k = i;
	while (i <= mid && j <= u) {
		if (aux[i] <= aux[j]) {
			v[k] = aux[i];
			i++;
		}else {
			v[k] = aux[j];
			j++;
		}k++;
	}
	while (i <= mid) {
		v[k] = aux[i];
		k++;
		i++;
	}
}