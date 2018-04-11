import java.util.Scanner;
import static java.lang.System.out;

class CommandLine
{
 static void evanOdd(int...ar)
  {
    int countOdd=0;
    int countEvan=0;
    for(int list:ar)
     {
       if(list%2==0)
        countEvan++;
       else
        countOdd++;
     }
   out.println("NUMBER OF EVAN IS : "+countEvan+"\nNUMBER OF ODD IS : "+countOdd);
  } 

  static void search(int...ar)
  {
    Scanner sc=new Scanner(System.in);  
    out.println("ETER NUMBER TO BE SEARCH");
    int var=sc.nextInt();
    for(int list:ar)
     if(var==list)
      out.println("\nSEARCHED NUMBER: "+list);
    
  } 

 static void order(int...ar)
  {
   int i,j,temp;
  for(j=0;j<ar.length;j++)
   for(i=0;i<ar.length-1;i++)
      {
       if(ar[i]>ar[i+1])
   	 {
	  temp=ar[i];
	  ar[i]=ar[i+1];
	  ar[i+1]=temp;
  	  }
     }
out.println("INCREASING ORDER IS");
  for(int list:ar)
    out.print(list+" ");


for(j=0;j<ar.length;j++)
   for(i=0;i<ar.length-1;i++)
      {
       if(ar[i]<ar[i+1])
   	 {
	  temp=ar[i];
	  ar[i]=ar[i+1];
	  ar[i+1]=temp;
  	  }
     }
  out.println("\nDECREASING ORDER IS");
  for(int list:ar)
   out.print(list+" ");
 
 }
  
 static void evanOddOrder(int...ar)
  {
    int i,j,temp;
  for(j=0;j<ar.length;j++)
   for(i=0;i<ar.length-1;i++)
      {
       if(ar[i]>ar[i+1])
   	 {
	  temp=ar[i];
	  ar[i]=ar[i+1];
	  ar[i+1]=temp;
  	  }
     }
  out.println("EVAN NUMBER IN ASCENDING ORDER");
   for(int list:ar)
    if(list%2==0)
     {
      out.print(list+" ");
     }
  out.println("\nODD NUMBER IN DECENDING ORDER");
    for(int list:ar)
      if(list%2!=0)
     out.print(list+" ");
}
  
 static void sumVarArg(int...ar)
  {
   int sum=0;
    for(int list:ar)
     sum=sum+list;
  out.println("SUM OF ELEMENT IS: "+sum);

  }


}  //end of class CommandLine

class Main
{
   public static void main(String...ar)
   {
     Scanner sc=new Scanner(System.in);
     
     boolean repeatSwitch; 
   do{ 
	out.println("\nENTER TO SELECT CASES");
       int select=sc.nextInt();
    switch(select)
     {
      case 1:
         CommandLine.evanOdd(1,2,3,4,5,6,7,8,9,10,11,22);
       break;
      case 2:
  	CommandLine.search(1,2,3,5,7,8,68,2,6,89,99,11);
	break;
      case 3:
        CommandLine.order(3,2,6,8,2,84,7,12,45,13,31,5,9,0);
	break;
      case 4:
        CommandLine.evanOddOrder(3,2,6,8,2,84,7,12,45,13,31,5,9,0);
        break;
      case 5:
        CommandLine.sumVarArg(3,2,6,8,2,84,7,12,45,13,31,5,9,0);
        break;
       
	}// end of switch case
      out.println("\nENETR 'true' FOR REPEAT CASES OTHERWISE 'false'");
       repeatSwitch=sc.nextBoolean();
     }while(repeatSwitch!=false);
  }

}


