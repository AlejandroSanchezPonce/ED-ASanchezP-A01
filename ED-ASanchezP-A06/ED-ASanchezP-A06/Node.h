#pragma once
class Node {
public:
	int data;
	Node* next;

	Node();
	Node(int data, Node* next);
	int getData();
	void setData(int data);
	Node* getNext();
	void setNext(Node* next);
};