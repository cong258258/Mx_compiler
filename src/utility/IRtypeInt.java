package utility;

public class IRtypeInt extends IRtype
{
    int bitwidth;
    public IRtypeInt(int bw)
    {
        if(bw != 1 && bw != 8 && bw != 32)
            System.out.println("bitwidth????");
        this.bitwidth = bw;
    }
}
