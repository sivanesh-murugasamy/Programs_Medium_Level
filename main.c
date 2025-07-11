
#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
};
struct Node *createNode(int value)
{
    struct Node *node=(struct Node*)malloc(sizeof(struct Node));
    node->data=value;
    node->left=NULL;
    node->right=NULL;
    return node;
}

struct Node *insertNode(struct Node *node,int value)
{
    if(node==NULL)
      return createNode(value);
    
    if(node->data>value)
    {
        node->left=insertNode(node->left,value);
    }
    else
    {
        node->right=insertNode(node->right,value);
    }
    return node;
}

void inOrder(struct Node *node)
{
    if(node!=NULL)
    {
        inOrder(node->left);
        printf("%d ",node->data);
        inOrder(node->right);
    }
}

void preOrder(struct Node *node)
{
    if(node!=NULL)
    {
        printf("%d",node->data);
        preOrder(node->left);
        preOrder(node->right);
    }
}

int main()
{
    int n,num;
    struct Node *root=NULL;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&num);
        root=insertNode(root,num);
    }
    inOrder(root);
    preOrder(root);
    

    return 0;
}