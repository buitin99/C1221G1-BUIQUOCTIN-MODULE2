package thi_thu.utils;

public class Validate {
    private static final String POSITIVE_INTEGER = "^\\+*\\d+$";
    private static final String POSITIVE_DOUBLE_REGEX = "^\\+*\\d+(\\.\\d+)*$";
    private static final String FULL_NAME_REGEX = "^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*$";
    private static final String BIRTHDAY_REGEX = "^(?:0[1-9]|[12][0-9]|3[01])[-/.](?:0[1-9]|1[012])[-/.](?:19\\d{2}|20[01][0-9]|202[12])$";
    private static final String DATE_REGEX = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
    private static final String GENDER_REGEX = "^[a-zA-Z]+$";
    private static final String NGAYBAOHANH = "^[a-zA-Z]+$";
    private static final String PHAMVI = "^Toan Quoc|Quoc Te";
    private static final String TELEPHONE_NUMBER_REGEX = "^[01]\\d{9}$";
    private static final String ADDRESS_REGEX = "^\\d*(\\s\\w+)+|(\\w+)(\\s\\w+)+$";
    private static final String INPUT_REGEX = "^\\w+(\\s\\w+)*$";
    private static final String AREA_REGEX = "^([3-9]\\d+(.\\d+)?)|[1-9](\\d){2,}(.\\d+)?$";
    private static final String VILLA_ID_REGEX = "^SVVL-\\d{4}$";
    private static final String ROOM_ID_REGEX = "^SVRO-\\d{4}$";
    private static final String HOUSE_ID_REGEX = "^SVHO-\\d{4}$";
    private static final String STANDARD_NAME_REGEX = "^[A-Z]\\w+$";
    private static final String MAXIMUM_PEOPLE_REGEX = "^([1-9]|(1\\d))$";
    private static final String BOOKING_CODE_REGEX = "^B\\d{6}$";
    private static final String REGEX_BEHON_730 = "^(([1-6]?\\d?\\d)|(7[0-2]\\d)|730)$";
}
