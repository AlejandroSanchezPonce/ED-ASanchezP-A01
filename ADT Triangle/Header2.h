
#pragma once
class Header2
{
public:

	Header2();
	Header2(double, double);
	void setArea(double);
	void setPerimetro(double);
	double getArea();
	double getPerimetro();

protected:

	double area, perimetro;
};
