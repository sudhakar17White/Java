#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    
    int n;
    scanf("%d",&n);
    
    n=n%100;
    
    int k;
    scanf("%d",&k);
    
    for(int i=1;i<=k;i++)
    { 
        
        printf("%d*%d=%d\n",i,n,i*n);
        
    }

    return 0;
}
