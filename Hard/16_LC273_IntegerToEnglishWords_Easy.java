class Solution {
    public String numberToWords(int num) {
      if (num == 0) {
            return "Zero";
        }

        String[] ones = {
            "", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"
        };

        String[] tens = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };

        String[] units = {
            "", "Thousand", "Million", "Billion"
        };

        String result = "";
        int i = 0;

        while (num > 0) {

            int part = num % 1000;

            if (part != 0) {

                String words = convert(part, ones, tens);

                if (i > 0) {
                    words += " " + units[i];
                }

                result = result.isEmpty()
                    ? words
                    : words + " " + result;
            }

            num = num / 1000;
            i++;
        }

        return result;
    }

    public String convert(int num, String[] ones, String[] tens) {

        String result = "";

        if (num >= 100) {
            result += ones[num / 100] + " Hundred";
            num = num % 100;

            if (num > 0) {
                result += " ";
            }
        }

        if (num >= 20) {
            result += tens[num / 10];
            num = num % 10;

            if (num > 0) {
                result += " " + ones[num];
            }
        }
        else if (num > 0) {
            result += ones[num];
        }

        return result;
    }
}
