#pragma once
#include <iostream>
using namespace std;

class SortClass {
public:
	void selection(int v[]);
	void insertion(int v[]);
	void bubble(int v[]);
	void quickSort(int v[], int i, int u);
	void mergeSort(int v[], int i, int u);
	void merge(int v[], int i, int u, int mid);
};