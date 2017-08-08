#pragma once
#include "Header2.h"
class Header3 :
	public Figura
{
public:
	Header3(double b, double h, double hipo, int sen, int cosen, int tan, double area, double perimeter);
	Header3(double b, double h, double hipo, int sen, int cosen, int tan);
	Header3(double b, double h, double hipo, int sen, int cosen, int tan, Header2 Header2);
	Header3(double area, double perimeter);
	Header3();

	double getb();
	double geth();
	double getHipo();
	double getSen();
	double getCsen();
	double getTan();

	void setb(double base);
	void seth(double altura);
	void sethipo(double hipo);
	void setsen(int sen);
	void setcosen(int csen);
	void settan(int tan);
protected:
	double b, h, hipo;
	int sen, csen, tan;
};
