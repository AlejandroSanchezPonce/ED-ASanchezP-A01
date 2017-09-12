#include "MyList.h"

MyList::MyList() {
	f = nullptr;
	l = nullptr;
	p = nullptr;
}
MyList::MyList(int a) {
	N* node = new N(a);
	f = node;
	l = node;
	node->n = nullptr;
}
bool MyList::isEmpty() {
	return f == nullptr;
}
void MyList::insertFirst(int n) {
	N* node = new N(n);
	if (isEmpty()) {           
		f = node;
		l = node;
		node->n = nullptr;
	}
	else {
		node->n = f;
		f = node;
	}
}
void MyList::insertLast(int n) {
	N* node = new N(n);
	if (isEmpty()) {          
		f = node;
		l = node;
		node->n = nullptr;
	}
	else {
		l->n = node;
		l = node;
	}
}
void MyList::deleteFirst() {
	if (!isEmpty()) {
		if (f->n == nullptr) {
			f = nullptr;
			l = nullptr;
		}
		else {
			f = f->n;
		}
	}
	cout << "The list is empty" << endl;
}
void MyList::deleteLast() {
	if (!isEmpty()) {
		if (f == l) {
			f = l = nullptr;
		}
		else {
			p = f; 
			while (p->n != l) {
				p = p->n;
			}
			l = p;
			l->n = nullptr;
			p = nullptr;
		}
	}
}