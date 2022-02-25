//package ss8_clean_code.thuc_hanh.refactoring_doi_ten_bien_va_tach_hang;
//
//class CalculatorTest {
//
//    @Test
//    @DisplayName("Testing addition")
//    void testCalculateAdd() {
//        int a = 1;
//        int b = 1;
//        char operator  = '+';
//        int expected = 2;
//
//        int result = Calculator.calculate(a, b, operator );
//        assertEquals(expected, result);
//    }
//
//    @Test
//    @DisplayName("Testing subtraction")
//    void testCalculateSub() {
//        int a = 2;
//        int b = 1;
//        char operator  = '-';
//        int expected = 1;
//
//        int result = Calculator.calculate(a, b, operator);
//        assertEquals(expected, result);
//    }
//
//    @Test
//    @DisplayName("Testing multiplication")
//    void testCalculateMul() {
//        int a = 2;
//        int b = 2;
//        char operator = '*';
//        int expected = 4;
//
//        int result = Calculator.calculate(a, b, operator);
//        assertEquals(expected, result);
//    }
//
//    @Test
//    @DisplayName("Testing division")
//    void testCalculateDiv() {
//        int a = 6;
//        int b = 3;
//        char operator = '/';
//        int expected = 2;
//
//        int result = Calculator.calculate(a, b, operator);
//        assertEquals(expected, result);
//    }
//
//    @Test
//    @DisplayName("Testing division by zero")
//    void testCalculateDivByZero() {
//        int a = 2;
//        int b = 0;
//        char operator = '/';
//
//        assertThrows(RuntimeException.class,
//                ()-> {Calculator.calculate(a, b, operator);});
//    }
//
//    @Test
//    @DisplayName("Testing wrong operator")
//    void testCalculateWrongOperator() {
//        int a = 2;
//        int b = 0;
//        char o = '=';
//
//        assertThrows(RuntimeException.class,
//                ()-> {Calculator.calculate(a, b, o);});
//    }
//}
