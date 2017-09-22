#include "stdafx.h"
#include "NodeDL.h"


template <typename> NodeDL::NodeDL()
{
public:
	T data;
	NodeDL* next;
	NodeDL* prev;
}


template <typename> NodeDL::~NodeDL()
{
}