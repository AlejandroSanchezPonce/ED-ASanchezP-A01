#include "Header2.h"


Header2::Header2(){
	this->area = 0.0;
	this->perimeter = 0.0;
}
Header2::Header2(double area, double perimeter){
	this->area = area;
	this->perimeter = perimeter;
}
double Header2::getArea() {
	return this->area;
}
double Header2::getPerimeter() {
	return this->perimeter;
}
void Header2::setArea(double area) {
	this->area = area;
}
void Header2::setPerimeter(double perimetro) {
	this->perimetro = perimetro;
}