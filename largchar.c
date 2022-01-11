char nextGreatestLetter(char* letters, int lettersSize, char target)
{
     int x=target;int f=123,c=0;
    char s;
   for(int i=0;i<lettersSize;i++)
   {
      int y=letters[i];
       if(y>x)
       {
           if(y<f)
           {
          f=y;
           }
           c++;
       }
   }
    if(c==0)
    {
        x=0;
        for(int i=0;i<lettersSize;i++)
   {
      int y=letters[i];
       if(y>x)
       {
           if(y<f)
           {
          f=y;
           }
           c++;
       }
   }
    }
     
   s=(char)f;
    return s;

}