#include<iostream>
#include "Node.h"
using namespace std;

Node::Node() {
	data = 0;
	next = NULL;
}
Node::Node(int data, Node* next) {
	data = data;
	next = next;
}

int Node::getData() {
	return data;
}
Node* Node::getNext() {
	return next;
}

void Node::setData(int data) {
	data = data;
}

void Node::setNext(Node* next) {
	next = next;
}