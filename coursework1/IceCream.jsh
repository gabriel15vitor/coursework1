Scanner Scanner = new Scanner(System.in);
double result = 0.0;
int n = 0;

double scoops(int n, double price){
	double s = n;
	result = s*price;
	return result;
}

System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
String flavour = Scanner.nextLine();

switch(flavour) {
	case "v":
		System.out.println("How many scoops would you like?");
		n = Scanner.nextInt();
		if(n>3){
			System.out.println("That's too many scoops to fit in a cone.");
		}else{
			if(n<1){
				System.out.println("We don't sell just a cone.");
			}else{
				result = scoops(n, 0.62);
				System.out.printf("That will be %.2f please.", result);
				System.out.println();
			}
		}		
	break;
	
	case "c":
		System.out.println("How many scoops would you like?");
		n = Scanner.nextInt();
		if(n>3){
			System.out.println("That's too many scoops to fit in a cone.");
		}else{
			if(n<1){
				System.out.println("We don't sell just a cone.");
			}else{
				result = scoops(n, 0.35);
				System.out.printf("That will be %.2f please.", result);
				System.out.println();
			}
		}		
	break;
	
	case "s":
		System.out.println("How many scoops would you like?");
		n = Scanner.nextInt();
		if(n>3){
			System.out.println("That's too many scoops to fit in a cone.");
		}else{
			if(n<1){
				System.out.printf("We don't sell just a cone.");
			}else{
				result = scoops(n, 0.01);
				System.out.printf("That will be %.2f please.", result);
				System.out.println();
			}
		}	
    break;
	
  default:
	System.out.println("We don't have that flavour.");
}


