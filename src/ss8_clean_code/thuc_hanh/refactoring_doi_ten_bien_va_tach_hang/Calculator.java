package ss8_clean_code.thuc_hanh.refactoring_doi_ten_bien_va_tach_hang;

public class Calculator {

    public static int calculate(int firstOperand , int secondOperand , char operator ) {
        switch (operator ) {
            case '+':
                return firstOperand  + secondOperand ;
            case '-':
                return firstOperand  - secondOperand ;
            case '*':
                return firstOperand  * secondOperand ;
            case '/':
                if (secondOperand  != 0)
                    return firstOperand  / secondOperand ;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
