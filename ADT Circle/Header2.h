#pragma once
class Header2
{
public:
	
	Header2();
	Header2(double, double);
	void setArea(double);
	void setPerimeter(double);
	double getArea();
	double getPerimeter();

protected:
	
	double area, perimeter;
};
