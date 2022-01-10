int countGoodSubstrings(char * s)
{
    int l=strlen(s),c=0;
    for(int i=0;i<=l-3;i++)
    {
        if(s[i]!=s[i+1] && s[i+1]!=s[i+2] && s[i]!=s[i+2])
        {
            c++;
        }
    }
    return c;
}
