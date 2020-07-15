class test{
	public static void main(String[] args){
		Wheel wheel = new Wheel(26,1.5);
		Gear gear = new Gear(52,11,wheel);
		System.out.println(gear.gear_inches());
		System.out.println(gear.ratio());
	}
}
