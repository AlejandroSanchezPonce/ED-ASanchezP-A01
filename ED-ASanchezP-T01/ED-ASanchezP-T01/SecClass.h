#pragma once
#include <iostream>
#include "FetchClass.h"

class SecClass : public FetchClass {
public:
	SecClass();
	int secuencialFetch(int srch);
	static int secuencialFetch(int v[], int srch);
};