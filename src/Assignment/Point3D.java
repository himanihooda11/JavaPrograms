public class Point3D
{
	private float x;
	private float y;
	private float z;
	float a[]= new float[3];

	Point3D()
	{
		x=0;
		y=0;
		z=0;
	}

	Point3D(float x, float y, float z)
	{
		super(x,y);
		this.z=z;
	}

	public float getz()
	{
		return z;
	}
	
	public void setz(float z)
	{
		this.z=z;
	}

	public float[] getxyz()
	{
		return a;
	}

	public void setxyz(float x , float y, float z)
	{
		super.setxy(x,y);
		this.z=z;
		a[3]=z;
	}

	public void tostring()
	{
		System.out.println(a.toString());
	}

}