#include "DLList.h"
#include "NodeDL.cpp"
using namespace std;

template <typename T> class DLList {
public:
	NodeDL<T>* first;
	NodeDL<T>* last;
	NodeDL<T>* pointer;
	int length;

	DLList() {
		first = NULL;
		last = NULL;
		pointer = NULL;
		length = 0;
	}

	DLList() {
		NodeDL<T> node = new NodeDL<T>(d);
		*first = node;
		*last = node;
		length++;
	}
	bool isEmpty() {
		return length == 0;
	}
	void insertFirst(T d) {
		NodeDL<T> node = new NodeDL<T>(d);
		if (isEmpty()) {
			*first = node;
			*last = node;
		}
		else {
			node.next* = first;
			first->back = node;
			*first = node;
		}
		length++;
	}

	void insertLast(T d) {
		NodeDL<T> node = new NodeDL<T>(d);
		if (isEmpty()) {
			*first = node;
			*last = node;
		}
		else {
			node.back* = last;
			last->next = node;
			*last = node;
		}
		length++;
	}
	void deleteFirst() {
		if (!isEmpty()) {
			if (first.next == nullptr) {
				*first = nullptr;
				*last = nullptr;
			}
			else {
				*first = first->next;
				first->back = nullptr;
			}
			length--;
		}
		if (isEmpty()) {
			cout << "empty" << endl;
		}
	}
	void deleteLast() {
		if (!isEmpty()) {
			if (first.next == nullptr) {
				*first = nullptr;
				*last = nullptr;
			}
			else {
				pointer = first;
				while (pointer->next != last) {
					pointer = pointer.next;
				}
				last = pointer;
				last->next = nullptr;
				pointer = nullptr;
			}
			length--;
		}
	}
	void deleteNode(T d) {
		pointer = first;
		NodeDL<T> node = new NodeDL<T>(d);
		if (!isEmpty()) {
			if (first == last) {
				if (first.data == d) {
					deleteFirst();
				}
			}
			else {
				if (first.data == d) {
					deleteFirst();
				}
				else {
					pointer = first;
					NodeDL<T>* pointer2 = first.next.next;
					while (pointer.next != null) {
						if (pointer.next.data == n) {
							pointer.next = pointer.next.next
								pointer2 = ´pointer2.back.back;
							length--;
						}
						pointer = pointer.next;
						pointer2 = pointer2.next;
					}
				}
			}
		}
		if (isEmpty()) {
			cout << "empty" << endl;
		}
	}


	void showList() {
		pointer = first;
		cout << "first";
		for (int i = 0; i<length; i++) {
			cout << "[" << pointer.data.toString() << "]";
			pointer = pointer.next;
		}
		cout << "last";
	}
};