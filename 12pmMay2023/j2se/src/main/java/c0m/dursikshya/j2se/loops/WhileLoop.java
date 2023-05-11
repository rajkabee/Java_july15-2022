package c0m.dursikshya.j2se.loops;

public class WhileLoop {
	public static void main(String[] args) {
		int i;
		i=0;			//init
		while(i<5) {	//while(con)
			System.out.println(i+". While Loop");
			i++;		//iter
		}
		
		int sum=0;
		i=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("sum: "+sum);
	}
}

/*
 
 	syntax:
 	initialization;
 	while(condition){
 		things to be done;
 		iteration;
 		}
 	
 
 
 */
