class test{
	public static void main(String[] args){
		Gear gear = new Gear(52,11,26,1.5);
		System.out.println(gear.gear_inches());
		Gear gear2 = new Gear(52,11,24,1.25);
		System.out.println(gear2.gear_inches());
	}
}
