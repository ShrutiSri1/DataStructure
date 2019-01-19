#include<iostream>
#define SIZE 10
using namespace std;
int stack[SIZE],top=-1;
void push()
{int element ;
cout<<"Enter the number to be inserted\t";
cin>>element;
	if(top==SIZE-1)
	{
		cout<<"Stack is full ";
		return;
	}
	top++;
	stack[top]=element;
	
}
void pop()
{
	int n;
	if(top==-1)
	{
		cout<<"Stack is empty\n ";
		return;
	}
	n=stack[top];
	top--;
	cout<<"The pop element is"<<n;
}
void display()
{
	if(top==-1)
	{
		cout<<"Stack is empty\n";
		return;
	}
	for(int i=top;i>=0;i--)
	{
		cout<<stack[i]<<endl;
	}
}
int main()
{
	int ch;
	do
	{
		cout<<"\n1-PUSH\n2-POP\n3DISPLAY\n4 EXIT\nENTER YOUR CHOICE";
	cin>>ch;
	switch(ch)
	{
		case 1:
			push();
			break;
		case 2:
			pop();
			break;
		case 3:
			display();
			break;
			
	}
}while(ch!=4);
	return 0;
}
