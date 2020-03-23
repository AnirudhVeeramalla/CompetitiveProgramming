/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* InsertNth(Node *head, int data, int position)
{
  // Complete this method only
  // Do not write main function. 
    Node* newnode=(Node*)malloc(sizeof(Node));
    newnode->data=data;
    newnode->next=NULL;
    if(position==0)
    {
        if(head!=NULL)
        {
        newnode->next=head;
        head=newnode;
        }else
        {
            head=newnode;
        }
    }
    else
    {
        Node *temp=head;
        int index=0;
        while(index<position-1)
        {
            temp=temp->next;
            index++;
        }
        newnode->next=temp->next;
        temp->next=newnode;
    }
    return head;
}
