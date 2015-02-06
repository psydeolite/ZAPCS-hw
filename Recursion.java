public class Recursion {
    public int fibonacci(int n) {
	if (n==0) {
	    return 0;
	}
	else if (n<3) {
	    return 1;
	}
	else {
	    return (fibonacci(n-1)+fibonacci(n-2));
	}
    }

    public int bunnyEars2(int bunnies) {
	if (bunnies==0) {
	    return 0;
	} else {
	    if (bunnies%2==0) {
		return 3+bunnyEars2(bunnies-1);
	    }
	    else {
		return 2+bunnyEars2(bunnies-1);
	    }
	}
    }

    public int strCount(String str, String sub) {
	if (str.length()<sub.length()) {
	    return 0;
	} else 
	    if ((str.substring(0,sub.length())).equals(sub)){
		return 1+strCount(str.substring(sub.length()),sub);
	    }  else {
		return strCount(str.substring(1),sub);
	    }
    }

    public int sumDigits(int n) {
	if (n<10) {
	    return n;
	} else {
	    return (n%10)+sumDigits(n/10);
	}
    }

    public String allStar(String str) {
	if (str.equals("")||str.length()==1) {
	    return str;
	} else {
	    return str.charAt(0)+"*"+allStar(str.substring(1));
	}
    }


    
    


    

}
