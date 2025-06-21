package handlerException;

public class CustoExcep {

	public static void main(String[] args) {

		CustoExcep obj = new CustoExcep();
		try {
			obj.divisible();
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}

	public void divisible() throws CustomException {

		int num = 5;
		if (num < 18) {
			throw new CustomException("Not eligible for vote");
		} else {
			System.out.println("Eligible for vote");
		}

	}

}
