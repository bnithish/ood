class Gear{
	private int chainring,cog,rim;
	private double tire;
	public int chainring(){
		return this.chainring;
	}
	public int cog(){
                return this.cog;
        }
	public int rim(){
                return this.rim;
        }
	public double tire(){
                return this.tire;
        }

	public Gear(int chainring,int cog,int rim,double tire){
		this.chainring = chainring;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}
	public double ratio(){
		return this.chainring()/(double)this.cog();
	}
	public double gear_inches(){
		return this.ratio() * this.diameter();
	}
	public double diameter(){
		return this.rim() + (2 * this.tire());
	}
}

