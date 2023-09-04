public class Max{
	public static void main(String[] ab){

		for(int i =0;i<ab.length;i++){
		int n = Integer.parseInt(ab[i]);
		System.out.println(n);

		}
		int max = Integer.parseInt(ab[0]);
		for(int i =1;i<ab.length;i++){
			
			if(Integer.parseInt(ab[i])>max){
				max=Integer.parseInt(ab[i]);}
}
System.out.println("-------------------------------------------------------------------------------");
System.out.println("Max "+max);
}
}