public class circle {
    private double rad;
    private double d;
    private double dlok;
    public circle(int a)
    {
        rad = a;
        d = rad*2;
        dlok = 6.28*rad;
    }
    public circle()
    {
        rad = 1;
        d = rad*2;
        dlok = 6.28*rad;
    }
    public void Setrad(double j)
    {
        this.rad = j;
        this.d = rad*2;
        this.dlok = 6.28*rad;

    }
    public void Setd(double b)
    {
        this.d = b;
        this.rad = d/2;
        this.dlok = rad*6.28;
    }
    public void Setdlok(double c)
    {
        this.dlok = c;
        this.rad = dlok/6.28;
        this.d = rad*2;
    }
    public void rez()
    {
        String radf = String.format("%.2f", rad);
        String df = String.format("%.2f", d);
        String dlokf = String.format("%.2f", dlok);

        System.out.println ("Your circle:") ;
        System.out.println("rad="+radf+"; d="+df+"; dlok="+dlokf);
    }
}
