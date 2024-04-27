// 
// Decompiled by Procyon v0.5.36
// 

class updateDate
{
    static int yr;
    static int mn;
    static int dts;
    
    public void dateSetting(final int yr, final int mn, final int dts) {
        updateDate.yr = yr;
        updateDate.mn = mn;
        updateDate.dts = dts;
    }
    
    public void dateUpdated(String trim) {
        trim = trim.trim();
        final int index = trim.indexOf("/");
        final int int1 = Integer.parseInt(trim.substring(0, index));
        final int n = index + 1;
        final int lastIndex = trim.lastIndexOf("/");
        int n2 = 0;
        if (index == 1 && lastIndex == 3) {
            n2 = Integer.parseInt(trim.substring(n, 3));
        }
        else if (index == 2 && lastIndex == 4) {
            n2 = Integer.parseInt(trim.substring(n, 4));
        }
        else if (index == 1 && lastIndex == 4) {
            n2 = Integer.parseInt(trim.substring(n, 4));
        }
        else if (index == 2 && lastIndex == 5) {
            n2 = Integer.parseInt(trim.substring(n, 5));
        }
        final int length = trim.length();
        this.dateSetting(Integer.parseInt(trim.substring(length - 4, length)), n2, int1);
    }
    
    static {
        updateDate.yr = 0;
        updateDate.mn = 0;
        updateDate.dts = 0;
    }
}
