package java112.utilities;

public class MyColor {
    private String color;
    private String compare;
    private int checker;

    public MyColor()
    {
        this.color = "";
        this.compare = "";
        this.checker = 0;
    }

    public void setMyColor(String string)
    {
        this.color = string;
    }

    public String getMyColor()
    {
        return this.color;
    }

    public void setCompare(String string)
    {
        this.compare = string;
    }

    public String getCompare()
    {
        return this.compare;
    }

    public void setChecker(int check)
    {
        this.checker = check;
    }

    public int getChecker()
    {
        return this.checker;
    }

    public boolean compare(String t)
    {
        if(this.getMyColor().equals(t))
        {
            return true;
        } else {
            return false;
        }
    }

    public String compareChecker(int number)
    {
        checker = number;
        if(this.checker == 1)
        {
            return "equal";
        } else {
            return "not-equal";
        }
    }
}
