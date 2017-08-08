#include "Header3.h"



Header3::Header3(){
	this->radio = 0.0;
}

Header3::Header3(double area, double perimeter, double radio){
	this->area = area;
	this->perimetro = perimeter;
	this->radio = radio;
}

Header3::Header3(Figura figura, double radio){
	this->area = figura.getArea();
	this->perimetro = figura.getPerimetro();
	this->radio = radio;
}

Header3::Header3(double radio){
	this->radio = radio;
}

double Header3::getRadio(){
	return this->radio;
}

void Header3::setRadio(double radio){
	this->radio = radio;
}