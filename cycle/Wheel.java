class Wheel{
	private int rim;
	private double tire;
	public Wheel(int rim,double tire){
		this.rim = rim;
		this.tire = tire;
	}
	public int rim(){
                return this.rim;
        }
        public double tire(){
                return this.tire;
        }
	public double diameter(){
                return this.rim() + (2 * this.tire());
        }
}
