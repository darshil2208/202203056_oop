#include<stdio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node* next;
};
	  struct node*head=NULL;
	  

void add(int data)
{            struct node*ne;
		      ne=(struct node*)malloc(sizeof(struct node));
if(head==NULL)
head=ne;
//head->next=NULL}
else
{
	struct node *t1;
	t1=head;
	while(t1->next!=NULL)
	{
		t1=t1->next;
	}
	t1->next=ne;}
	ne->data=data;
	ne->next=NULL;
}
void inserthead(int data)
{
struct node*t=(struct node *)malloc(sizeof(struct node));

t->data=data;
t->next=head;
head=t;	
}

void insertatmid(int data,int index)
{
	struct node*y=(struct node *)malloc(sizeof(struct node));
struct node*t=head;
while(index!=1)
{
	t=t->next;
	index--;
}
y->next=t->next;
t->next=y;
y->data=data;
}
void show()
{
	struct node*temp;
	temp=head;
	while(temp!=NULL)
	{
		printf("%d ",temp->data);
		temp=temp->next;
	}
	printf("\n");
}void deletehead()
{
 head= head->next;	
}

void delind(int m)
{
struct node*p=head;
struct node *q=NULL;
while(m-->2)
{
  p=p->next;
	}	
	p->next=p->next->next;

} 

int main(){
	add (1);
	add(5);
	
	show();
	inserthead(12);
	show();	
	
	insertatmid(2005,2);
	show();
	insertatmid(20,2);
	show();
	insertatmid(25,2);
	show();
	
	deletehead();
	show();
	
	delind(2);
	show();
}


