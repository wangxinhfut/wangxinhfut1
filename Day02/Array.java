package wangxin;

public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c[]={8,5,7,4};
int temp=0; 
for(int i=c.length-1;i>0;i--)
{
	for(int j=0;j<i;j++)
	{
		if (c[i]<c[j]){
			temp=c[i];
			c[i]=c[j];
			c[j]=temp;
		}
	}
}
	}

}
