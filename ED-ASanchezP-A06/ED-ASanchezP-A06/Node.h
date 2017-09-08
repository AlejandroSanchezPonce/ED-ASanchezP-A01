#pragma once
class Node {
public:
	int D;
	Node* N;

	Node();
	Node(int D, Node* N);
	int getData();
	void setData(int D);
	Node* getNext();
	void setNext(Node* N);
};