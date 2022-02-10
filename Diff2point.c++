bool findPair(int arr[], int size, int n)
{
sort(arr,arr+size); 
int i=0,j=1,diff;
while(i<size && j<size)
{
   diff=arr[j]-arr[i];
   if(diff==n && i!=j)
   {
      return 1; 
   }
   else if(diff>n)
   {
     i++;  
   }
   else if(diff<n)
   {
       j++;
   }
}
return 0;
}
