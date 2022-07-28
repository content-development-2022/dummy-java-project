
public class Demo {

	public static void main(String[] args) {
		
		// conventional demo
		Operations add = new Addition();
		
		System.out.println("Sum is (conventional way):" + add.operate(5,  8));
		
		Operations prod = new Product();
		
		System.out.println("Product is (conventional way):" + prod.operate(5,  6));
		
		   
		// lambda demo
		Operations addLambda = (num1, num2) -> num1 + num2;
		
		System.out.println("Sum is (lambda way):" + addLambda.operate(5,  8));
		
		Operations productLambda = (num1, num2) -> num1 * num2;
		
		System.out.println("Product is (lambda way):" + productLambda.operate(5,  8));
	}

}
