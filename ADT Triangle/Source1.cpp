#include "Header3.h"
Header3::Header3(double b, double h, double hipo, int sen, int cosen, int tan, double area, double perimeter){
	this->b = b;
	this->h = h;
	this->hipo = hipo;
	this->sen = sen;
	this->cosen = cosen;
	this->tan = tan;
	this->area = area;
	this->perimeter = perimeter;
}

Header3::Header3(double base, double altura, double hipotenusa, int sen, int csen, int tan){
	this->b = b;
	this->h = h;
	this->hipo = hipo;
	this->sen = sen;
	this->cosen = cosen;
	this->tan = tan;
}

Header3::Header3(double base, double altura, double hipotenusa, int sen, int csen, int tan, Header2 Header2){
	this->b = b;
	this->h = h;
	this->hipo = hipo;
	this->sen = sen;
	this->cosen = cosen;
	this->tan = tan;
	this->area = figura.getArea();
	this->perimeter = figura.getPerimeter();
}

Header3::Header3(double area, double perimeter){
	this->base = 0.0;
	this->altura = 0.0;
	this->hipotenusa = 0.0;
	this->sen = 0;
	this->csen = 0;
	this->tan = 0;
	this->area = area;
	this->perimetro = perimeter;
}

Header3::Header3(){
	this->base = 0.0;
	this->altura = 0.0;
	this->hipotenusa = 0.0;
	this->sen = 0;
	this->csen = 0;
	this->tan = 0;
}

double Header3::getb(){
	return this->b;
}

double Header3::geth(){
	return this->h;
}

double Header3::gethipo(){
	return this->hipo;
}

double Header3::getsen(){
	return this->sen;
}

double Header3::getcosen(){
	return this->cosen;
}

double Header3::gettan(){
	return this->tan;
}

void Header3::setb(double b){
	this->b = b;
}

void Header3::setAltura(double h){
	this->h = h;
}

void Header3::sethipo(double hipo){
	this->hipo = hipo;
}

void Header3::setsen(int sen){
	this->sen = sen;
}

void Header3::setcosen(int csen){
	this->cosen = cosen;
}

void Header3::settan(int tan){
	this->tan = tan;
}