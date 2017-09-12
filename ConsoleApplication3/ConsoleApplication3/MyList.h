#pragma once
#include "Node.h"

class MyList {
public:
	N* f;
	N* l;
	N* p;

	MyList();
	MyList(int a);
	bool isEmpty();
	void insertFirst(int n);
	void insertLast(int n);
	void deleteFirst();
	void deleteLast();
};