#pragma once
#include <iostream>
#include "FetchClass.h"
#include "SortClass.h"

class BinClass : public FetchClass, public SortClass {
public:
	BinClass();
	int binaryFetch(int srch);
	static int binaryFetch(int v[], int srch);
};