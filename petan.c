#include <stdio.h>

 int main()
{
    int hello,x,y;
  printf("hello programmar");
  scanf("%d",&hello);
  for(y=0; y<=hello; y++){
    for(x=0; x<=y; x++){
        printf("@");
    }
    printf("\n");
  }
return 0;
}
