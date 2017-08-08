##pragma once
#include "Header2.h"
class Header3 :
	public Figura
{
public:

	Header3();
	Header3(double, double, double);
	Header3(Header2, double);
	Header3(double);
	double getRadio();
	void setRadio(double);

protected:
	double radio;
};
