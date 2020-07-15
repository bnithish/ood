class Gear{
	private int chainring,cog;
	private Wheel wheel;
	public int chainring(){
		return this.chainring;
	}
	public int cog(){
                return this.cog;
        }
	public Wheel wheel(){
		return this.wheel;
	}
	public Gear(int chainring,int cog,Wheel wheel){
		this.chainring = chainring;
		this.cog = cog;
		this.wheel = wheel;
	}
	public double ratio(){
		return this.chainring()/(double)this.cog();
	}
	public double gear_inches(){
		return this.ratio() * this.wheel().diameter();
	}
}

