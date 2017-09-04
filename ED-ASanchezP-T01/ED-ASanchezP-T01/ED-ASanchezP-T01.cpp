// ED-ASanchezP-T01.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream> 
#include "SecClass.h"
#include "BinClass.h"
#include "FetchClass.h"
#include "SortClass.h"
using namespace std;

int main()
{
	int v[] = { 6,4,1,2,3,5 };

	SecClass Vec;
	Vec.setArray(Vec.RandArray(3));
	Vec.showArray();
}

