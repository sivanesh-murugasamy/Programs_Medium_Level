
//sort the given array in the order where all the odd numbers should be in the front and even numbers at back.

#include <stdio.h>

int main()
{
    int arr[10]={1,10,23,4,67,8,9,20,9,56};
    int od[10],ev[10];
    int odd,even=0;
    
    for(int i=0;i<10;i++)
    {
        if(arr[i]%2!=0)
        {
            od[odd++]=arr[i];
        }
        else
        {
            ev[even++]=arr[i];
        }
       
    }
    for(int i=0;i<10;i++)
    {
        arr[i]=od[i];
    }
    for(int i=0;i<10;i++)
    {
        arr[i+5]=ev[i];
    
    }
     for(int i=0;i<10;i++)
    {
        printf("%d ",arr[i]);
    }

    return 0;
}
