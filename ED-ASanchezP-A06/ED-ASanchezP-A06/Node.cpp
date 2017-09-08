#include<iostream>
#include "Node.h"
using namespace std;

Node::Node() {
	D = 0;
	N = NULL;
}
Node::Node(int D, Node* N) {
	D = D;
	N = N;
}
int Node::getData() {
	return D;
}
Node* Node::getNext() {
	return N;
}
void Node::setData(int D) {
	D = D;
}
void Node::setNext(Node* N) {
	N = N;
}