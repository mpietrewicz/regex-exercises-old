package workshop.java.regex.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import workshop.java.regex.exercises.AnyDigitAnyNondigit;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Any digit and any non-digit test")
public class AnyDigitAndNondigitTest {


    @Nested
    @DisplayName("user1")
    class User {

        @Test
        @DisplayName("should return true for user1")
        void user_user1() {
            fail();
            assertTrue(AnyDigitAnyNondigit.USER_PATTERN.matcher("user1").matches());
        }

        @Test
        @DisplayName("should return true for user7")
        void user_user7() {
            fail();
            assertTrue(AnyDigitAnyNondigit.USER_PATTERN.matcher("user7").matches());
        }

        @Test
        @DisplayName("should return false for user")
        void user_user() {
            fail();
            assertFalse(AnyDigitAnyNondigit.USER_PATTERN.matcher("user").matches());
        }

        @Test
        @DisplayName("should return false for users")
        void user_users() {
            fail();
            assertFalse(AnyDigitAnyNondigit.USER_PATTERN.matcher("users").matches());
        }
    }


    @Nested
    @DisplayName("1VS1")
    class Vs1 {

        @Test
        @DisplayName("should return true for 1VS3")
        void vs_1vs3() {
            fail();
            assertTrue(AnyDigitAnyNondigit.VS_PATTERN.matcher("1VS3").matches());
        }

        @Test
        @DisplayName("should return true for 4VS4")
        void vs_4vs4() {
            fail();
            assertTrue(AnyDigitAnyNondigit.VS_PATTERN.matcher("4VS4").matches());
        }

        @Test
        @DisplayName("should return true for 9VS7")
        void vs_9vs7() {
            fail();
            assertTrue(AnyDigitAnyNondigit.VS_PATTERN.matcher("9VS7").matches());
        }

        @Test
        @DisplayName("should return true for 1AB3")
        void vs_1ab3() {
            fail();
            assertFalse(AnyDigitAnyNondigit.VS_PATTERN.matcher("1AB3").matches());
        }

        @Test
        @DisplayName("should return true for 4PB4")
        void vs_4pb4() {
            fail();
            assertFalse(AnyDigitAnyNondigit.VS_PATTERN.matcher("4PB4").matches());
        }

        @Test
        @DisplayName("should return true for 9MN7")
        void vs_9mn7() {
            fail();
            assertFalse(AnyDigitAnyNondigit.VS_PATTERN.matcher("9MN7").matches());
        }
    }


    @Nested
    @DisplayName("Boeing")
    class Boeing {

        @Test
        @DisplayName("should return true for Boeing 737")
        void boeing_737() {
            fail();
            assertTrue(AnyDigitAnyNondigit.BOEING_PATTERN.matcher("Boeing 737").matches());
        }

        @Test
        @DisplayName("should return true for BOEING 747")
        void boeing_747() {
            fail();
            assertTrue(AnyDigitAnyNondigit.BOEING_PATTERN.matcher("BOEING 747").matches());
        }

        @Test
        @DisplayName("should return true for boeing 777")
        void boeing_777() {
            fail();
            assertTrue(AnyDigitAnyNondigit.BOEING_PATTERN.matcher("boeing 777").matches());
        }

        @Test
        @DisplayName("should return false for boeing 147")
        void boeing_147() {
            fail();
            assertFalse(AnyDigitAnyNondigit.BOEING_PATTERN.matcher("boeing 147").matches());
        }

        @Test
        @DisplayName("should return false for Boeing 773")
        void boeing_773() {
            fail();
            assertFalse(AnyDigitAnyNondigit.BOEING_PATTERN.matcher("Boeing 773").matches());
        }

        @Test
        @DisplayName("should return false for BOEING 7U7")
        void boeing_7u7() {
            fail();
            assertFalse(AnyDigitAnyNondigit.BOEING_PATTERN.matcher("BOEING 7U7").matches());
        }
    }


    @Nested
    @DisplayName("years old")
    class Age {

        @Test
        @DisplayName("should return true for 55 years old")
        void age_55() {
            fail();
            assertTrue(AnyDigitAnyNondigit.AGE_PATTERN.matcher("55 years old").matches());
        }

        @Test
        @DisplayName("should return true for 24 years old")
        void age_24() {
            fail();
            assertTrue(AnyDigitAnyNondigit.AGE_PATTERN.matcher("24 years old").matches());
        }

        @Test
        @DisplayName("should return true for 36 years old")
        void age_36() {
            fail();
            assertTrue(AnyDigitAnyNondigit.AGE_PATTERN.matcher("36 years old").matches());
        }

        @Test
        @DisplayName("should return false for 9 years old")
        void age_9() {
            fail();
            assertFalse(AnyDigitAnyNondigit.AGE_PATTERN.matcher("9 years old").matches());
        }

        @Test
        @DisplayName("should return false for 2.5 years old")
        void age_2_5() {
            fail();
            assertFalse(AnyDigitAnyNondigit.AGE_PATTERN.matcher("2.5 years old").matches());
        }

        @Test
        @DisplayName("should return false for 32 years")
        void age_32() {
            fail();
            assertFalse(AnyDigitAnyNondigit.AGE_PATTERN.matcher("32 years").matches());
        }
    }


    @Nested
    @DisplayName("date 11-07-2019")
    class Date {

        @Test
        @DisplayName("should return true for 11-07-2019")
        void date_11_07_2019() {
            fail();
            assertTrue(AnyDigitAnyNondigit.DATE_PATTERN.matcher("11-07-2019").matches());
        }

        @Test
        @DisplayName("should return true for 22/07/2019")
        void date_22_07_2019() {
            fail();
            assertTrue(AnyDigitAnyNondigit.DATE_PATTERN.matcher("22/07/2019").matches());
        }

        @Test
        @DisplayName("should return true for 03-07-2019")
        void date_03_07_2019() {
            fail();
            assertTrue(AnyDigitAnyNondigit.DATE_PATTERN.matcher("03-07-2019").matches());
        }

        @Test
        @DisplayName("should return false for 2019-07-11")
        void date_2019_07_11() {
            fail();
            assertFalse(AnyDigitAnyNondigit.DATE_PATTERN.matcher("2019-07-11").matches());
        }

        @Test
        @DisplayName("should return false for 14/07/2018")
        void date_14_07_2018() {
            fail();
            assertFalse(AnyDigitAnyNondigit.DATE_PATTERN.matcher("14/07/2018").matches());
        }

        @Test
        @DisplayName("should return false for 22/11/2019")
        void date_22_11_2019() {
            fail();
            assertFalse(AnyDigitAnyNondigit.DATE_PATTERN.matcher("22/11/2019").matches());
        }
    }


    @Nested
    @DisplayName("name")
    class Name {

        @Test
        @DisplayName("should return true for Bob")
        void name_bob() {
            fail();
            assertTrue(AnyDigitAnyNondigit.NAME_PATTERN.matcher("Bob").matches());
        }

        @Test
        @DisplayName("should return true for Amy")
        void name_amy() {
            fail();
            assertTrue(AnyDigitAnyNondigit.NAME_PATTERN.matcher("Amy").matches());
        }

        @Test
        @DisplayName("should return true for Don")
        void name_don() {
            fail();
            assertTrue(AnyDigitAnyNondigit.NAME_PATTERN.matcher("Don").matches());
        }

        @Test
        @DisplayName("should return false for 567")
        void name_567() {
            fail();
            assertFalse(AnyDigitAnyNondigit.NAME_PATTERN.matcher("567").matches());
        }

        @Test
        @DisplayName("should return false for Bo2")
        void name_bo2() {
            fail();
            assertFalse(AnyDigitAnyNondigit.NAME_PATTERN.matcher("Bo2").matches());
        }

        @Test
        @DisplayName("should return false for 4my")
        void name_4my() {
            fail();
            assertFalse(AnyDigitAnyNondigit.NAME_PATTERN.matcher("4my").matches());
        }
    }


    @Nested
    @DisplayName("registration")
    class Registration {

        @Test
        @DisplayName("should return true for DLU12345")
        void reg_dlu12345() {
            fail();
            assertTrue(AnyDigitAnyNondigit.REG_PATTERN.matcher("DLU12345").matches());
        }

        @Test
        @DisplayName("should return true for ELW33377")
        void reg_elw33377() {
            fail();
            assertTrue(AnyDigitAnyNondigit.REG_PATTERN.matcher("ELW33377").matches());
        }

        @Test
        @DisplayName("should return true for HPB66118")
        void reg_hpb66118() {
            fail();
            assertTrue(AnyDigitAnyNondigit.REG_PATTERN.matcher("HPB66118").matches());
        }

        @Test
        @DisplayName("should return false for WA1234PL")
        void reg_wa1234pl() {
            fail();
            assertFalse(AnyDigitAnyNondigit.REG_PATTERN.matcher("WA1234PL").matches());
        }

        @Test
        @DisplayName("should return false for 11223344")
        void reg_11223344() {
            fail();
            assertFalse(AnyDigitAnyNondigit.REG_PATTERN.matcher("11223344").matches());
        }

        @Test
        @DisplayName("should return false for AABBCCDD")
        void reg_aabbccdd() {
            fail();
            assertFalse(AnyDigitAnyNondigit.REG_PATTERN.matcher("AABBCCDD").matches());
        }
    }


    @Nested
    @DisplayName("wind")
    class Wind {

        @Test
        @DisplayName("should return true for \"wind 120 NW\"")
        void wind_120_nw() {
            fail();
            assertTrue(AnyDigitAnyNondigit.WIND_PATTERN.matcher("wind 120 NW").matches());
        }

        @Test
        @DisplayName("should return true for \"wind 040 NE\"")
        void wind_040_ne() {
            fail();
            assertTrue(AnyDigitAnyNondigit.WIND_PATTERN.matcher("wind 040 NE").matches());
        }

        @Test
        @DisplayName("should return true for \"wind 220 SW\"")
        void wind_220_sw() {
            fail();
            assertTrue(AnyDigitAnyNondigit.WIND_PATTERN.matcher("wind 220 SW").matches());
        }

        @Test
        @DisplayName("should return false for \"temp 021 C\"")
        void wind_temp_021_c() {
            fail();
            assertFalse(AnyDigitAnyNondigit.WIND_PATTERN.matcher("temp 021 C").matches());
        }

        @Test
        @DisplayName("should return false for \"wind 020 15 kt\"")
        void wind_020_15_kt() {
            fail();
            assertFalse(AnyDigitAnyNondigit.WIND_PATTERN.matcher("wind 020 15 kt").matches());
        }

        @Test
        @DisplayName("should return false for \"info not available\"")
        void wind_info_not_available() {
            fail();
            assertFalse(AnyDigitAnyNondigit.WIND_PATTERN.matcher("info not available").matches());
        }
    }


    @Nested
    @DisplayName("month Jan14")
    class Month {

        @Test
        @DisplayName("should return true for Jan14")
        void month_jan14() {
            fail();
            assertTrue(AnyDigitAnyNondigit.MONTH_PATTERN.matcher("Jan14").matches());
        }

        @Test
        @DisplayName("should return true for Dec07")
        void month_dec07() {
            fail();
            assertTrue(AnyDigitAnyNondigit.MONTH_PATTERN.matcher("Dec07").matches());
        }

        @Test
        @DisplayName("should return true for Aug31")
        void month_aug31() {
            fail();
            assertTrue(AnyDigitAnyNondigit.MONTH_PATTERN.matcher("Aug31").matches());
        }

        @Test
        @DisplayName("should return false for 13Jul")
        void month_13jul() {
            fail();
            assertFalse(AnyDigitAnyNondigit.MONTH_PATTERN.matcher("13Jul").matches());
        }

        @Test
        @DisplayName("should return false for Feb2")
        void month_feb2() {
            fail();
            assertFalse(AnyDigitAnyNondigit.MONTH_PATTERN.matcher("Feb2").matches());
        }

        @Test
        @DisplayName("should return false for May2012")
        void month_may2012() {
            fail();
            assertFalse(AnyDigitAnyNondigit.MONTH_PATTERN.matcher("May2012").matches());
        }
    }


    @Nested
    @DisplayName("logged in as user")
    class Login {

        @Test
        @DisplayName("should return true for \"logged in as user JANE\"")
        void login_jane() {
            fail();
            assertTrue(AnyDigitAnyNondigit.LOGIN_PATTERN.matcher("logged in as user JANE").matches());
        }

        @Test
        @DisplayName("should return true for \"logged in as user Lola\"")
        void login_lola() {
            fail();
            assertTrue(AnyDigitAnyNondigit.LOGIN_PATTERN.matcher("logged in as user Lola").matches());
        }

        @Test
        @DisplayName("should return true for \"logged in as user PETE\"")
        void login_pete() {
            fail();
            assertTrue(AnyDigitAnyNondigit.LOGIN_PATTERN.matcher("logged in as user PETE").matches());
        }

        @Test
        @DisplayName("should return false for \"JANE\"")
        void login_jane_false() {
            fail();
            assertFalse(AnyDigitAnyNondigit.LOGIN_PATTERN.matcher("JANE").matches());
        }

        @Test
        @DisplayName("should return false for \"logged in as user BOB1\"")
        void login_bob1() {
            fail();
            assertFalse(AnyDigitAnyNondigit.LOGIN_PATTERN.matcher("logged in as user BOB1").matches());
        }

        @Test
        @DisplayName("should return false for \"LOGGED IN AS USER 1234\"")
        void login_1234() {
            fail();
            assertFalse(AnyDigitAnyNondigit.LOGIN_PATTERN.matcher("LOGGED IN AS USER 1234").matches());
        }
    }


}
