class Boxweight extends Box
{
	float weight;
	Boxweight()
	{
		super();
		weight=0;
	}
	Boxweight(float width, float height, float depth, float weight)
	{
		super(width, height, depth);
		this.weight=weight;
	}
	Boxweight(float width, float height, float weight)
	{
		super(width, height);
		this.weight=weight;
	}
	float getweight()
	{
		return weight;
	}
	void setdimensions(float width, float height,float depth, float weight)
	{
		super.setdimensions(width, height, depth);
		this.weight=weight;
	}
	void display()
	{
		float wa;
		wa= getwidth()*getheight()*getdepth()*getweight();
		System.out.println("The final answer is: " + wa);
	}
}