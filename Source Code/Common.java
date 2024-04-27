import java.awt.Color;
import java.awt.Component;

// 
// Decompiled by Procyon v0.5.36
// 

public class Common
{
    public String monthFirstDateFormat(String trim) {
        trim = trim.trim();
        final int index = trim.indexOf("/");
        final int int1 = Integer.parseInt(trim.substring(0, index));
        final int n = index + 1;
        final int lastIndex = trim.lastIndexOf("/");
        int i = 0;
        if (index == 1 && lastIndex == 3) {
            i = Integer.parseInt(trim.substring(n, 3));
        }
        else if (index == 2 && lastIndex == 4) {
            i = Integer.parseInt(trim.substring(n, 4));
        }
        else if (index == 1 && lastIndex == 4) {
            i = Integer.parseInt(trim.substring(n, 4));
        }
        else if (index == 2 && lastIndex == 5) {
            i = Integer.parseInt(trim.substring(n, 5));
        }
        final int length = trim.length();
        return i + "/" + int1 + "/" + Integer.parseInt(trim.substring(length - 4, length));
    }
    
    public boolean checkIfDecimalNumber(final String s) {
        try {
            Double.parseDouble(s);
        }
        catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
    
    public boolean checkIfNumber(final String s) {
        try {
            Integer.parseInt(s);
        }
        catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
    
    public static boolean isValidEmailAddress(final String s) {
        return s.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    }
    
    public String validate(final String[][] array, final int[] array2, final Component[] array3) {
        String s = "";
        for (int i = 0; i < array.length; ++i) {
            final int n = array2[i];
            if (n == 0) {
                if (!array[i][0].trim().equals("")) {
                    s = s + array[i][0] + "\n";
                    array3[i].setBackground(Color.pink);
                }
                else {
                    array3[i].setBackground(Color.white);
                }
            }
            if (n == 1) {
                if (array[i][1].trim().equals("")) {
                    s = s + array[i][0] + " cannot be blank\n";
                    array3[i].setBackground(Color.pink);
                }
                else {
                    array3[i].setBackground(Color.white);
                }
            }
            if (n == 2) {
                if (array[i][1].trim().equals("")) {
                    s = s + array[i][0] + "  cannot be blank\n";
                    array3[i].setBackground(Color.pink);
                }
                else if (!this.checkIfNumber(array[i][1])) {
                    s = s + array[i][0] + " must be a numeric value\n";
                    array3[i].setBackground(Color.pink);
                }
                else {
                    array3[i].setBackground(Color.white);
                }
            }
            if (n == 3) {
                if (array[i][1].trim().equals("")) {
                    s = s + array[i][0] + "  cannot be blank\n";
                    array3[i].setBackground(Color.pink);
                }
                else if (!this.checkIfDecimalNumber(array[i][1])) {
                    s = s + array[i][0] + " must be a numeric value\n";
                    array3[i].setBackground(Color.pink);
                }
                else {
                    array3[i].setBackground(Color.white);
                }
            }
            if (n == 4) {
                if (array[i][1].trim().equals("")) {
                    s = s + array[i][0] + "  cannot be blank\n";
                    array3[i].setBackground(Color.pink);
                }
                else if (!this.checkIfNumber(array[i][1])) {
                    s = s + array[i][0] + " must be a numeric value\n";
                    array3[i].setBackground(Color.pink);
                }
                else if (Integer.parseInt(array[i][1]) < 1 || Integer.parseInt(array[i][1]) > 100) {
                    s = s + array[i][0] + " must be between 1 and 100 \n";
                    array3[i].setBackground(Color.pink);
                }
                else {
                    array3[i].setBackground(Color.white);
                }
            }
            if (n == 5) {
                if (array[i][1].trim().equals(array[i][2].trim())) {
                    s = s + "Please select " + array[i][0] + "\n";
                    array3[i].setBackground(Color.pink);
                }
                else {
                    array3[i].setBackground(Color.white);
                }
            }
            if (n == 6) {
                if (array[i][1].trim().equals("")) {
                    s = s + array[i][0] + "  cannot be blank\n";
                    array3[i].setBackground(Color.pink);
                }
                else if (!array[i][1].trim().equals(array[i][3].trim())) {
                    s = s + array[i][0] + " is not same as " + array[i][2] + "\n";
                    array3[i].setBackground(Color.pink);
                }
                else {
                    array3[i].setBackground(Color.white);
                }
            }
            if (n == 7) {
                if (array[i][1].trim().equals("")) {
                    s = s + array[i][0] + "  cannot be blank\n";
                    array3[i].setBackground(Color.pink);
                }
                else if (!isValidEmailAddress(array[i][1])) {
                    s = s + array[i][0] + " is not valid\n";
                    array3[i].setBackground(Color.pink);
                }
                else {
                    array3[i].setBackground(Color.white);
                }
            }
        }
        return s;
    }
}
