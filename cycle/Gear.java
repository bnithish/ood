class Gear{
	private int chainring,cog,wheel;
	public Gear(int chainring,int cog){
		this.chainring = chainring;
		this.cog = cog;
	}
	public float ratio(){
		return this.chainring/(float)this.cog;
	}
}

