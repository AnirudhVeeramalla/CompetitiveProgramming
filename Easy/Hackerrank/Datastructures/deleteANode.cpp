/*
  Delete Node at a given position in a linked list 
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* Delete(Node *head, int position)
{
  // Complete this method
    if(position==0)
    {
        Node* temp=head;
        head=head->next;
        free(temp);
    }
    else
    {
        Node* temp=head;
        int index=0;
        while(index<position-1)
        {
            temp=temp->next;
            index++;
        }
        Node* temp1=temp->next;
        temp->next=temp1->next;
        free(temp1);
    }
    return head;
}
