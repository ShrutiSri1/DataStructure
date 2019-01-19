#include<iostream>

#define SIZE 10
using namespace std;
struct stack
{
	int s[SIZE];
	int top;
};
void push(stack *st)
{
	int element;
	cout<<"enter the value to be inserted";
	cin>>element;
	if(st->top==SIZE-1)//stack is full condition
	{
		cout<<"\nSTACK IS FULL\n";
		return;//return to the calling position
		
	}
	st->top++;
	st->s[st->top]=element;
	
}
void pop(stack *st)
{
	int n;
	if(st->top==-1)//stack empty condition
	{
		cout<<"\nstack is empty\n";
		return;
	}
	n=st->s[st->top];
	st->top--;
	cout<<"The element deleted is"<<n<<endl;
	
	
}
void display(stack *st)
{
	if(st->top==-1)
	{
		cout<<"\nstack is empty\n";
	
	}
	for(int i=st->top;i>=0;i--)
	{
		cout<<st->s[i]<<endl;
	}
}
int main()
{
	stack st;
	st.top=-1;
	int ch;
	do
	{
		cout<<"\n1-PUSH\n2-POP\n3DISPLAY\n4 EXIT\nENTER YOUR CHOICE";
	cin>>ch;
	switch(ch)
	{
		case 1:
			push(&st);
			break;
		case 2:
			pop(&st);
			break;
		case 3:
			display(&st);
			break;
			
	}
}while(ch!=4);
	return 0;
}
