
public class Gold extends Member{
	
	public Gold(int id,String name, int point) {
		super(id, name, point);
	}
	
	@Override
	public double getBonus() {
		return getPoint() * 0.03;
	}
}
