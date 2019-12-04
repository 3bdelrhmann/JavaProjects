import java.util.Scanner;
import java.util.ArrayList;


public class TypeNumbers {
	public static void main(String[] args) {
		System.out.print("Enter your numbers list and after write each number press enter and if you need check list on this numbers write 010 and press enter");
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		ArrayList<Integer> posList = new ArrayList<Integer>();
		ArrayList<Integer> negList = new ArrayList<Integer>();
		ArrayList<Integer> zerList = new ArrayList<Integer>();
		boolean status = true;
		int even = 0;
		int odd  = 0;
		int pos  = 0;
		int neg  = 0;
		int zer  = 0;
		while(status) {
			int num = sc.nextInt();
			if (num == 3020) {
				if(nums.isEmpty()) {
					status = true;
				}
				else {
					status = false;
					for(Integer i : nums) {
						if ((i % 2) == 0) {
							even++;
							evenList.add(i);
						}else {
							odd++;
							oddList.add(i);							
						}
						if(i >= 0) {
							pos++;
							posList.add(i);
						}else {
							neg++;
							negList.add(i);
						}
						if (i==0) {
							zer++;
							zerList.add(i);
						}	
					}
					System.out.println("We have "+even+" Eve Numbers  ("+ evenList +")"  );
					System.out.println("We have "+odd+"  odd  Numbers  ("+ oddList +")"  );
					System.out.println("We have "+pos+"  pos  Numbers  ("+ posList +")"  );
					System.out.println("We have "+neg+"  neg  Numbers  ("+ negList +")"  );
					System.out.println("We have "+zer+"  zer  Numbers  ("+ zerList +")"  );

				}
			}
					
			else {
			  nums.add(num);
			  
			}
			
		}
		
		
	}
}

