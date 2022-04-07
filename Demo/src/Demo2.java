public class Demo2 {
   
    int[]nums1=new int[]{1,2,9,6,5,2,5};
    int []nums2=new int[]{5,6,7,8,9,0,10};
    
    int x =nums1.length;
    int y =nums2.length;
    double []c=new double[x+y];
        for(int i=0;i<x;i++)
        {
            c[i]=nums1[i];
        }
        for(int j=x+1;j<x+y;j++)
        {
            c[j]=nums2[j-x-1];
        }
        Arrays.sort(c);
        if((x+y)%2==0)
        {
            return c[(x+y)/2];
        }
        else
        {   int o=(x+y)/2;
            int m=o+1;
           return (c[o]+c[m])/2;
        }
}

