import java.util.HashMap;
public class decode_ways {
static HashMap<String,Integer>hm=new HashMap<String,Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	decode_ways obj =new decode_ways();
	System.out.println(obj.numDecodings("1254"));
		System.out.println(hm);
	}
	   public int numDecodings(String s) {
	   return dec(s,0,0);}
	   static int   dec(String s,int x,int si){
		   String m=x+""+si;
		   if(hm.containsKey(m)){
			   return hm.get(m);
		   }
		  
		   if(s.charAt(x)=='0'||(si!=0&&si<=s.length()&&Integer.parseInt(s.substring(x, si))>26)||si>s.length()){
			  return 0;} 
		   if(x>=s.length()||si==s.length()){
			   
			   return 1;
		   }
		   
		   int k= dec(s,si,si+1)+dec(s,si,si+2);
		   
		     hm.put(m,k);
	             	
	 return k;} 			   

//more effit way 
public int nums(String s){
int n=s.length();
int a[]=new int[n+1];
a[n]=1;
for(int i=n-1;i>=0;--i){
if(s.charAt(i)!='0'){
a[i]=a[i+1];
if(i<n-1&&(s.charAt(i)=='1'||s.charAt(i)=='2')&&s.charAt(i+1)<'7'){
a[i]=a[i]+a[i+2];	
}
}}
return a[0];}
}

