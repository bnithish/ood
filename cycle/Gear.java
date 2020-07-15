class Gear{
	private int chainring,cog,rim;
	private double tire;
	public Gear(int chainring,int cog,int rim,double tire){
		this.chainring = chainring;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}
	public double ratio(){
		return this.chainring/(double)this.cog;
	}
	public double gear_inches(){
		return this.ratio() * (this.rim + (this.tire * 2));
	}
}

